package com.inmobiliaria.inmobiliaria.services;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import com.inmobiliaria.inmobiliaria.exceptions.AlmacenException;
import com.inmobiliaria.inmobiliaria.exceptions.FileNotFoundException;

import jakarta.annotation.PostConstruct;

@Service
public class AlmacenServicesImpl implements AlmacenServices {

	@Value("${storage.location}")
	private String storageLocation;

	@PostConstruct
	@Override
	public void iniciarAlmacenDeArchivos() {
		try {
			Files.createDirectories(Paths.get(storageLocation));
		} catch (IOException e) {
			throw new AlmacenException("No se pudo crear el directorio");
		}
	}

	@Override
	public Resource cargarComoRecurso(String nombreArchivo) {
		try {
			Path archivo = cargarArchivos(nombreArchivo);
			Resource recurso = new UrlResource(archivo.toUri());
			if (recurso.exists() || recurso.isReadable()) {
				return recurso;
			} else {
				throw new FileNotFoundException("No se pudo encontrar el archivo " + nombreArchivo);
			}

		} catch (MalformedURLException exception) {
			throw new AlmacenException("No se pudo encontrar el archivo " + nombreArchivo, exception);
		}
	}

	@Override
	public Path cargarArchivos(String nombreArchivo) {
		return Paths.get(storageLocation).resolve(nombreArchivo);
	}

	@Override
	public void eliminarArchivo(String nombreArchivo) {
		Path archivo = cargarArchivos(nombreArchivo);
		try {
			FileSystemUtils.deleteRecursively(archivo);
		} catch (Exception exception) {
			exception.printStackTrace(System.out);
		}
	}

	@Override
	public void almacenarArchivos(String archivo, String nombreArchivo) {
		if (archivo.isEmpty()) {
			throw new AlmacenException("No se puede guardar un archivo sin nombre");
		}
		byte[] imagenByte = Base64.getDecoder().decode(archivo.getBytes());
		InputStream imagenStream = new ByteArrayInputStream(imagenByte);
		try {
			Files.copy(imagenStream, Paths.get(storageLocation).resolve(nombreArchivo),
					StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			throw new AlmacenException("Error al guardar archivo", e);
		}
	}

}

package com.inmobiliaria.inmobiliaria.services;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import com.inmobiliaria.inmobiliaria.exceptions.AlmacenException;

import jakarta.annotation.PostConstruct;

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
	public String almacenarArchivos(MultipartFile archivo) {
		String nombreArchivo = archivo.getOriginalFilename();
		if (nombreArchivo.isBlank())
			throw new AlmacenException("No se puede almacenar un archivo vacío");
		try {
			InputStream archivoStream = archivo.getInputStream();
			Files.copy(archivoStream, Paths.get(storageLocation).resolve(nombreArchivo),
					StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			throw new AlmacenException("No se puedo guardar el archivo con el nombre " + nombreArchivo);
		}
		return nombreArchivo;
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
}

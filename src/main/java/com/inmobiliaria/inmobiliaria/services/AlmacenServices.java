package com.inmobiliaria.inmobiliaria.services;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;
import java.nio.file.Path;

public interface AlmacenServices {

	public void iniciarAlmacenDeArchivos();

	public String almacenarArchivos(MultipartFile archivo);

	public Path cargarArchivos(String nombreArchivo);
	
	public void eliminarArchivo(String nombreArchivo);

}

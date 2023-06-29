package com.inmobiliaria.inmobiliaria.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inmobiliaria.inmobiliaria.models.publicacionEntity;
import com.inmobiliaria.inmobiliaria.services.publicacionServices;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping(value = "/api/publicacion")
@CrossOrigin("http://localhost:8080/")
public class publicacionController {

	@Autowired
	private publicacionServices publicacionService;

	@GetMapping("/all")
	public List<publicacionEntity> getAllPublicacion() {
		return publicacionService.getFindAll();
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@Transactional
	public publicacionEntity savePublicacion(@RequestBody publicacionEntity p) {
		return publicacionService.savePublicacion(p);
	}

	@GetMapping("/{dniUsuario}")
	public ResponseEntity<List<publicacionEntity>> getPublicacionByusuario(@PathVariable String dniUsuario) {
		List<publicacionEntity> publicacion = publicacionService.getPublicacionesByUsuario(dniUsuario);
		return ResponseEntity.ok(publicacion);
	}

	@GetMapping("/allCiudad")
	public List<String> getAllCiudad() {
		return publicacionService.getPublicacionesByCiudad();
	}

	@GetMapping("/allDistrito")
	public List<String> getAllDistrito() {
		return publicacionService.getPublicacionesByDistrito();
	}

	@GetMapping("/ciudad/distrito/{ciudad}")
	public ResponseEntity<Map<String, List<String>>> getAllCiudadDistrito(@PathVariable String ciudad) {
		Map<String, List<String>> ciudadesYDistritos = new HashMap<String, List<String>>();
		List<String> listaDistrito = publicacionService.getListDistritoByCiudad(ciudad);
		ciudadesYDistritos.put(ciudad, listaDistrito);
		return ResponseEntity.ok(ciudadesYDistritos);
	}

	@GetMapping("/find/id/{idPublicacion}")
	public ResponseEntity<?> getPublicacion(@PathVariable Long idPublicacion) {
		publicacionEntity publicacion = publicacionService.getByIdPublicacion(idPublicacion);
		if (publicacion == null) {
			Map<String, String> hasError = new HashMap<String, String>();
			hasError.put("error", "No se encontró esta publicación");
			return ResponseEntity.ok(hasError);
		}
		return ResponseEntity.ok(publicacion);
	}

	@GetMapping("/ciudad/{ciudad}")
	public List<publicacionEntity> getAllPublicacionByCiudad(@PathVariable String ciudad) {
		return publicacionService.findAllByCiudad(ciudad);
	}

	@GetMapping("/ciudad&distrito/{ciudad}/{distrito}")
	public List<publicacionEntity> getAllByCiudadDistrito(@PathVariable String ciudad, @PathVariable String distrito) {
		return publicacionService.findAllByCiudadAndDistrito(ciudad, distrito);
	}

	@GetMapping("tipoPublicacion/{tipo}")
	public List<publicacionEntity> getAllTipo(@PathVariable(name = "tipo") String tipoPublicacion) {
		return publicacionService.findAllByTipoPublicacion(tipoPublicacion);
	}

	@GetMapping("galeria/{tipoPublicacion}/{tipoInmueble}")
	public List<publicacionEntity> getAllByTipoPublicacionAndTipoInmueble(@PathVariable String tipoPublicacion,
			@PathVariable String tipoInmueble) {
		return publicacionService.findAllByTipoPublicacionAndTipoInmueble(tipoPublicacion, tipoInmueble);
	}

	@GetMapping("galeria/{tipoPublicacion}/{tipoInmueble}/{detalles}")
	public List<publicacionEntity> getAllByTipoPublicacionAndTipoInmueble(@PathVariable String tipoPublicacion,
			@PathVariable String tipoInmueble, @PathVariable String detalles) {
		return publicacionService.findAllByTipoPublicacionAndTipoInmuebleAndCiudad(tipoPublicacion, tipoInmueble,
				detalles);
	}
}

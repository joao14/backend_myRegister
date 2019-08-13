package com.myApp.myApp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myApp.myApp.dto.TbUser;
import com.myApp.myApp.repository.IUserDao;

@RestController
@RequestMapping("/test")
public class UsuarioController {

	@Autowired
	private IUserDao usuariodao;    

	@GetMapping(path = "/usuarios")
	List<TbUser> findAll() {
		List<TbUser> lstusuarios = new ArrayList<TbUser>();
		for (TbUser usuario : usuariodao.findAll()) {
			lstusuarios.add(usuario);
		}
		return lstusuarios;
	}

	@GetMapping(path = "/usuarios/{id}")
	TbUser findByUser(@PathVariable String id) {
		TbUser usuario = null;
		Optional<TbUser> usuarioOptional = usuariodao.findById(id);
		if (usuarioOptional.isPresent()) {
			usuario = usuarioOptional.get();
		}
		return usuario;
	}

	@PostMapping(path = "/usuarios/create")
	String createUser(@RequestBody TbUser tbUser) {
		System.out.println("Usted esta tratando de ingresar un nuevo usuario");
		System.out.println(tbUser.getUserIdentification());
		usuariodao.save(tbUser);
		return "Se ha guardado correctamente el nuevo usuario";
	}

	@PostMapping(path = "/usuarios/delete/{id}")
	String deleteUser(@PathVariable String id) {   
		usuariodao.deleteById(id);
		return "Se ha eliminado correctamente el usuario";
	}

}

package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	// @Query("select distinct x.idUsuario from Usuario x order by 1 asc")
	// public abstract List<Usuario> listaUsuario();

}

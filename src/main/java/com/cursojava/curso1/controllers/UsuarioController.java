package com.cursojava.curso1.controllers;

//manejar direcciones url
//encargados de returnar algo según la direccion
//empresa.com/contacto devuelve algo diferente a empresa.com

import com.cursojava.curso1.dao.UsuarioDao;
import com.cursojava.curso1.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {

    @RequestMapping (value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable String id) {
        Usuario usuario=new Usuario();
        usuario.setNombre("yei");
        usuario.setApellido("pat");
        usuario.setTelefono("302");
        usuario.setCorreo("@gmail");
        usuario.setPassword("123.45");
        return usuario;
    }

    @RequestMapping (value = "usuarios")
    public List<Usuario> getUsuarios() {

        List<Usuario> usuarios=new ArrayList<>();
        Usuario usuario=new Usuario();
        usuario.setId(123L);
        usuario.setNombre("yei");
        usuario.setApellido("pat");
        usuario.setTelefono("302");
        usuario.setCorreo("@gmail");
        usuario.setPassword("123.45");

        Usuario usuario2=new Usuario();
        usuario2.setId(456L);
        usuario2.setNombre("yei");
        usuario2.setApellido("pat");
        usuario2.setTelefono("302");
        usuario2.setCorreo("@gmail");
        usuario2.setPassword("123.45");

        Usuario usuario3=new Usuario();
        usuario3.setId(789L);
        usuario3.setNombre("yei");
        usuario3.setApellido("pat");
        usuario3.setTelefono("302");
        usuario3.setCorreo("@gmail");
        usuario3.setPassword("123.45");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

    @RequestMapping (value = "usuario/2")
    public Usuario editar(@PathVariable String id) {
        Usuario usuario=new Usuario();
        usuario.setNombre("yei");
        usuario.setApellido("pat");
        usuario.setTelefono("302");
        usuario.setCorreo("@gmail");
        usuario.setPassword("123.45");
        return usuario;
    }
    @RequestMapping (value = "usuario/3")
    public Usuario eliminar(@PathVariable String id) {
        Usuario usuario=new Usuario();
        usuario.setNombre("yei");
        usuario.setApellido("pat");
        usuario.setTelefono("302");
        usuario.setCorreo("@gmail");
        usuario.setPassword("123.45");
        return usuario;
    }
    @RequestMapping (value = "usuario/4")
    public Usuario buscar(@PathVariable long id) {
        Usuario usuario=new Usuario();
        usuario.setId(id);
        usuario.setNombre("yei");
        usuario.setApellido("pat");
        usuario.setTelefono("302");
        usuario.setCorreo("@gmail");
        usuario.setPassword("123.45");
        return usuario;
    }


}

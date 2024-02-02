package com.cursojava.curso1.dao;

import com.cursojava.curso1.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    //archivo en el que indicamos que funciones deberia tener una clase
    //y si la clase implementa esta interface obliga a implementar esas funciones

    List<Usuario> getUsuarios();

}

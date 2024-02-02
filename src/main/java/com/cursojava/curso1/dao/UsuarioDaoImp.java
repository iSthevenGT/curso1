package com.cursojava.curso1.dao;

import com.cursojava.curso1.models.Usuario; 
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository //funcionalidad de acceder a la base de datos
@Transactional /*<groupId>org.springframework.boot</groupId>
    		<artifactId>spring-boot-starter-data-jpa</artifactId>*/ //dependencia necesaria
//como va armar y ejecutar querys

public class UsuarioDaoImp implements UsuarioDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
       String query = "FROM Usuario";
       return entityManager.createQuery(query).getResultList(); 
       
    }
}

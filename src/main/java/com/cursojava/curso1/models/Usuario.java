package com.cursojava.curso1.models;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@javax.persistence.Entity
@Table(name="usuarios")
public class Usuario {

    /*<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>1.18.30</version>
			<scope>proporcionado</scope>
		</dependency>*/

    @Id
    @Getter @Setter @Column(name="id")
    private long id;

    @Getter@Setter  @Column(name="nombre")
    private String nombre;

    @Getter@Setter  @Column(name="apellido")
    private String apellido;

    @Getter@Setter @Column(name="telefono")
    private String telefono;

    @Getter@Setter @Column(name="correo")
    private String correo;

    @Getter @Setter @Column(name="password")
    private String password;

}

package com.recursos_educativos.cl.recursos_educativos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "pdf")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PDF {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;

    @Column(nullable = true)
    private String descripcion;

    @Column(nullable = true)
    private String archivo; // Podría ser un nombre de archivo o ruta del archivo en el servidor

    @Column(nullable = true)
    private String url; // Si está disponible online

    @Temporal(TemporalType.DATE)
    private Date fechaPublicacion;
}

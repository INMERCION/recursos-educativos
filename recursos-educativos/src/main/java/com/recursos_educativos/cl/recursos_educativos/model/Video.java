package com.recursos_educativos.cl.recursos_educativos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "video")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
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
    private String urlVideo; // Enlace al video (por ejemplo, un enlace de YouTube o similar)

    @Column(nullable = true)
    private String formato; // MP4, AVI, etc.

    @Temporal(TemporalType.DATE)
    private Date fechaPublicacion;
}

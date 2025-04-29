package com.recursos_educativos.cl.recursos_educativos.repository;

import com.recursos_educativos.cl.recursos_educativos.model.PDF;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PDFRepository extends JpaRepository<PDF, Long> {
    List<PDF> findByAutor(String autor);
    List<PDF> findByTituloContainingIgnoreCase(String titulo);
}


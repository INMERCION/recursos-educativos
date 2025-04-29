package com.recursos_educativos.cl.recursos_educativos.repository;

import com.recursos_educativos.cl.recursos_educativos.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    List<Video> findByAutor(String autor);
    List<Video> findByTituloContainingIgnoreCase(String titulo);
}

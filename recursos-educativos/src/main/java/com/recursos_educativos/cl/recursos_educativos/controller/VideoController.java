package com.recursos_educativos.cl.recursos_educativos.controller;

import com.recursos_educativos.cl.recursos_educativos.model.Video;
import com.recursos_educativos.cl.recursos_educativos.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping
    public ResponseEntity<List<Video>> listar() {
        List<Video> videos = videoService.findAll();
        if (videos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(videos);
    }

    @PostMapping
    public ResponseEntity<Video> guardar(@RequestBody Video video) {
        Video nuevoVideo = videoService.save(video);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoVideo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Video> buscar(@PathVariable Long id) {
        Video video = videoService.findById(id);
        if (video == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(video);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        videoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

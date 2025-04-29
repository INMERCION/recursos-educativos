package com.recursos_educativos.cl.recursos_educativos.service;

import com.recursos_educativos.cl.recursos_educativos.model.Video;
import com.recursos_educativos.cl.recursos_educativos.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.NoSuchElementException;

@Service
public class VideoService {
    @Autowired
    private VideoRepository videoRepository;

    public List<Video> findAll() {
        return videoRepository.findAll();
    }

    public Video save(Video video) {
        return videoRepository.save(video);
    }

    public Video findById(Long id) {
        return videoRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        videoRepository.deleteById(id);
    }
}


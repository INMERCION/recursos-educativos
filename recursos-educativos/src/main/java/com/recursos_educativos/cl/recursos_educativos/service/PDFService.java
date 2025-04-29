package com.recursos_educativos.cl.recursos_educativos.service;

import com.recursos_educativos.cl.recursos_educativos.model.PDF;
import com.recursos_educativos.cl.recursos_educativos.repository.PDFRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.NoSuchElementException;

@Service
public class PDFService {
    @Autowired
    private PDFRepository pdfRepository;

    public List<PDF> findAll() {
        return pdfRepository.findAll();
    }

    public PDF save(PDF pdf) {
        return pdfRepository.save(pdf);
    }

    public PDF findById(Long id) {
        return pdfRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        pdfRepository.deleteById(id);
    }
}


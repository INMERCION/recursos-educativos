package com.recursos_educativos.cl.recursos_educativos.controller;

import com.recursos_educativos.cl.recursos_educativos.model.PDF;
import com.recursos_educativos.cl.recursos_educativos.service.PDFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pdf")
public class PDFController {

    @Autowired
    private PDFService pdfService;

    @GetMapping
    public ResponseEntity<List<PDF>> listar() {
        List<PDF> pdfs = pdfService.findAll();
        if (pdfs.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(pdfs);
    }

    @PostMapping
    public ResponseEntity<PDF> guardar(@RequestBody PDF pdf) {
        PDF nuevoPDF = pdfService.save(pdf);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoPDF);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PDF> buscar(@PathVariable Long id) {
        PDF pdf = pdfService.findById(id);
        if (pdf == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pdf);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        pdfService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

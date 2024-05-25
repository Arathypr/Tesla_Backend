package com.Tesla.demo.controller;

import com.Tesla.demo.Entity.ImageDetails;
import com.Tesla.demo.service.ImageDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/image-details")
public class ImageDetailsController {

    @Autowired
    private ImageDetailsService imageDetailsService;

    @GetMapping("/{id}")
    public ResponseEntity<ImageDetails> getImageDetailsById(@PathVariable Long id) {
        ImageDetails imageDetails = imageDetailsService.getImageDetailsById(id);
        return ResponseEntity.ok(imageDetails);
    }

    @GetMapping
    public ResponseEntity<List<ImageDetails>> getAllImageDetails() {
        List<ImageDetails> imageDetailsList = imageDetailsService.getAllImageDetails();
        return ResponseEntity.ok(imageDetailsList);
    }

    @PostMapping
    public ResponseEntity<ImageDetails> createImageDetails(@RequestBody ImageDetails imageDetails) {
        ImageDetails createdImageDetails = imageDetailsService.saveImageDetails(imageDetails);
        return ResponseEntity.ok(createdImageDetails);
    }
}

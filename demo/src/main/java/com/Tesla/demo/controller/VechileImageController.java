package com.Tesla.demo.controller;
import com.Tesla.demo.Entity.VechileImage;
import com.Tesla.demo.service.VechileImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/vechile-images")
public class VechileImageController {

    @Autowired
    private VechileImageService vechileImageService;

    @GetMapping("/{id}")
    public ResponseEntity<VechileImage> getVechileImageById(@PathVariable Long id) {
        VechileImage vechileImage = vechileImageService.getVechileImageById(id);
        return ResponseEntity.ok(vechileImage);
    }

    @GetMapping
    public ResponseEntity<List<VechileImage>> getAllVechileImages() {
        List<VechileImage> vechileImageList = vechileImageService.getAllVechileImages();
        return ResponseEntity.ok(vechileImageList);
    }

    @PostMapping
    public ResponseEntity<String> createVechileImage(
            @RequestParam("image") MultipartFile file,
            @RequestParam(value = "vechileId", required = false) Long vechileId) {

        try {
            // Basic validation (optional)
            if (file.isEmpty()) {
                return ResponseEntity.badRequest().body("Image file is empty");
            }

            VechileImage vechileImage = new VechileImage();
            vechileImage.setImage(file.getBytes());
            vechileImage.setVechileId(vechileId);
            VechileImage createdVechileImage = vechileImageService.saveVechileImage(vechileImage);
            return ResponseEntity.ok(createdVechileImage.toString());
        } catch (IOException e) {
            // Handle the IOException
            e.printStackTrace(); // Log the exception or handle it as per your application's requirements
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while processing the image file");
        }
    }
}// Closing curly brace for the Controller class
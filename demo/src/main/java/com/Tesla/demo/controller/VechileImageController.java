package com.Tesla.demo.controller;




import com.Tesla.demo.Entity.VechileImage;
import com.Tesla.demo.service.VechileImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}

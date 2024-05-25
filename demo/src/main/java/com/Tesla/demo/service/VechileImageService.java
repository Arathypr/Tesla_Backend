package com.Tesla.demo.service;



import com.Tesla.demo.Entity.VechileImage;
import java.util.List;

public interface VechileImageService {
    VechileImage getVechileImageById(Long id);
    List<VechileImage> getAllVechileImages();
}


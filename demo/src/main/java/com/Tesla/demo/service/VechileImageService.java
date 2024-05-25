package com.Tesla.demo.service;


import com.Tesla.demo.Entity.VechileImage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VechileImageService {
    VechileImage getVechileImageById(Long id);
    List<VechileImage> getAllVechileImages();
    VechileImage saveVechileImage(VechileImage vechileImage);
}

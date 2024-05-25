package com.Tesla.demo.service;

import com.Tesla.demo.Entity.ImageDetails;
import java.util.List;

public interface ImageDetailsService {
    ImageDetails getImageDetailsById(Long id);
    List<ImageDetails> getAllImageDetails();
}

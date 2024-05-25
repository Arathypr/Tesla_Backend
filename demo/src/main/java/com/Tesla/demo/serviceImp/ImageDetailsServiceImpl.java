package com.Tesla.demo.serviceImp;


import com.Tesla.demo.Entity.ImageDetails;
import com.Tesla.demo.repo.ImageDetailsRepository;
import com.Tesla.demo.service.ImageDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageDetailsServiceImpl implements ImageDetailsService {

    @Autowired
    private ImageDetailsRepository imageDetailsRepository;

    @Override
    public ImageDetails getImageDetailsById(Long id) {
        return imageDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public List<ImageDetails> getAllImageDetails() {
        return imageDetailsRepository.findAll();
    }
}

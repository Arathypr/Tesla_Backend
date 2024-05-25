package com.Tesla.demo.serviceImp;

import com.Tesla.demo.Entity.VechileImage;
import com.Tesla.demo.repo.VechileImageRepository;
import com.Tesla.demo.service.VechileImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VechileImageServiceImpl implements VechileImageService {

    @Autowired
    private VechileImageRepository vechileImageRepository;

    @Override
    public VechileImage getVechileImageById(Long id) {
        return vechileImageRepository.findById(id).orElse(null);
    }

    @Override
    public List<VechileImage> getAllVechileImages() {
        return vechileImageRepository.findAll();
    }

    @Override
    public VechileImage saveVechileImage(VechileImage vechileImage) {
        return vechileImageRepository.save(vechileImage);
    }
}
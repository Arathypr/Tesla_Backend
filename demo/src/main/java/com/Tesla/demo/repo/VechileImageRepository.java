package com.Tesla.demo.repo;


import com.Tesla.demo.Entity.VechileImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VechileImageRepository extends JpaRepository<VechileImage, Long> {
}

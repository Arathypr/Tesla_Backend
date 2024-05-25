package com.Tesla.demo.repo;



import com.Tesla.demo.Entity.ImageDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageDetailsRepository extends JpaRepository<ImageDetails, Long> {
}

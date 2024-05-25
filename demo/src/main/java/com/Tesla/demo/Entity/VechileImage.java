package com.Tesla.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VechileImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vechicleImageId;
    private byte[] image;
    private Long vechileId; // Field for vehicle ID

    // Getters and setters
    public Long getVechicleImageId() {
        return vechicleImageId;
    }

    public void setVechicleImageId(Long vechicleImageId) {
        this.vechicleImageId = vechicleImageId;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Long getVechileId() {
        return vechileId;
    }

    public void setVechileId(Long vechileId) {
        this.vechileId = vechileId;
    }
}
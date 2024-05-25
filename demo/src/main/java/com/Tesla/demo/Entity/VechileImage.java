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
    private Byte image;

    // Getters and setters (or use Lombok @Data annotation if preferred)
    public Long getVechicleImageId() {
        return vechicleImageId;
    }

    public void setVechicleImageId(Long vechicleImageId) {
        this.vechicleImageId = vechicleImageId;
    }

    public Byte getImage() {
        return image;
    }

    public void setImage(Byte image) {
        this.image = image;
    }
}

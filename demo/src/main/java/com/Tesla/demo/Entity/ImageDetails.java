package com.Tesla.demo.Entity;

import java.util.ArrayList;

import java.util.List;

import org.springframework.lang.NonNull;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "imageDetails")
public class ImageDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vechileId;

    @NonNull
    private String tittle;
    private String description;

    @OneToMany(targetEntity = VechileImage.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "vechileId", referencedColumnName = "vechileId")
    private List<VechileImage> vechileImage = new ArrayList<>();

    // Constructors, getters, and setters (or use Lombok @Data annotation)
    public ImageDetails() {
    }

    public long getVechileId() {
        return vechileId;
    }

    public void setVechileId(long vechileId) {
        this.vechileId = vechileId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<VechileImage> getVechileImage() {
        return vechileImage;
    }

    public void setVechileImage(List<VechileImage> vechileImage) {
        this.vechileImage = vechileImage;
    }
}

package com.example.myproject_productservice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@MappedSuperclass
public class BaseModel {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date CreatedAt;
    private Date LastModifiedAt;
    private boolean isDeleted;

    public Date getLastModifiedAt() {
        return this.LastModifiedAt;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCreatedAt(Date CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public void setLastModifiedAt(Date LastModifiedAt) {
        this.LastModifiedAt = LastModifiedAt;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}

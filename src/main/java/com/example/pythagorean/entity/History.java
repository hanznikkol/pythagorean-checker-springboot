package com.example.pythagorean.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "inputValue",nullable = false)
    private Long inputValue;

    private Integer a;
    private Integer b;
    private Integer c;

    private Double avg;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();


    //Getters and Setters
    public Long getId() {
        return id;
    }

    public Long getInputValue() {
        return inputValue;
    }
    public void setInputValue(Long inputValue) {
        this.inputValue = inputValue;
    }

    public Integer getA() {
        return a;
    }
    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }
    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }
    public void setC(Integer c) {
        this.c = c;
    }

    public Double getAvg() {
        return avg;
    }
    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createAt) {
        this.createdAt = createAt;
    }
}

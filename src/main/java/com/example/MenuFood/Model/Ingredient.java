package com.example.MenuFood.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "calories", nullable = false)
    private float calories;
    @Column(name = "protein", nullable = false)
    private float protein;
    @Column(name = "sugar", nullable = false)
    private float sugar;
    @Column(name = "allergens", nullable = false)
    private String allergens;

}
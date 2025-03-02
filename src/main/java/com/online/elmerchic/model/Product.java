package com.online.elmerchic.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false , unique = true)
    private Long id;

    @Column(name="name",nullable = false ,  unique = true)
    private String name;

    @Column(name="short_description", nullable = false)
    private String shortDescription;

    @Column(name="long_description")
    private String longDescription;

    @Column(name = "price", nullable = false)
    private Double price;


}

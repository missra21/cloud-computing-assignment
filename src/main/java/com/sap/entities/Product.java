package com.sap.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String unitOfMeasure;

    @Column(nullable = false)
    private int stockLevel;

    @Column(nullable = false)
    private int minimumStockLevel;

    @Column(nullable = false)
    private int reorderPoint;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Receipt> receiptHistory;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Issue> issueHistory;

}

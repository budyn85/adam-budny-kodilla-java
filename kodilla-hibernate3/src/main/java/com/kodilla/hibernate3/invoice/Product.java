package com.kodilla.hibernate3.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "products")
public class Product {
    private int id;
    private String name;

    protected Product() {
    }

    public Product(final String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    private void setId(final int id) {
        this.id = id;
    }

    private void setName(final String name) {
        this.name = name;
    }
}

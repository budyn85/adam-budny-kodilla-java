package com.kodilla.hibernate3.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    private int id;
    private String name;
    private List<Item> items=new ArrayList<>();

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

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    private void setId(final int id) {
        this.id = id;
    }

    private void setName(final String name) {
        this.name = name;
    }

    private void setItems(List<Item> items) {
        this.items = items;
    }
}

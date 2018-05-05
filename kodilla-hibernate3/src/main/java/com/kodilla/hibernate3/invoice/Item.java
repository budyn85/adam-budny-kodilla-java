package com.kodilla.hibernate3.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Entity
@Table(name = "items")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    protected Item() {
    }

    public Item(final Product product, final BigDecimal price, final int quantity, final Invoice invoice) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = price.multiply(new BigDecimal(quantity));
        this.invoice = invoice;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "PRODUCT")
    public Product getProduct() {
        return product;
    }

    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @NotNull
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @NotNull
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INVOICE")
    public Invoice getInvoice() {
        return invoice;
    }

    private void setId(final int id) {
        this.id = id;
    }

    private void setProduct(final Product product) {
        this.product = product;
    }

    private void setPrice(final BigDecimal price) {
        this.price = price;
    }

    private void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    private void setValue(final BigDecimal value) {
        this.value = value;
    }

    public void setInvoice(final Invoice invoice) {
        this.invoice = invoice;
    }
}

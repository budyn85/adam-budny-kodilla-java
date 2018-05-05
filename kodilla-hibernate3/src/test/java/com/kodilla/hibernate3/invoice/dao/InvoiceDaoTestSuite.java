package com.kodilla.hibernate3.invoice.dao;

import com.kodilla.hibernate3.invoice.Invoice;
import com.kodilla.hibernate3.invoice.Item;
import com.kodilla.hibernate3.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testSaveManyToMany() {
        //Given

        Invoice invoice1 = new Invoice("FA1234");
        Invoice invoice2 = new Invoice("FA1235");
        Invoice invoice3 = new Invoice("FA1434");
        Product product = new Product("Bicycle");
        Item wheel = new Item(product,new BigDecimal(10), 2, new BigDecimal(2),invoice1);
        Item seat = new Item(product,new BigDecimal(10), 2, new BigDecimal(2),invoice2);
        Item brake = new Item(product,new BigDecimal(10), 2, new BigDecimal(2),invoice3);
        product.getItems().add(wheel);
        product.getItems().add(seat);
        product.getItems().add(brake);
        invoice1.getItems().add(wheel);
        invoice2.getItems().add(seat);
        invoice3.getItems().add(brake);

        //When
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        invoiceDao.save(invoice3);
        productDao.save(product);
        itemDao.save(wheel);
        itemDao.save(seat);
        itemDao.save(brake);

        //Then
        Item item=itemDao.findOne(wheel.getId());
        Assert.assertEquals(wheel.getValue(),item.getValue());

        //CleanUp
        itemDao.deleteAll();
        productDao.deleteAll();
        invoiceDao.deleteAll();

    }
}

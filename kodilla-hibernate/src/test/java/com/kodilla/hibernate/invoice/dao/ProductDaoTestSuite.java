package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDaoTestSuite {
    @Autowired
    ProductDao productDao;

    @Test
    public void testProductDaoSave() {
        //Given
        Item item = new Item(new BigDecimal("9.99"), 10);
        Product niceProduct = new Product("Nice");
        niceProduct.getItems().add(item);
        item.setProduct(niceProduct);

        //When
        productDao.save(niceProduct);
        int id = niceProduct.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        productDao.delete(id);
    }
}

package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemDaoTestSuite {
    @Autowired
    ItemDao itemDao;

    @Test
    public void testItemDaoSave() {
        //Given
        Item item = new Item(new BigDecimal("9.99"), 10);

        //When
        itemDao.save(item);
        int id = item.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        itemDao.delete(id);
    }
   }

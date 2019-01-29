/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patryk
 */
public class BasketTest {

    Basket b = new Basket();
    Product p;

    @Test(expected = IllegalArgumentException.class)
    public void test1() {
        p = new Product("", 5);
        assertEquals("", p.getName());
    }
    
    @Test
    public void test2() {
        p = new Product("Butter", 5);
        assertEquals("Butter", p.getName());
    }
    
    @Test
    public void test3() {
        p = new Product("Butter", 5);
        assertEquals(5, p.getPrice(), 0.01);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test4() {
        b.addProduct(null);
    }

}

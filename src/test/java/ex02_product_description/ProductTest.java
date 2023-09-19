package ex02_product_description;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void productDescription_happyflow() {

        Product p = new Product("name", 33, 6.3);
        assertEquals(" - 33CL 6.3%", p.productDescription());

    }

    @Test
    void productDescription_wholeNum_noDecimal() {

        Product p = new Product("name", 33, 5.0);
        assertEquals(" - 33CL 5%", p.productDescription());

    }

    @Test
    void productDescription_size_null() {

        Product p = new Product("name", null, 5.0);
        assertEquals("", p.productDescription());

    }

    @Test
    void productDescription_percentage_null() {

        Product p = new Product("name", 33, null);
        assertEquals("", p.productDescription());

    }

    @Test
    void productDescription_both_null() {

        Product p = new Product("name", null, null);
        assertEquals("", p.productDescription());

    }

}
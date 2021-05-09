package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Trim;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    public void shouldCheckMatchesWhenNameTrue() {
        Product product = new Product(1, "Redmi 9C", 9690);
        boolean actual = product.matches("Red");
        assertEquals(true, actual);
    }

    @Test
    public void shouldCheckMatchesWhenNameFalse() {
        Product product = new Product(1, "Cien anos de soledad", 999);
        boolean actual = product.matches("del mar");
        assertEquals(false, actual);
    }
}
package com.vinicius_grandi.chapter2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @DisplayName("verify person's name")
    @Test
    void name() {
        Person person = new Person();
        person.setName("Bob Smith");
        assertEquals("Bob Smith", person.getName());
    }
}
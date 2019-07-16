package com.owlbg;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;

public class AppTest {
    private static PhoneBook phoneBook;

    @BeforeClass
    public static void initializePhoneBook() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void missingFioPhonesTest() {
        List<String> missingFioPhones = phoneBook.findPhones("Неизвестный");
        assertThat("Для отсутствующего ФИО должен возвращаться null", missingFioPhones, equalTo(null));
    }

    @Test
    public void ivanovPhonesTests() {
        List<String> ivanovPhones = phoneBook.findPhones("Иванов И.И.");
        assertThat("У Иванова должно быть 2 телефона", ivanovPhones.size(), equalTo(2));
        assertThat("У Иванова должен быть телефон +8 800 200 600", ivanovPhones, hasItem("+8 800 200 600"));
    }
}

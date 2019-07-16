package com.owlbg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out, true);
        PhoneBook phoneBook = new PhoneBook();

        output.println("Введите ФИО");
        String fio = input.readLine();
        List<String> phones = phoneBook.findPhones(fio);

        if (phones == null) {
            output.println("Указанного ФИО нет в базе данных");
        } else {
            int phoneOrder = 0;
            for (String phone : phones) {
                output.println(String.format("%d. %s", ++phoneOrder, phone));
            }
        }
    }
}

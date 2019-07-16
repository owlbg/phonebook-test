package com.owlbg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> data;

    public PhoneBook() {
        data = new HashMap<>();

        List<String> ivanovPhones = new ArrayList<>();
        ivanovPhones.add("+8 800 2000 500");
        ivanovPhones.add("+8 800 200 600");
        data.put("Иванов И.И.", ivanovPhones);

        List<String> petrovPhones = new ArrayList<>();
        petrovPhones.add("+8 800 2000 700");
        data.put("Петров П.П.", petrovPhones);

        List<String> sidorovPhones = new ArrayList<>();
        sidorovPhones.add("+8 800 2000 800");
        sidorovPhones.add("+8 800 2000 900");
        sidorovPhones.add("+8 800 2000 000");
        data.put("Сидоров С.С.", sidorovPhones);
    }

    public List<String> findPhones(String fio) {
        return data.get(fio);
    }
}

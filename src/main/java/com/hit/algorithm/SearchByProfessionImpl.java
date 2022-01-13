package com.hit.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SearchByProfessionImpl implements IAlgoSearch {

    @Override
    public List<Person> search(List<Person> l, int minAge, int maxAge, String profession, int YOE) {
        List<Person> result = new ArrayList<Person>();
        for (Person p : l) {
            if (p.profession.equalsIgnoreCase(profession)) {
                result.add(p);
            }
        }
        return result;
    }

}
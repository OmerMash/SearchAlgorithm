package com.hit.algorithm;

import java.util.ArrayList;
import java.util.List;

//YOE = years of experience
public class SearchByMinYOEImpl implements IAlgoSearch {

    @Override
    public List<Person> search(List<Person> l, int minAge, int maxAge, String profession, int minYOE) {
        List<Person> result = new ArrayList<Person>();
        for (Person p : l) {
            if (p.experience_y >= minYOE) {
                result.add(p);
            }
        }
        return result;
    }

}
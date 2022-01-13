package com.hit.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SearchByAgeImpl implements IAlgoSearch{
    @Override
    public List<Person> search(List<Person> l, int minAge, int maxAge, String profession, int YOE) {
        List<Person> result = new ArrayList<Person>();
        for(Person p : l){
            if(p.age >= minAge && p.age <= maxAge){
                result.add(p);
            }
        }
        return result;
    }

}

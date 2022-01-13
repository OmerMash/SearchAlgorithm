package com.hit.algorithm;

import com.hit.algorithm.Person;
import com.hit.algorithm.SearchByAgeImpl;
import com.hit.algorithm.SearchByMinYOEImpl;
import com.hit.algorithm.SearchByProfessionImpl;
import org.junit.jupiter.api.BeforeAll;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IAlgoSearchTest {
    static List<Person> l = new ArrayList<Person>();
    private final static int min_years_of_experience = 5;
    private final static int MAX_YEARS_OF_EXPERIENCE = 10;
    @BeforeAll
    static void setUp() {
        Person p1 = new Person("omer1", 5, "123456789", "QA", 1);
        Person p2 = new Person("omer2", 10, "123456789", "Dev", 2);
        Person p3 = new Person("omer3", 20, "123456789", "developer", 3);
        Person p4 = new Person("omer4", 21, "123456789", "DevOps", 4);
        Person p5 = new Person("omer5", 30, "123456789", "IT", 5);
        Person p6 = new Person("omer6", 35, "123456789", "Sales", 6);
        Person p7 = new Person("omer7", 40, "123456789", "Developer", 7);
        Person p8 = new Person("omer8", 45, "123456789", "HR", 8);
        Person p9 = new Person("omer9", 50, "123456789", "designer", 9);
        Person p10 = new Person("omer10", 60, "123456789", "OPS", MAX_YEARS_OF_EXPERIENCE);

        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);
        l.add(p5);
        l.add(p6);
        l.add(p7);
        l.add(p8);
        l.add(p9);
        l.add(p10);
    }

    // Search by age
    @org.junit.jupiter.api.Test
    void specificAgeTest() {
        SearchByAgeImpl sba = new SearchByAgeImpl();
        List<Person> l1 = sba.search(l, 5,5, "", 5);
        for(Person p : l1){
            assertEquals(5,p.getAge());
        }
    }

    @org.junit.jupiter.api.Test
    void ageInRangeTest() {
        SearchByAgeImpl sba = new SearchByAgeImpl();
        List<Person> l1 = sba.search(l, 5,10, "", 5);
        for(Person p : l1){
            assertTrue(p.getAge()>=5 && p.getAge()<=10);
        }
    }

    @org.junit.jupiter.api.Test
    void impossibleAgeRangeTest() {
        SearchByAgeImpl sba = new SearchByAgeImpl();
        List<Person> l1 = sba.search(l, 10,5, "", 5);
        assertEquals(0,l1.size());
        }

    // Search by profession
    @org.junit.jupiter.api.Test
    void professionTest() {
        SearchByProfessionImpl sbp = new SearchByProfessionImpl();
        List<Person> l1 = sbp.search(l, 5,5, "dev",  5);
        for(Person p : l1){
            assertTrue(p.getProfession().equalsIgnoreCase("dEv"));
        }
    }

    @org.junit.jupiter.api.Test
    void noSuchProfessionTest() {
        SearchByProfessionImpl sbp = new SearchByProfessionImpl();

        List<Person> l1 = sbp.search(l, 5,5, "pirate",  5);
        assertEquals(0,l1.size());

        List<Person> l2 = sbp.search(l, 5,5, "DEVELOPER",  5);
        assertEquals(2,l2.size());

        List<Person> l3 = sbp.search(l, 5,5, "Dev",  5);
        assertEquals(1,l3.size());
    }

    // Search by min years of experience
    @org.junit.jupiter.api.Test
    void minYOETest() {
        SearchByMinYOEImpl sbmyoe = new SearchByMinYOEImpl();
//        int min_years_of_experience = 5;
        List<Person> l1 = sbmyoe.search(l, 5,10, "", min_years_of_experience);
        if(l1.size() > 0){
            for(Person p : l1){
                assertTrue(p.getExperience_y() >= min_years_of_experience);
            }
        }
    }

    @org.junit.jupiter.api.Test
    void minYOElistTest() {
        SearchByMinYOEImpl sbmyoe = new SearchByMinYOEImpl();
        List<Person> l1 = sbmyoe.search(l, 5,10, "", min_years_of_experience);
        if(l1.size() > 0){
            for(Person p : l1){
                assertEquals(min_years_of_experience - 1,MAX_YEARS_OF_EXPERIENCE - l1.size());
            }
        }
    }


}





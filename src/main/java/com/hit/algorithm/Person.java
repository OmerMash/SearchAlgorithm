package com.hit.algorithm;

import java.io.Serializable;

public class Person implements Serializable {

    public int personCounter = 0;
    public int age;
    String ID;
    String name;
    String profession;
    int experience_y;

    @Override
    public String toString() {
        return ID + " " + name + " " + age + " " + profession + " " + experience_y;
    }
    public int getAge(){ return  age; }
    public String getProfession(){ return  profession; }
    public int getExperience_y(){ return  experience_y; }

    public Person(String full_name_tf, int age_tf, String id_tf, String profession_tf, int YOE_tf ) {
        name = full_name_tf;
        age = age_tf;
        ID = id_tf;
        profession = profession_tf;
        experience_y = YOE_tf;
        personCounter++;
    }

}

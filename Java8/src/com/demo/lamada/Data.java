package com.demo.lamada;

import java.util.Arrays;
import java.util.List;

import com.demo.entity.PersonModel;

public class Data {
    private static List<PersonModel> list = null;

    static {
        PersonModel wu = new PersonModel("wu qi", 18, "ÄÐ");
        PersonModel zhang = new PersonModel("zhang san", 19, "ÄÐ");
        PersonModel wang = new PersonModel("wang si", 20, "Å®");
        PersonModel zhao = new PersonModel("zhao wu", 20, "ÄÐ");
        PersonModel chen = new PersonModel("chen liu", 21, "ÄÐ");
        list = Arrays.asList(wu, zhang, wang, zhao, chen);
    }

    public static List<PersonModel> getData() {
        return list;
    }
}

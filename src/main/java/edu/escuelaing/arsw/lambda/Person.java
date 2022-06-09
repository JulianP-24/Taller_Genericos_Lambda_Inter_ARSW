package edu.escuelaing.arsw.lambda;

import java.time.LocalDate;

public class Person {
    public enum Sex {
        MALE, FEMALE, OTHER
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    public int getAge() {
        return 0;
    }
    public void printPerson() {
        System.out.println("Name: " + name);
    }
}

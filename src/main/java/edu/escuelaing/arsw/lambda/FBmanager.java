package edu.escuelaing.arsw.lambda;

import java.util.ArrayList;
import java.util.List;

public class FBmanager {
    public static void main(String args[]){
        List<Person> personas = new ArrayList<Person>();
        printPersons(personas, new CheckPersonEligibleForSelectiveService());
        printPersons(personas, (Person p) -> p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 29);
    }

    public static void printPersonsOlderThan(List<Person> lista, int age) {
        for (Person p : lista) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithinAgeRange(List<Person> lista, int low, int high) {
        for (Person p : lista) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    public static void printPersons(
    List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}

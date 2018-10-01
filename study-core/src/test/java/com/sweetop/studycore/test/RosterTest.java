package com.sweetop.studycore.test;

import com.sweetop.studycore.nestedclass.Person;
import com.sweetop.studycore.nestedclass.Roster;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/17
 * Time: 下午5:59
 * To change this template use File | Settings | File Templates.
 */
public class RosterTest {
    private static List<Person> roster;

    @BeforeClass
    public static void setup() {
        roster = Person.createRoster();
    }

    @Test
    public void testPrintPersonsOlderThan() {
        System.out.println("Persons older than 20:");
        Roster.printPersonsOlderThan(roster, 20);
    }

    @Test
    public void testPrintPersonsWithinAgeRange() {
        System.out.println("Persons between the ages of 14 and 30:");
        Roster.printPersonsWithinAgeRange(roster, 14, 30);
    }

    @Test
    public void testPrintPersons() {
        System.out.println("Persons who are eligible for Selective Service:");
        class CheckPersonEligibleForSelectiveService implements Roster.CheckPerson {
            public boolean test(Person p) {
                return p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25;
            }
        }

        Roster.printPersons(
                roster, new CheckPersonEligibleForSelectiveService());
    }


    @Test
    public void testPrintPersonsAnonymous() {
        System.out.println("Persons who are eligible for Selective Service " +
                "(anonymous class):");

        Roster.printPersons(
                roster, new Roster.CheckPerson() {
                    public boolean test(Person p) {
                        return p.getGender() == Person.Sex.MALE
                                && p.getAge() >= 18
                                && p.getAge() <= 25;
                    }
                });
    }

    @Test
    public void testPrintPersonsLambda() {
        System.out.println("Persons who are eligible for Selective Service:" +
                "lambda");
        Roster.printPersons(
                roster, p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25);
    }

    @Test
    public void testPrintPersonsWithPredicate() {
        System.out.println("Persons who are eligible for Selective Service " +
                "(with Predicate parameter):");
        Roster.printPersonsWithPredicate(roster, person -> person.getGender() == Person.Sex.MALE
                && person.getAge() >= 18
                && person.getAge() <= 25);
    }


    @Test
    public void testProcessPersons() {
        System.out.println("Persons who are eligible for Selective Service " +
                "(with Predicate and Consumer parameters):");
        Roster.processPersons(roster, person -> person.getGender() == Person.Sex.MALE
                && person.getAge() >= 18
                && person.getAge() <= 25, person -> person.printPerson());
    }


    @Test
    public void testProcessPersonsWithFunction() {
        System.out.println("Persons who are eligible for Selective Service " +
                "(with Predicate, Function, and Consumer parameters):");
        Roster.processPersonsWithFunction(roster, person -> person.getGender() == Person.Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25,
                person -> person.getEmailAddress(),
                email -> System.out.println(email));
    }

    @Test
    public void testProcessElements() {
        System.out.println("Persons who are eligible for Selective Service " +
                "(generic version):");
        Roster.processElements(roster, person -> person.getGender() == Person.Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25,
                person -> person.getEmailAddress(),
                email -> System.out.println(email));
    }

    @Test
    public void testStream() {
        System.out.println("Persons who are eligible for Selective Service " +
                "(with bulk data operations):");
        roster.stream().filter(person -> person.getGender() == Person.Sex.MALE
                && person.getAge() >= 18
                && person.getAge() <= 25)
                .map(person -> person.getEmailAddress())
                .forEach(email -> System.out.println(email));
    }
}

package com.sweetop.studycore.test;

import com.sweetop.studycore.nestedclass.Person;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.swing.*;
import java.awt.event.TextEvent;
import java.util.*;
import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/25
 * Time: 上午10:19
 * To change this template use File | Settings | File Templates.
 */
public class MethodReferencesTest {
    private static List<Person> roster;

    @BeforeClass
    public static void setup() {
        roster = Person.createRoster();
        for (Person p : roster) {
            p.printPerson();
        }

    }

    @Test
    public void testWithoutMethodReference() {
        System.out.println("testWithoutMethodReference");
        class PersonAgeComparator implements Comparator<Person> {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.getBirthday().compareTo(p2.getBirthday());
            }
        }
        roster.sort(new PersonAgeComparator());
    }

    @Test
    public void testWithLambdaExpression() {
        System.out.println("With lambda expression");
        roster.sort((Person p1, Person p2) -> {
            return p1.getBirthday().compareTo(p2.getBirthday());
        });
    }

    @Test
    public void testWithMethodReference() {
        System.out.println("With method reference");
        roster.sort(Person::compareByAge);
    }

    @Test
    public void testWithComparing() {
        System.out.println("Comparator.comparing");
        roster.sort(Comparator.comparing(Person::getBirthday,Comparator.nullsLast(Comparator.reverseOrder())).thenComparing(Person::getName));
        roster.stream().forEach(person -> person.printPerson());
    }


    @Test
    public void testComparisonProvider() {
        class ComparisonProvider {
            public int compareByName(Person a,
                                     Person b) {
                return a.getName().compareTo(b.getName());
            }

            public int compareByAge(Person a,
                                    Person b) {
                return a.getBirthday().compareTo(b.getBirthday());
            }
        }

        ComparisonProvider myComparisonProvider = new ComparisonProvider();
        roster.sort(myComparisonProvider::compareByAge);
    }


    @Test
    public void testCompareToIgnoreCase() {
        String[] stringArray = {"Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);
    }


    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements(
            SOURCE sourceCollection,
            Supplier<DEST> collectionFactory) {

        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
    }

    @Test
    public void test() {
        Set<Person> rosterSetLambda =
                transferElements(roster, () -> new HashSet<>());

        Set<Person> rosterSet = transferElements(
                roster, HashSet::new);
        System.out.println("Printing rosterSet:");
        rosterSetLambda.stream().forEach(p -> p.printPerson());
    }


}

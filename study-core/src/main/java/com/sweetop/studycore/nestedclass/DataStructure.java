package com.sweetop.studycore.nestedclass;

import java.util.Iterator;
import java.util.function.Function;

public class DataStructure {

    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public static int getSIZE() {
        return SIZE;
    }

    public int[] getArrayOfInts() {
        return arrayOfInts;
    }

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {

        // Print out values of even indices of the array
        Iterator iterator = new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }


    public EvenIterator getEvenIterator() {
        return new EvenIterator();
    }

    public void print(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }


    public void print(Function<Integer, Boolean> iterator) {
        for (int i = 0; i < SIZE; i++) {
            if (iterator.apply(i)) {
                System.out.print(arrayOfInts[i] + " ");
            }
        }
        System.out.println();
    }

    public boolean isEvenIndex(Integer i){
          return i%2!=0;
    }
    public boolean isOddIndex(Integer i){
        return i%2==0;
    }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    private class EvenIterator implements Iterator<Integer> {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String s[]) {

        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();

        ds.print(ds.getEvenIterator());

        ds.print(new Iterator<Integer>() {
            // Start stepping through the array from the beginning
            private int nextIndex = 1;

            public boolean hasNext() {

                // Check if the current element is the last in the array
                return (nextIndex <= SIZE - 1);
            }

            public Integer next() {

                // Record a value of an even index of the array

                int[] arrayOfInts = ds.getArrayOfInts();
                Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

                // Get the next even element
                nextIndex += 2;
                return retValue;
            }
        });

        ds.print(integer -> integer % 2 == 0);
        ds.print(ds::isEvenIndex);
        ds.print(ds::isOddIndex);
    }
}
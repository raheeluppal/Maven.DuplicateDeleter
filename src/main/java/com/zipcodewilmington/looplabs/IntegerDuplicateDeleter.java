package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public int nmbrOfOccurances(int x) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i])
                count++;
        }
        return count;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int count = 0;
        int count2 = 0;
        Integer[] temp = new Integer[0];

        for (int i = 0; i < array.length; i++) {
            if (nmbrOfOccurances(array[i]) < maxNumberOfDuplications) {
                temp = new Integer[temp.length + 1];
                temp[count] = array[i];
                count++;
            }
        }
        Integer[] ints = new Integer[temp.length];
        for (int i = 0; i < array.length; i++) {
            if (nmbrOfOccurances(array[i]) < maxNumberOfDuplications) {
                ints[count2] = array[i];
                count2++;
            }
        }

            return ints;
        }

        @Override
        public Integer[] removeDuplicatesExactly ( int exactNumberOfDuplications){

            int count = 0;
            int count2 = 0;
            Integer[] temp = new Integer[0];

            for (int i = 0; i < array.length; i++) {
                if (nmbrOfOccurances(array[i]) != exactNumberOfDuplications) {
                    temp = new Integer[temp.length + 1];
                    temp[count] = array[i];
                    count++;
                }
            }
            Integer[] ints = new Integer[temp.length];
            for (int i = 0; i < array.length; i++) {
                if (nmbrOfOccurances(array[i]) != exactNumberOfDuplications) {
                    ints[count2] = array[i];
                    count2++;
                }
            }

            return ints;
        }
}

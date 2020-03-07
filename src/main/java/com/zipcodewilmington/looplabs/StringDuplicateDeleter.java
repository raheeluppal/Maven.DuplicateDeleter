package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }
    public int nmbrOfOccurances(String x) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (x.equals(array[i]))
                count++;
        }
        return count;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int count = 0;
        int count2 = 0;
        String[] temp = new String[0];

        for (int i = 0; i < array.length; i++) {

            if (nmbrOfOccurances(array[i]) < maxNumberOfDuplications) {
                temp = new String[temp.length + 1];
                temp[count] = array[i];
                count++;
            }
        }
        String[] ints = new String[temp.length];
        for (int i = 0; i < array.length; i++) {
            if (nmbrOfOccurances(array[i]) < maxNumberOfDuplications) {
                ints[count2] = array[i];
                count2++;
            }
        }

        return ints;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int count = 0;
        int count2 = 0;
        String[] temp = new String[0];

        for (int i = 0; i < array.length; i++) {

            if (nmbrOfOccurances(array[i]) != exactNumberOfDuplications) {
                temp = new String[temp.length + 1];
                temp[count] = array[i];
                count++;
            }
        }
        String[] ints = new String[temp.length];

        for (int i = 0; i < array.length; i++) {
            if (nmbrOfOccurances(array[i]) != exactNumberOfDuplications) {
                ints[count2] = array[i];
                count2++;
            }
        }

        return ints;
    }
}

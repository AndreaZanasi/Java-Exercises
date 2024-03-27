package exercises.notes.data_structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class DataStructures {

    /**
     * Arrays
     */
    public void iterateArray() {
        int[] vector = new int[10];
        int lenght = vector.length; //to get the size of an array
        int[] copy = vector.clone(); //clone the array in the copy

        for(int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    /**
     * Lists
     */
    public void iterateLists() {
        List<String> list = new LinkedList<>();
        list.add("Andrea"); //add an element to the list
        list.contains("Andrea"); //returns a boolen if the list contains the element
        list.size(); //return the numbers of elements in the list
        list.remove("Andrea"); //remove the element
        list.add("Giulio");
        System.out.println(list.get(1)); //get the element in the index specified
        list.set(1, "Mario"); //replace the element in the position 1 with the new element
        list.clear(); //delete all the elements in the list
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 3, 4 ,5 ,6)); //implementa le liste usando gli array

        for(String str : list) {
            System.out.println(str);
        }
    }

    /**
     * Trees
     */


}

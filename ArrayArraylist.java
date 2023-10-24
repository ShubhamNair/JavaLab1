package edu.neu.mgen;
import java.util.ArrayList;

public class ArrayArraylist{
    public static void main(String[] args){
        //Part 1:Array
        int[] x={1,4,5,7,9};
        int[] y={2,3,4,9,10};
        int[] z=new int[5];

        System.out.print("Array x = { ");
        for (int i=0; i < 5; i++) {
            System.out.print(x[i]);
            if (i<4) System.out.print(", ");
        }
        System.out.println(" }");

        System.out.print("Array y = { ");
        for (int i=0; i<5; i++) {
            System.out.print(y[i]);
            if (i<4) System.out.print(", ");
        }
        System.out.println(" }");

        System.out.print("Array z = x + y = { ");
        for (int i=0; i<5; i++) {
            z[i] = Math.max(x[i], y[i]);
            System.out.print(z[i]);
            if (i<4) System.out.print(", ");
        }
        System.out.println(" }");

        //Part 2:ArrayList
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Shubham");
        names.add("Rahul");
        names.add("Baishali");
        names.add("Alice");
        names.add("Islene");
        ArrayList<String> switchNames = new ArrayList<>();
        for (String name : names) {
            char first = name.charAt(0);
            char last = name.charAt(name.length()-1);
            String switchedName = last + name.substring(1, name.length()-1) + first;
            switchNames.add(switchedName);
        }
        System.out.print("Names = { ");
        for (int i= 0; i<names.size(); i++) {
            System.out.print(names.get(i));
            if (i<names.size() - 1) System.out.print(", ");
        }
        System.out.println(" }");
        System.out.print("Names (switched) = { ");
        for (int i= 0; i < switchNames.size(); i++) {
            System.out.print(switchNames.get(i));
            if (i<switchNames.size() - 1) System.out.print(", ");
        }
        System.out.println(" }");

         }
}
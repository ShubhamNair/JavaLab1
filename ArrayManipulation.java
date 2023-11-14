package edu.neu.mgen;

public class ArrayManipulation {

    public static void main(String[] args) {
        String[] array1 = {"Anne", "John", "Alex", "Jessica"};
        manipulateAndPrint("Original Array", array1);
        String[] result1 = reverseAndCapitalize(array1);
        manipulateAndPrint("Resultant Array", result1);

        String[] array2 = {"Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter"};
        manipulateAndPrint("Original Array", array2);
        String[] result2 = reverseAndCapitalize(array2);
        manipulateAndPrint("Resultant Array", result2);
    }
    private static String[] reverseAndCapitalize(String[] inputArray) {
        String[] resultArray = new String[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            String original = inputArray[i];
            StringBuilder reversed = new StringBuilder();

            for (int j = original.length() - 1; j >= 0; j--)
                reversed.append(original.charAt(j));

            String reversedString = reversed.toString().toLowerCase();
            String capitalizedString = reversedString.substring(0, 1).toUpperCase() + reversedString.substring(1);
            resultArray[i] = capitalizedString;
        }

        return resultArray;
    }

    private static void manipulateAndPrint(String message, String[] array) {
        System.out.println(message);

        for (String element : array)
            System.out.println("\"" + element + "\",");

        System.out.println("End of the array\n");
    }
}

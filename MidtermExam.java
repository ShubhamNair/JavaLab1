package edu.neu.mgen;

public class MidtermExam {
    public static void main(String[] args) {

      int[][] matrix = {
          {1, 2, 3},{4, 5, 6}
      };
      
      int sum = 0;
      //For loop to add the matrix values. Size is also dynamically calculated.
      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[i].length; j++) {
              sum += matrix[i][j];
          }
          
      }

      System.out.println("The sum of all elements in the matrix is: " + sum);

//To find size of matrix. As professor requested.
      int[][] matrix2 = {
        {1,2,3,4},
        {1,2,3,4},
        {1,2,3,4}
      };
      System.out.println("Size of matrix is "+matrix2.length+"(Row)*"+matrix2[0].length+"(Column)"); //Assuming all rows have the same number of columns

      }
  
    
}

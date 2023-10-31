package edu.neu.mgen;
public class MatrixOperation {
    public static void main(String[] args) {
        int[][] X={{2,3,4},{3,4,5}};
        int[][] Y={{1,2},{3,4},{5,6}};

        if(X[0].length != Y.length) {
            System.out.println("Matrix multiplication is not possible.");
        } else {
            //Initialize the result matrix C
            int[][] Z = new int[X.length][Y[0].length];
            for (int i = 0; i < X.length; i++) {
                for (int j = 0; j < Y[0].length; j++) {
                    for (int k = 0; k < X[0].length; k++) {
                        Z[i][j] += X[i][k]*Y[k][j];
                    }
                }
            }
            for (int i = 0;i<X.length; i++) {
                for (int j = 0;j<Y[0].length;j++) {
                    System.out.print(Z[i][j] + " ");
                }
                System.out.println();
            }
        }
    }  
}

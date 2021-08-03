package com.company;

public class MatrixAdd {
    public static void main(String[] args) {
        int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};

                // Printing the elements of a 2-D Array
                for (int x=0;x<mat1.length;x++){ // row number of times
                    for (int y=0;y<mat1[x].length;y++) { // column number of time
                        result[x][y] = mat1[x][y] + mat2[x][y];
                        System.out.print(result[x][y] + " ");
                    }
                    System.out.println(""); // Prints a new line
        }
    }
}

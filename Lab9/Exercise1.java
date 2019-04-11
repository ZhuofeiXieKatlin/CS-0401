/*
  Exercise1.java
*/

import java.io.*;
import java.util.*;


public class Exercise1
{
    public static void main( String[] args )
    {
        int[][] m = new int[5][5];
        fillDiagonal_1( m ); // You fill in code for method fillDiagonal_1  (below main)
        printMatrix( "DIAGONAL_1",m );
        zeroMatrix( m ); // You fill in code for method zeroMatrix  (below main)
        printMatrix( "ZEROS",m ); // should come out as all zeros
        fillDiagonal_2( m ); // You fill in code for method fillDiagonal_2  (below main)
        printMatrix( "DIAGONAL_2",m );
        zeroMatrix( m );  // You fill in code for method zeroMatrix  (below main)
        printMatrix( "ZEROS",m ); // should come out all zeros again
        fillBorder( m ); // You fill in code for method fillBorder  (below main)
        printMatrix( "BORDER",m );
    } // END MAIN

    //  - - - - - - - - - - Y O U  W R I T E  T H E S E   F O U R   M E T H O D S  -----------

    // You must use only one  for loop
    // You are NOT allowed to use a hardcoded literal 4 or 5 for row col length
    // You must always use expressions like matrix.length or matrix.length-1
    // or matrix[row].length -1 etc.
    // Do not use a literal number except the number "1" as in length-1 etc
    private static void fillDiagonal_1( int[][] matrix )
    {
        for(int row = 0; row< matrix.length; row ++)
            for(int column = matrix.length-1; column >= 0; column --)
            {
                if((column + row)==4)
                    matrix[row][column] = column; 
            }
    }

    // You must use only one for loop
    // You are NOT allowed to use a hardcoded literal 4 or 5 for row col length etc
    // You must always use expressions like matrix.length or matrix[row].length etc.

    private static void fillDiagonal_2( int[][] matrix )
    {
        for(int row = 0; row< matrix.length; row ++)
            for(int column = 0; column < matrix.length; column ++)
            {
                if(row == column)
                    matrix[row][column] = column; 
            }
    }

    // You may use as many as 4 (four) for loops
    // You are NOT allowed to use a hardcoded literal 4 or 5 for row col length etc
    // You must always use expressions like matrix.length or matrix[row].length etc.

    private static void fillBorder( int[][] matrix )
    {
        for(int row = 0; row< matrix.length; row ++)
        {
            for(int column = 0; column < matrix[row].length; column ++)
            {
                if(row == 0)
                    matrix[row][column] = column; 
                if(column == 0)
                    matrix[row][column] = row;
            }
        }
        for(int row = 0; row< matrix.length; row ++)
        {
            for(int column = matrix[row].length-1; column >= 0; column --)
            {
                if(row == 4)
                    matrix[row][column]= 4-column; 
                if(column == 4)
                    matrix[row][column] = 4-row; 
            }
        }
    }

    // Use a nested for loop (for loop in a for loop) to set every elemnt to zero
    // HINT: Look at the code in printMatrix - it's  identical to what you need here except
    // instead of printing matrix[row][col], you assign it a 0. You may use literal 0 of course here.

    private static void zeroMatrix( int[][] matrix )
    {
        for(int row = 0; row< matrix.length; row ++)
            for(int column = 0; column < matrix[row].length; column ++)
            {
                matrix[row][column] = 0; 
            }
    }

    //  - - - - - - - - - - D O   N O T   M O D I F Y.     U S E   A S  I S ----------------

    // IMPORTANT: matrix.length produces the number of rows. The num of rows IS the length of matrix
    // IMPORTANT: matrix[i].length produces the number of columns in the i'th row

    private static void printMatrix( String label, int[][] matrix )
    {
        System.out.println(label);
        for (int row=0 ; row<matrix.length ;  ++row)  // matrix.length is the number of rows
            {
                for (int col=0 ; col < matrix[row].length ; ++col )
                    System.out.print( matrix[row][col] + " ");

                System.out.println(); // newline after each row
            } // END FOR EACH ROW

        System.out.println(); // puts a blank line betwen next printout
    } // END PRINTMATRIX
} // END CLASS

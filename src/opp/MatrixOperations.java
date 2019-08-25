
/* *****************************************************************************
 *  Name:    	  Bora ÇOBAN
 *  Student ID:   64160013
 *  Department:   Computer Engineering
 *
 *  Assignment ID: A1 Question 2 
 *
 *  Description:  Print a program that runs on matrices.  
 *
 *  
 **************************************************************************** */
package opp;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


	
	public class src {
	
	static Scanner scanner;
	
	public static void main(String[] args) {
	// Read data from inputs.txt file placed in src directory(package)
	File inputFile = new File(".//src//inputs.txt");
	try {
	scanner = new Scanner(inputFile);
	} catch (FileNotFoundException e) {
	System.out.println("inputs.txt file not found");
	e.printStackTrace();
	}
	// Read Matrices from inputs.txt file
	System.out.println("Reading data from inputs.txt file placed in src directory(package)");
	// Read first matrix
	// Read the number of rows
	int rows, columns;
	rows = scanner.nextInt();
	// Read the number of columns
	columns = scanner.nextInt();
	// Read first Matrix
	int[][] a = readMatrix(rows, columns);
	// Read the second matrix
	rows = scanner.nextInt();
	// Read the number of columns
	columns = scanner.nextInt();
	// Read first Matrix
	int[][] b = readMatrix(rows, columns);

	// Read the third matrix
	rows = scanner.nextInt();
	// Read the number of columns
	columns = scanner.nextInt();
	// Read first Matrix
	int[][] c = readMatrix(rows, columns);
	// Generate a forth matrix with random number generator
	int[][] d = generateMatrix(rows, columns);
	// Print input Matrices
	System.out.println();
	System.out.println(" ******* Matrix A *******");
	printMatrix(a);
	System.out.println();
	System.out.println(" ******* Matrix B *******");
	printMatrix(b);
	System.out.println();
	System.out.println(" ******* Matrix C *******");
	printMatrix(c);
	System.out.println();
	System.out.println(" ******* Matrix D *******");
	printMatrix(d);
	System.out.println();
	System.out.println(" ******* Transpose C *******");
	printMatrix(transpose (c));
	System.out.println();
	System.out.println(" ******** A + B ********");
	printMatrix(add (a,b));
	System.out.println();
	System.out.println(" ******** A * B ******** ");
	printMatrix(multiply(a,b));
	System.out.println();
	System.out.println(" ******** A - B ******** ");
	printMatrix(subtract(a,b));
	System.out.println();
	System.out.println(" ***** (A + B) - TransposeOf(C) ***** ");
	printMatrix(subtract(add(a,b),transpose(c)));
	System.out.println();
	System.out.println(" ***** ((A + B) - TransposeOf(C)) * A ***** ");
	printMatrix(multiply(subtract(add(a,b),transpose(c)),a));
	System.out.println();
	System.out.println(" ***** (((A + B) - TransposeOf(C)) * A) + D ***** ");
	printMatrix(add(multiply(subtract(add(a,b),transpose(c)),a),d));
	System.out.println();
	System.out.println("***** Minimum Element in (((A + B) - TransposeOf(C)) * A) + D *****");
	System.out.println("Minimum Element ="+minOfElements(add(multiply(subtract(add(a,b),transpose(c)),a),d)));
	System.out.println();
	System.out.println("***** Sum of Elements in (((A + B) - TransposeOf(C)) * A) + D *****");
	System.out.println("Sum of elements = "+sumOfElements(add(multiply(subtract(add(a,b),transpose(c)),a),d)));
	}
	// reads a matrix
	public static int[][] readMatrix(int rows, int columns) {
	int[][] result = new int[rows][columns];
	for (int i = 0; i < rows; i++) {
	for (int j = 0; j < columns; j++) {
	result[i][j] = scanner.nextInt();
	}
	}
	return result;
	}
	// generate and return a random M-by-N matrix with values between 1 and 100
	public static int[][] generateMatrix(int rows, int columns) {
	int[][] result = new int[rows][columns];
	for (int i = 0; i < rows; i++) {
	for (int j = 0; j < columns; j++) {
	result[i][j] = (int) (Math.random() * 100) + 1;
	}
	}
	return result;
	}
	// prints a matrix
	public static void printMatrix(int[][] matrix) {
	int rows = matrix.length;
	int columns = matrix[0].length;
	for (int i = 0; i < rows; i++) {
	for (int j = 0; j < columns; j++) {
	System.out.printf("%6d ", matrix[i][j]);
	}
	System.out.println();
	}
	}
	
	// returns the transpose of c
	public static int[][] transpose (int[][] c) {
		 

		  int width =c.length;
		  int height = c[0].length;

		  int[][] array_new = new int[height][width];

		  for (int x = 0; x < width; x++) {
		    for (int y = 0; y < height; y++) {
		      array_new[y][x] = c[x][y];
		    }
		  }
		  return array_new;
		}
	// returns a + b
	public static int[][] add(int[][] a, int[][] b) {
		int[][] C = new int[4][4];
		 
        for (int q = 0; q < C.length; q++) {
            for (int w = 0; w < C[q].length; w++) {
                C[q][w] = a[q][w] + b[q][w];
            }
        }
 
        for (int q = 0; q < b.length; q++ ){
            for(int w = 0; w < C[q].length;w++){
            }
        }
         
        return C;
 
 
    }
	
	// returns a * b
	public static int[][] multiply(int[][] a, int[][] b) {
		int m1 = a.length;
        int n1 = a[0].length;
        int m2 = b.length;
        int n2 = b[0].length;
        if (n1 != m2) throw new RuntimeException("Illegal matrix dimensions.");
        int[][] D = new int[m1][n2];
        for (int f = 0; f < m1; f++)
            for (int g = 0; g < n2; g++)
                for (int h = 0; h < n1; h++)
                    D[f][g]+= a[f][h] * b[h][g];
        return D;
	}
	
	// returns a - b
	public static int[][] subtract(int[][] a, int[][] b) {
		
		int[][] M = new int[4][4];
        
        
        for (int s = 0; s < 4; s++){
            for (int z = 0; z < 4; z++){
               M[s][z]= a[s][z] - b[s][z];
            }
        }
        return M;
	}
	
	
	public static int minOfElements(int[][] num) {
		int minValue = num[0][0];
	    for (int m= 0; m < num.length; m++) {
	    	for(int n=0;n<num[m].length;n++){
	    		 if (num[m][n] < minValue) {
	 	            minValue = num[m][n];
	 	        }
	 	    }	
	    	}
	       
	   return minValue;
	}
	
	
	// returns the sum of elements in a matrix
	public static int sumOfElements(int[][] number) {
		
		int sum = number[0][0];
	    for (int o= 0; o < number.length; o++) {
	    	for(int l=0;l<number[o].length;l++){
	    		 if (number[o][l] < sum) {
	 	            sum += number[o][l];
	 	        }
	 	    }	
	    	}
	       
	   return sum;
	}

	
	
	
	
	
}
	
	
	



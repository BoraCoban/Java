
/* *****************************************************************************
 *  Name:    	  Bora ÇOBAN
 *  Student ID:   64160013
 *  Department:   Computer Engineering
 *
 *  Assignment ID: A1 Question 1 
 *
 *  Description:  Prints the number of stars to the console
 *                depending on the counts stored in an array.   
 *
 *  
 **************************************************************************** */
package opp;

import java.util.Random;
import java.util.Scanner;

public class RollDice {

	public static void main(String[] args) {
	    // TODO code application logic here
	    System.out.print("Please enter how many times to roll the dice: ");
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    int [] rolls = new int[n];


	    Random r1 = new Random();
	    Random r2 = new Random();
	    Random r3 = new Random();
	    Random r4 = new Random();
	    Random r5 = new Random();
	    Random r6 = new Random();
	    Random r7 = new Random();
	    Random r8 = new Random();
	    Random r9 = new Random();
	    Random r10 = new Random();
	    Random r11 = new Random();

	    int dice1;
	    int dice2;
	    int dice3;
	    int dice4;
	    int dice5;
	    int dice6;
	    int dice7;
	    int dice8;
	    int dice9;
	    int dice10;
	    int dice11;
	    int [] t = new int [66];


	    for (int roll=0; roll < rolls.length; roll++)
	    {
	    	 dice1 = r1.nextInt(6)+1;
	         dice2 = r2.nextInt(6)+1;
	         dice3 = r3.nextInt(6)+1;
	         dice4 = r4.nextInt(6)+1;
	         dice5 = r5.nextInt(6)+1;
	         dice6 = r6.nextInt(6)+1;
	         dice7 = r7.nextInt(6)+1;
	         dice8 = r8.nextInt(6)+1;
	         dice9 = r9.nextInt(6)+1;
	         dice10 =r10.nextInt(6)+1;
	         dice11= r11.nextInt(6)+1;
	       

	         int sum;
	         sum = dice1+dice2+dice3+dice4+dice5+
	        		 dice6+dice7+dice8+dice9+dice10+dice11;

	         if (sum == 11)
	             t[0]++;
	         if (sum == 12)
	             t[1]++;
	         if (sum == 13)
	             t[2]++;
	         if (sum == 14)
	             t[3]++;
	         if (sum == 15)
	             t[4]++;
	         if (sum == 16)
	             t[5]++;
	         if (sum == 17)
	             t[6]++;
	         if (sum == 18)
	             t[7]++;
	         if (sum == 19)
	             t[8]++;
	         if (sum == 20)
	             t[9]++;
	         if (sum == 21)
	             t[10]++;
	         if (sum == 22)
	             t[11]++;
	         if (sum == 23)
	             t[12]++;
	         if (sum == 24)
	             t[13]++;
	         if (sum == 25)
	             t[14]++;
	         if (sum == 26)
	             t[15]++;
	         if (sum == 27)
	             t[16]++;
	         if (sum == 28)
	             t[17]++;
	         if (sum == 29)
	             t[18]++;
	         if (sum == 30)
	             t[19]++;
	         if (sum == 31)
	             t[20]++;
	         if (sum == 32)
	             t[21]++;
	         if (sum == 33)
	             t[22]++;
	         if (sum == 34)
	             t[23]++;
	         if (sum == 35)
	             t[24]++;
	         if (sum == 36)
	             t[25]++;
	         if (sum == 37)
	             t[26]++;
	         if (sum == 38)
	             t[27]++;
	         if (sum == 39)
	             t[28]++;
	         if (sum == 40)
	             t[29]++;
	         if (sum == 41)
	             t[30]++;
	         if (sum == 42)
	             t[31]++;
	         if (sum == 43)
	             t[32]++;
	         if (sum == 44)
	             t[33]++;
	         if (sum == 45)
	             t[34]++;
	         if (sum == 46)
	             t[35]++;
	         if (sum == 47)
	             t[36]++;
	         if (sum == 48)
	             t[37]++;
	         if (sum == 49)
	             t[38]++;
	         if (sum == 50)
	             t[40]++;
	         if (sum == 51)
	             t[41]++;
	         if (sum == 53)
	             t[42]++;
	         if (sum == 54)
	             t[43]++;
	         if (sum == 55)
	             t[44]++;
	         if (sum == 56)
	             t[45]++;
	         if (sum == 57)
	             t[46]++;
	         if (sum == 58)
	             t[47]++;
	         if (sum == 59)
	             t[48]++;
	         if (sum == 60)
	             t[49]++;
	         if (sum == 61)
	             t[50]++;
	         if (sum == 62)
	             t[51]++;
	         if (sum == 63)
	             t[52]++;
	         if (sum == 64)
	             t[53]++;
	         if (sum == 65)
	             t[54]++;
	         if (sum == 66)
	             t[55]++;
	         


	    }   

	
	    String star ="*";
	    int [] h= {t[0], t[1],t[2], t[3],t[4], t[5], t[6], t[7],t[8], t[9],t[10],
	    		t[11], t[12],t[13], t[14],t[15], t[16], t[17], t[18],t[19], t[20],t[21],
	    		t[22], t[23],t[24], t[25],t[26], t[27], t[28], t[29],t[30], t[31],t[32],
	    		t[33], t[34],t[35], t[36],t[37], t[38], t[39], t[40],t[41], t[42],t[43],
	    		t[44], t[45],t[46], t[47],t[48], t[49], t[50], t[51],t[52], t[53],t[54],t[55]};
	     for (int i=0; i <=55; i++)
	             {
	    	 System.out.print((i+11)+":");
		        
	        for(int j = 0; j < h[i]; j++) {
	        	
	        	System.out.print(star);
	       
	    }
	        System.out.println();
	             }
   }
}

// By: Kevin E. Hernandez
// Date: 2/11/2018
/* 
 * This program finds two neighboring numbers in an array with 
 * the smallest distance to each other. The program should return the index 
 * of the first number. 
 */

import java.util.Scanner;
public class Exercise02 
{
  public static void main(String args[])
  {
	 int [] arreglo= {4,8,6,1,2,9,4};
	 
	 int minimo,
	     index=0;
	
     minimo = Math.abs(arreglo[0]-arreglo[1]);
    for(int i=2; i < arreglo.length; i++)
    {
      if(Math.abs(arreglo[i-1]-arreglo[i]) < minimo) {
    	  minimo = Math.abs(arreglo[i-1]-arreglo[i]);
    	  index = i-1;
      }
    }
    System.out.println("Index: " + index);
    System.out.println("Distance: " + minimo);	 
  }
}
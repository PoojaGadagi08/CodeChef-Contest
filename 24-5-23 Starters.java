//1. **Parking Charges**


// Problem
// Chef needs to park her car while she watches a movie. The parking charges at the theater are as follows:

// Rs. 

// X for the first 1 hour
// Rs. 

// Y for every extra hour after the first hour
// If Chef parks her car for 

// H hours, what is the total parking charges that she should pay?

// Input Format
// The only line of the input will contain three space separated integers - 

// X, 

// Y, and 

// H.

// Output Format
// Output a single integer, which should be the total amount that Chef pays as parking charge.


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int h=sc.nextInt();
		System.out.println((h-1)*y+x);
		
	}
}


// 2.Bus Seat Numbering

// As can be seen in the image, the bus is divided into two decks - The Lower deck, and the Upper deck, with 15 seats each. And some of the seats come as Single and some as Double. For example, Seats 1 and 2 are Double, whereas Seat 11 is a Single.

// You will be given a Seat number, and your job is to classify it as one of these 4 types:

// Lower Single
// Lower Double
// Upper Single
// Upper Double
// Input Format
// The first line of input will contain a single integer 
// �
// T, denoting the number of test cases.
// Each test case consists of a single line of input which contains a single integers 
// �
// N — the seat number.
// Output Format
// For each test case, output on a new line, the type of seat.
  
  
  
  /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    if(n>=1 && n<=10)
		    System.out.println("Lower Double");
		    if(n>=11 && n<=15)
		    System.out.println("Lower Single");
		    if(n>=16 && n<=25)
		    System.out.println("Upper Double");
		    if(n>=26 && n<=30)
		    System.out.println("Upper Single");
		}
	}
}


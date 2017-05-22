import java.util.*; 
 import java.awt.*;
import java.math.BigInteger;

import javax.swing.*; 
 // FIGURE OUT HOW TO DO THE PASCAL'S TRIANGLE PROBLEM 
 //Make the 10^20 # a BigInteger 
 public class Test { 
 
	int n = (int) (Math.pow(10, 9 + 7));
 	public final static BigInteger q =  new BigInteger("1000000007"); 
	public static void main(String[] args) { 
 Tester(); 
 	} 
      
 	public static void Tester(){ 
 	 
 		BigInteger BI = new BigInteger("100");
 		int n = 50; 
 		int p = 30; 
 		int k = 0; 
 		//Matth(n, p); 
 		//f(n, p); 
 		System.out.println("running 1");
 		System.out.println(Factorial(BI));
 	} 
 	 
 	//ncr = (n!)/((r!)(n-r)! 
 
 
     //The below function is the function for the f(n, k) in the pascal's triangle question in the HSCTF 
 	public static BigInteger f(BigInteger n, BigInteger k){ 
 		BigInteger val = new BigInteger("0"); 
 		BigInteger zero = new BigInteger("0");
 		if(n.intValue() >= k.intValue()){ 
 		val =	(Factorial(n).divide(((Factorial(k).multiply((Factorial(n.subtract(k)))))))); 
 		System.out.println(val); 
 			return val; 
 		} 
 		 
 		return zero; 
 	} 
 	public static BigInteger Factorial(BigInteger bI){ 
 		BigInteger x = new BigInteger("1"); 
 		BigInteger val = new BigInteger("1"); 
 		BigInteger add = new BigInteger("1");
 		
 		while(x.intValue() <= bI.intValue()){ 
 			val = val.multiply(x); 
 			x = x.add(add); 
 		} 
 		return val; 
 	} 
     //The below function is the Matth(n, p) function in the pascal's triangle question in the HSCTF 
 	public static BigInteger Matth(BigInteger n, BigInteger p){ 
 		BigInteger num = new BigInteger("0"); 
 		BigInteger add = new BigInteger("1");
 		BigInteger dos = new BigInteger("2");
         //This for loop is going to be the sigma for the quesion. 
 		for(BigInteger k = new BigInteger("0"); k.intValue() < 9; k = k.add(add)){ 
 			System.out.println("running");
 			num = num.add(f(n, k).multiply(f(p.multiply(dos), k))); 
 		} 
 		return num.mod(q); 
 	} 
 
 
 } 

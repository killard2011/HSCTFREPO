import java.util.*; 
 import java.awt.*;
import java.math.BigInteger;
import javax.swing.*; 
 // FIGURE OUT HOW TO DO THE PASCAL'S TRIANGLE PROBLEM 
 //Make the 10^20 # a BigInteger 
 public class Tester {  
	int n = (int) (Math.pow(10, 9 + 7));
 	public final static BigInteger q =  new BigInteger("1000000007"); 
	public static void main(String[] args) { 
 Tester(); 
 	} 

	public static void Tester(){ 
 		BigInteger n = new BigInteger("50");
 		BigInteger p = new BigInteger("30"); 
 		System.out.println("a1: " +Matth(n, p)); 
 		BigInteger n2 = new BigInteger("4234");
 		BigInteger p2 = new BigInteger("4000");
 		System.out.println("a2: " + Matth(n2, p2));
 		BigInteger n3 = new BigInteger("3000");
 		BigInteger p3 = new BigInteger("1234");
 		System.out.println("a3: " + Matth(n3, p3));
 		BigInteger n4 = new BigInteger("2017");
 		BigInteger p4 = new BigInteger("34");
 		System.out.println("a4: " + Matth(n4, p4));
 		BigInteger n5 = new BigInteger("4000");
 		BigInteger p5 = new BigInteger("3000");
 		System.out.println("a5: " + Matth(n5, p5));
 		BigInteger n6 = new BigInteger("5000");
 		BigInteger p6 = new BigInteger("3000");
 		System.out.println("a6: " + Matth(n6, p6));
 		System.out.println("Finished");
 		//f(n, p); 
 	} 
 	//ncr = (n!)/((r!)(n-r)! 
     //The below function is the function for the f(n, k) in the pascal's triangle question in the HSCTF 

 	public static BigInteger f(BigInteger n, BigInteger k){ 
 		BigInteger val = new BigInteger("0"); 
 		BigInteger zero = new BigInteger("0");
 		if(n.intValue() >= k.intValue()){ 
 		val =	(Factorial(n).divide(((Factorial(k).multiply((Factorial(n.subtract(k)))))))); 
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
 		System.out.println("running");
 		BigInteger num = new BigInteger("0"); 
 		BigInteger add = new BigInteger("1");
 		BigInteger dos = new BigInteger("2");
 		n.add(add);
         //This for loop is going to be the sigma for the quesion. 
 		for(BigInteger k = new BigInteger("0"); k.intValue() <= n.intValue(); k = k.add(add)){ 
 			num = num.add(f(n, p.add(k)).multiply(f(p.multiply(dos), k))); 
 		} 
 		return num.mod(q);
 	} 
 } 

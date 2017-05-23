import java.util.*; 
 import java.awt.*;
import java.math.BigInteger;
import javax.swing.*; 
 // FIGURE OUT HOW TO DO THE PASCAL'S TRIANGLE PROBLEM 
 //Make the 10^20 # a BigInteger 
 public class Tester {  
	public static BigInteger base = new BigInteger("987");
	
	public static BigInteger primemod = new BigInteger("8911991767204557841");
	
	public static BigInteger bobsPublicKey = new BigInteger("1317032838957486192");
	
	public static BigInteger alicesPublicKey = new BigInteger("731665363559374475");
	

	public static void main(String[] args) { 
 Tester(); 
 	} 

	public static void Tester(){ 
		System.out.println("running");
		BigInteger add = new BigInteger("1");
		System.out.println("first for loop");
		for(BigInteger x= new BigInteger("0"); x.intValue() < 999999999;x = x.add(add)){
			if((base.pow(x.intValue()).mod(primemod).equals(bobsPublicKey))){
					System.out.println("second for loop");
					for(BigInteger y = new BigInteger("0"); y.intValue() < 999999999;y = y.add(add)){
						if((base.pow(y.intValue()).mod(primemod).equals(alicesPublicKey))){
							System.out.println("compare");
							if((alicesPublicKey.pow(x.intValue())).mod(primemod).equals((bobsPublicKey.pow(y.intValue()).mod(primemod)))){
								BigInteger z = new BigInteger("0");
								z = (alicesPublicKey.pow(x.intValue())).mod(primemod);
								System.out.println(z);
							};
						}
					}
				}
		}
	
	
	}
 } 
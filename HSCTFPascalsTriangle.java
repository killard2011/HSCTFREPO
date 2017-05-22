import java.util.*;
import java.awt.*;
import javax.swing.*;
// FIGURE OUT HOW TO DO THE PASCAL'S TRIANGLE PROBLEM
//Make the 10^20 # a BigInteger
public class Test {

	public final static double q = (Math.pow(10, 9)) + 7;
	public static void main(String[] args) {
Tester();
	}
    
	public static void Tester(){
	
		int n = 50;
		int p = 30;
		int k = 0;
		Matth(n, p);
		//f(n, p);
	}
	
	//ncr = (n!)/((r!)(n-r)!

    //The below function is the function for the f(n, k) in the pascal's triangle question in the HSCTF
	public static int f(int n, int k){
		int val = 0;
		if(n >= k){
		val =	(Factorial(n)/((Factorial(k)*(Factorial(n-k)))));
		System.out.println(val);
			return val;
		}
		
		return 0;
	}
	public static int Factorial(int num){
		int x = 1;
		int val = 1;
		while(x <= num){
			val*=x;
			x++;
		}
		return val;
	}
    //The below function is the Matth(n, p) function in the pascal's triangle question in the HSCTF
	public static int Matth(int n, int p){
		int num = 0;
        //This for loop is going to be the sigma for the quesion.
		for(int k = 0; k < 90000000; k++){
			num = num + f(n, k)*f(2*p, k);
		}
		return (int) (num%q);
	}

}

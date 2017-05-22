import java.util.*;
import java.awt.*;
import javax.swing.*;
// FIGURE OUT HOW TO DO THE PASCAL'S TRIANGLE PROBLEM
//Make the 10^20 # a BigInteger
public class Tester {

	public final double q = (Math.pow(10, 9)) + 7;
	public static void main(String[] args) {
Tester();
	}
    
	public static void Tester(){
	
		int n = 0;
		int p = 0;
		int k = 0;
		Matth(n, p);

	}
    //The below function is the function for the f(n, k) in the pascal's triangle question in the HSCTF
	public static int f(int n, int k){
		
		if(n >= k){
			return 0;
		}
		
		return 0;
	}
    //The below function is the Matth(n, p) function in the pascal's triangle question in the HSCTF
	public static void Matth(int n, int p){
		int num = 0;
        //This for loop is going to be the sigma for the quesion.
		for(int k = 0; k < 90000000; k++){
			num = num + f(n, k);
		}
	}

}

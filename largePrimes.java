

public class Tester {

	public static void main(String[] args) {
	
		Tester();
		

	}
	public static void Tester(){

		double h = 3697;
		double sum = 0;
		int counter = 0;
		boolean prime = true;
	//double num = Math.pow(10,  20);
		double num = 6658714;
		double add = 0;
		int valueBingChkd = 0;
		//for(;num >= Math.pow(10, 400);num++){
		while(num > 0){
			add = num % 10;
			sum += add;
			num /= 10;
		}
		System.out.println("sum: " + sum);
		
for(valueBingChkd = (int)sum;valueBingChkd <= 200;valueBingChkd++){
	prime = true;
	if(valueBingChkd != 2 && valueBingChkd != 3 && valueBingChkd != 1 && valueBingChkd != 0){
		if(valueBingChkd%2 == 0 && prime == true){
		//	System.out.println("not prime 1: " + valueBingChkd);
			prime = false;
		}else if(valueBingChkd%3 == 0 && prime == true){
			//System.out.println("not prime 2: " + valueBingChkd);
			prime = false;
		} else{
			for(double k =4;k <= Math.sqrt(valueBingChkd);k++){
				if(valueBingChkd % k == 0 && prime == true && k % 2 != 0){
				//	System.out.println("not prime 3: " + k + "   " + valueBingChkd);
				prime = false;
				}
				
				
			}
		}
	}
			if(prime == true){
			System.out.println("prime: " + valueBingChkd);
			counter++;
			}
		
		
	}
System.out.println(" num of prime values = " + counter);
	}
	}

package main;

import java.util.Scanner;
import java.math.BigInteger;

class pascal {
    static BigInteger factorial(int n) {
		BigInteger fact = new BigInteger("1"); //initialize result
		if (n == 0) {
			return fact.multiply(BigInteger.valueOf(1)); // if user input "0" the answer will show "1"
		}
		else if (n < 0) {
			return fact.multiply(BigInteger.valueOf(-1)); // if user input less that "0" it should show an error
		}
		else {
			for (int i = 2;i <= n;i++) {
				fact = fact.multiply(BigInteger.valueOf(i)); // this will initiate the use of factorial
			}
			return fact;
		}
	}
	static BigInteger comb(int n,int r) {
		BigInteger comb = factorial(n).divide(factorial(r).multiply(factorial(n-r))); // formula for Combination nCr
		return comb;
	}
        
    public void pascal(){
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your designated line: "); //user input
		int N = sc.nextInt();
                if (N != 1){
		int n = N - 1; // We presume that the 1st line is the 1st line, that will show 1 only
		
		if (n == 0) {
			System.out.print("1"); // if the user input less than "0" this will pop out
			}
		else {
		System.out.println("Pascal Triangle line "+ N +" is: ");
		
		for(int r = 0;r <= n; r++) {
			System.out.print(" " + comb(n,r)); // shows the result of your line you selected
			}
		}
                }
                
	}
    }    
}

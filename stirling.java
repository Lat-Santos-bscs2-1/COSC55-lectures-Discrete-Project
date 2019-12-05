package main;

import java.util.Scanner;
import java.math.BigInteger;

class stirling  {
    static BigInteger factorial(int n) {
		BigInteger fact = new BigInteger("1"); //initialize result
			for (int i = 2;i <= n;i++) {
				fact = fact.multiply(BigInteger.valueOf(i)); // this will initiate the use of factorial
			}
			return fact;
		}
     public void stirling(){
     Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of 'n': ");
		int n = sc.nextInt();
		System.out.print("Enter value of 'k': ");
		int j = sc.nextInt();
		
		BigInteger q = BigInteger.valueOf(-1); // value of (-1)^j
		BigInteger q2 = BigInteger.valueOf(-1); // value of (-1)^j
		
		BigInteger jn = BigInteger.ZERO; // use for value of (j-i)^n
		BigInteger jn1 = BigInteger.ZERO; // use for value of (j-i)^n
		BigInteger fna = BigInteger.ZERO; // for final answer
			for (int x = 0;x < j;x++) {
				q = (q).multiply(q2);
				BigInteger comb1 = factorial(j).divide(factorial(x).multiply(factorial(j-x)));
				jn = BigInteger.valueOf(j).subtract(BigInteger.valueOf(x));
				jn1 = BigInteger.valueOf(j).subtract(BigInteger.valueOf(x));
				for(int z = 1;z < n;z++) {
					jn = jn.multiply(jn1);
				}
				fna = fna.add((q).multiply(comb1).multiply(jn));
			}
			System.out.println(fna.divide(factorial(j)));
			}
     }           
    


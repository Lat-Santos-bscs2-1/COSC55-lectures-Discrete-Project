
package main;

import java.math.BigInteger;
import java.util.Scanner;

class permu {
    public void repeatpermu(){
        System.out.println("Perumtation with Repeat");
        Scanner sc=new Scanner(System.in);
        
        boolean condition=true;
        do{   
            System.out.print("Assign value for n: ");
            int n=sc.nextInt();
            System.out.print("Assign value for r: ");
            int r=sc.nextInt();

            if(n>500 || n<0)
                {
                    System.out.println("Number out of range!");
                    condition=false;
                }
            else if(r>500 || r<0)
                {
                    System.out.println("Number out of range!");
                    condition=false;
                }
            else
                {                  

                                System.out.println("Permutations with repetitions");
                                if(n>=r){
                                BigInteger withRep = BigInteger.valueOf(n);
                                for(int i=1;i<=r-1;i++)
                                    {
                                        withRep=withRep.multiply(BigInteger.valueOf(n));
                                    }
                                System.out.println(n+"^"+ r+" = "+withRep);
                                break;
                                }
                                else{
                                System.out.println("n should be greater than r!");
                                        condition=false;
                                }
                         
    }
}
        while(condition==false);
        }
    
    public void norepeatpermu(){
        System.out.println("Perumtation without Repeat");
        Scanner sc=new Scanner(System.in);
        
        boolean condition=true;
        do{   
            System.out.print("Assign value for n: ");
            int n=sc.nextInt();
            System.out.print("Assign value for r: ");
            int r=sc.nextInt();

            if(n>500 || n<0)
                {
                    System.out.println("Number out of range!");
                    condition=false;
                }
            else if(r>500 || r<0)
                {
                    System.out.println("Number out of range!");
                    condition=false;
                }
            else
                {                  
                System.out.println("Permutations without repetitions");
                                if(n>=r)
                                    {
                                        System.out.println(n+"P"+ r+" = "+permutation(n,r));
                                        condition=true;
                                    }
                                else
                                    {
                                        System.out.println("n should be greater than r!");
                                        condition=false;
                                    }
                                break;                   
                }
}
        while(condition==false);
        }
    
    public void repeatcombi(){
        System.out.println("Combination with Repeat");
        Scanner sc=new Scanner(System.in);
        
        boolean condition=true;
        do{   
            System.out.print("Assign value for n: ");
            int n=sc.nextInt();
            System.out.print("Assign value for r: ");
            int r=sc.nextInt();

            if(n>500 || n<0)
                {
                    System.out.println("Number out of range!");
                    condition=false;
                }
            else if(r>500 || r<0)
                {
                    System.out.println("Number out of range!");
                    condition=false;
                }
            else
                {                  
                System.out.println("Combination with repetitions");
                                
                                if(n>=r)
                                    {
                                        System.out.println(n+"C"+ r+" = "+combination1(n,r));
                                        condition=true;
                                    }
                                else
                                    {
                                        System.out.println("n should be greater than r!");
                                        condition=false;
                                    }
                                break;        
                }
}
        while(condition==false);
        }
    
    public void norepeatcombi(){
        System.out.println("Combination without Repeat");
        Scanner sc=new Scanner(System.in);
        
        boolean condition=true;
        do{   
            System.out.print("Assign value for n: ");
            int n=sc.nextInt();
            System.out.print("Assign value for r: ");
            int r=sc.nextInt();

            if(n>500 || n<0)
                {
                    System.out.println("Number out of range!");
                    condition=false;
                }
            else if(r>500 || r<0)
                {
                    System.out.println("Number out of range!");
                    condition=false;
                }
            else
                {                  
                System.out.println("Combination without repetitions");
                                if(n>=r)
                                    {
                                        System.out.println(n+"C"+ r+" = "+combination2(n,r));
                                        condition=true;
                                    }
                                else
                                    {
                                        System.out.println("n should be greater than r!");
                                        condition=false;
                                    }
                                break;
                }
}
        while(condition==false);
        }
    
    
     public  BigInteger factorial(int number)
        {
           BigInteger factorialInt= BigInteger.ONE;
            
           for(int i=number;i>=1;i--)
            {
               factorialInt=factorialInt.multiply(BigInteger.valueOf(i));
            }
           return factorialInt;
           
        }
    public  BigInteger permutation(int number1,int number2)
        {
            return factorial(number1).divide(factorial(number1-number2));
        }
    
    
    public  BigInteger combination2(int number1,int number2)
        {
            return factorial(number1).divide(factorial(number1-number2).multiply(factorial(number2)));
        }
    public  BigInteger combination1(int number1,int number2)
        {
            return (factorial((number1+number2)-1)).divide((factorial((number1)-1)).multiply(factorial(number2)));
        }
    
    
}

    

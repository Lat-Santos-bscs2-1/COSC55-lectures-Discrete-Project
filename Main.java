package main;
import java.util.*;

public class Main {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        permu obj = new permu();
        stirling obj1 = new stirling();
        pascal obj2 = new pascal();
        
        boolean condition=true;
        do{  
        System.out.println("Menu");
        System.out.println("1.Permutation");
        System.out.println("2.Combination");
        System.out.println("3.Sterling");
        System.out.println("4.Pascal");
       
        System.out.print("Your Choice:");
        int choice=sc.nextInt();

        if (choice == 1)
        {
            condition=false;
        System.out.println("1.Permutation with Repeation");
        System.out.println("2.Permutation without Repeation");
        System.out.print("Your Choice:");
        int choice1=sc.nextInt();
            if (choice1 == 1)
            {
                obj.repeatpermu();
            }
            else if (choice1 == 2)
            {
                obj.norepeatpermu();
            }
            
         }
        else if (choice == 2)
        {
        System.out.println("1.Combination with Repeation");
        System.out.println("2.Combination without Repeation");
        System.out.print("Your Choice:");
        int choice1=sc.nextInt();
            if (choice1 == 1)
            {
                obj.repeatcombi();
            }
            else if (choice1 == 2)
            {
                obj.norepeatcombi();
            }
            condition=false;
         }
        
        else if (choice == 3){
        obj1.stirling();
        condition=false;
        }
        else if (choice == 4){
        obj2.pascal();
        condition=false;
        }
        
        else {
            System.out.println("~~~~~Not in choices~~~~~");
            condition=false;
        }
    }
    while(condition==false);
        }
}

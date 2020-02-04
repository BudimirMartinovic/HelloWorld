package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author budimir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("Hello World");
        System.out.println("Budimir");
        
        int age = 5;
        
        if (age > 18) {
            System.out.println ("Osoba je punoletna");
        } else {
            System.out.println ("Osoba je punoletna");
        }
        
        System.out.print("Unesite broj godina: ");
        Scanner input = new Scanner (System.in);
        int userAge = input.nextInt();
        
        System.out.println("Korisnik je uneo :" + userAge);
        
         if (userAge >= 18) {
            System.out.println ("Osoba je punoletna");
        } else {
            System.out.println ("Osoba je maloletna");
        }
         
         
         
        System.out.print("Unesite broj godina: ");
        Sccaner input2 = new Scanner (System.in);
        int personrAge = input2.nextInt();
        
        if (personAge > 0 && personrAge <= 5){
           System.out.println("Baby");
    }   else if (personrAge <= 11){
           System.out.println("Kid");
    }   else if ( personrAge <= 17){
           System.out.println("Teen");
    }   else if (personAge >= 18){
           System.out.println("Adult");
    }   else if (personAge < 0 ){
           System.out.println("Invalid");
    }
        
        
}
}
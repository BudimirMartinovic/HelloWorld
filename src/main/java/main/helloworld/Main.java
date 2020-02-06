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
      
//        System.out.println("Hello World");
//        System.out.println("Budimir");
        
//        int age = 5;
//        
//        if (age > 18) {
//            System.out.println ("Osoba je punoletna");
//        } else {
//            System.out.println ("Osoba je maloletna");
//        }
//        
//        System.out.print("Unesite broj godina: ");
//        Scanner input = new Scanner (System.in);
//        int userAge = input.nextInt();
//        
//        System.out.println("Korisnik je uneo :" + userAge);
////       
//        
//        
        
        
        
        
        
//         if (userAge >= 18) {
//            System.out.println ("Osoba je punoletna");
//        } else {
//            System.out.println ("Osoba je maloletna");
//        }
//        
//        System.out.print("Unesite broj godina: ");
//        Sccaner input2 = new Scanner (System.in);
//        int personrAge = input2.nextInt();
//        
//        if (personAge <=0 && personrAge > 150){
//           System.out.println("Invalid");
//        }       else if (personrAge <= 5){
//           System.out.println("Baby");
//    }   else if (personrAge <= 11){
//           System.out.println("Kid");
//    }   else if ( personrAge <= 17){
//           System.out.println("Teen");
//    }   else if (personAge >= 18){
//           System.out.println("Adult");
//    }
    
        
//        System.out.print("Unesiti redni broj dana u nedelji (1-7): ");
//        Scanner input3 = new Scanner(System.in);
//        int dayNumber = input3.nextInt();
//        
//        String day;
//        
//        switch (dayNumber) {
//           case 1:
//              day = "Ponedeljak";
//              break;
//           case 2:
//              day = "Utorak";
//              break;
//           case 3:
//              day = "Sreda";
//              break;
//           case 4:
//              day = "Četvrtak";
//              break;
//           case 5:
//              day = "Petak";
//              break;
//           case 6:
//              day = "Subota";
//              break;
//           case 7:
//              day = "Nedelja";
//              break;
//           default:
//              day = "Netačan unos";
//              break;
//        }
//        System.out.println(day);



        System.out.println("While loop:");
             
            int x = 5;
            while (x < 10){
            System.out.println(x);
            x = x + 1;
             }
              
        System.out.println("While loop 2:");
            x =10;
            while (x > 0){
            System.out.println(x);
            x--;
             }
            
            
        System.out.println("Do While loop :");    
            x =15;
            do {
            System.out.println(x);
            x--;
             } while(x > 15);
            
            
            
        System.out.println("For loop:");
              for (int i =50; i<60; i++){
                  System.out.println(i);
              }
              
        System.out.println("For loop 2:");
              for (int i =30; i>=20; i--){
                  System.out.println(i);
              }
             
              System.out.println("Kvadrat 1:");
              for (int i =0; i<10; i++){
                  for (int j =0; j<10; j++){
                  System.out.print("*");  
              }
                  System.out.println();
              }
//        Zadatak 1: Kvadrat

        
    
      System.out.println("Koordinate 1:");
              for (int i = 0; i < 10; i++){
                  for (int j = 0; j < 10; j++){
                  System.out.print( "(" + i + "," + j + ")");  
              }
                  System.out.println();
           }
    
              
              
    System.out.println("Koordinate 2:");
              for (int i = 1; i <= 10; i++){
                  for (int j = 1; j <= 10; j++){
                  System.out.print( "(" + i + "," + j + ")");  
              }
                  System.out.println();
           }
    
    
    
    }
}
package com.ferragnez.party;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis, Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner input = new Scanner(System.in);

        System.out.println("Come ti chiami?");
        String nome = input.nextLine();

        boolean foundName = false;

        //for(int i=0; i<guests.length; i++){
            //System.out.println(guests[i]);

         //   if (nome.equalsIgnoreCase(guests[i])){
        //        System.out.println("Il tuo nome fa parte della lista, quindi puoi entrare:"+" "+ guests[i]);
        //        foundName=true;
        //        break;
               
        //    } 
       // }
        
       int i=0;
       while (i<guests.length){
       
        if (nome.equalsIgnoreCase(guests[i])){
                   System.out.println("Il tuo nome fa parte della lista, quindi puoi entrare:"+" "+ guests[i]);
                  foundName=true;
                   
                  break;
                   
               } 
        i ++;
        
       }
        
        if (!foundName){
            System.out.println("Il tuo nome non fa parte della lista quindi non puoi entrare");
        }
        
       

        input.close();
    }

    }


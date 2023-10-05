package com.pluralsight;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
        double regular = 5.45;
        double large = 8.95;

        Scanner myScanner = new Scanner(System.in);
        System.out.print("What kind of sandwich do you want? regular or large? ");
            String sandwich_choice = myScanner.next();

        if (sandwich_choice.equals("regular")){
            System.out.println("The price of the regular sandwich is $ 5.25. ");
        }
        if (sandwich_choice.equals("large")){
            System.out.println("The price of the large sandwich is $ 8.95. ");
        }

        System.out.print("Ok thank you coming right up! How old are you? ");
            int user_age = myScanner.nextInt();

         double young_price = regular * .1;
            double young_total_price = regular - young_price;

         double old_price = regular * .2;
            double old_total_price = regular - old_price;

          double young_price2 = large * .1;
            double young_total_price2 = large - young_price2;

          double old_price2 = large * .2;
            double old_total_price2 = large - old_price2;

        if (user_age <= 17 && sandwich_choice.equals("large")) {
            System.out.println("Great you qualify for a discount! Here is your total : " + young_total_price2 );
        }
        if (user_age <= 17 && sandwich_choice.equals("regular")) {
            System.out.println("That's great you qualify for a student discount!Here is your total :  " + young_total_price);
        }
        if (user_age >= 65 && sandwich_choice.equals("large")) {
            System.out.println("Amazing! You get a senior discount! Here is your total :  "  + old_total_price2);
        }
        if (user_age >= 65 && sandwich_choice.equals("regular")) {
            System.out.println("Splendid! You get the senior discount! Here is your total :  " + old_total_price);
        }

        if (user_age > 17 && user_age < 65 && sandwich_choice.equals("large")) {
            System.out.println(" Sadly you don't qualify for any discounts! Here is your total :  " + large);
        }
        if (user_age > 17 && user_age < 65 && sandwich_choice.equals("regular")) {
            System.out.println(" When you're older you can get the senior discount! Here is your total :  " + regular);
        }
    }
}

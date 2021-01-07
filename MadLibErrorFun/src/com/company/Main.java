package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Human! lEt'S pLaY mAdLiBs!!");

        /*System.out.println("What is your first name?");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        System.out.printf("Hello %s! ", firstName);
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.printf("Whoa... %s %s, that's a cool name!", firstName, lastName);*/

        // MAD LIB EXERCISE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name to begin: ");
        //using an illegal field name: ERROR TO FOLLOW
        //java: incompatible types
        String name = input.nextLine();
        System.out.println("Now I need an adverb: ");
        //field left uninitialized
        String adverb = input.nextLine();
        //cannot find symbol
        System.out.println(adverb);
        System.out.println("How about an adjective now: ");
        String adjective = input.nextLine();
        System.out.println("Verb ending with -ing: ");
        String verb = input.nextLine();
        System.out.println("Time for a Plural NOUN: ");
        String pluralNoun = input.nextLine();
        System.out.println("I need a Number ");
        String number = input.nextLine();
        System.out.println("What is your name?: ");
        String yourName = input.nextLine();
        System.out.println("OK! HERE IS YOUR mAdLiB!!!");
        System.out.printf("Dear %s, Please be sure to pick up %s bags of %s before you come over tonight! \n The girls " +
                "have been %s %s since I told them you were bringing your %s dog \n to the party! Can't wait to see you!\n " +
                "Love, %s", yourName, number, pluralNoun, adverb, verb, adjective, name);
    }
}

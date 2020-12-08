package com.company;

import java.util.List;
import java.util.Scanner;

public class ECart {
    Scanner sc = new Scanner(System.in);
    public void show(){
        List<HeadPhones> hp = List.of(
                new HeadPhones("SN-JC1395","Sony",1399,3.5),
                new HeadPhones("SN-AZ2000","Sony",7899,3.7),
                new HeadPhones("SN-BS1473","Sony",5899,4.0),
                new HeadPhones("JB-SF4821","JBL",3499,4.7),
                new HeadPhones("JB-FB3401","JBL",5699,3.2),
                new HeadPhones("JB-MH5792","JBL",9899,4.0),
                new HeadPhones("BA-NG5729","Boat",4399,4.3),
                new HeadPhones("BA-GB3801","Boat",6799,4.2),
                new HeadPhones("BA-LE5920","Boat",8899,3.9),
                new HeadPhones("AIRPODS 1 2016","APPLE",5599,4.3),
                new HeadPhones("AIRPODS 2 2018","APPLE",6599,4.5),
                new HeadPhones("AIRPODS 2 PRO","APPLE",9999,4.0)
        );
        System.out.println("Welcome to HeadPhones ECart");
        System.out.println("We have 4 brands of headphones available");
        System.out.println("1. Apple\n2. Boat\n3. JBL\n4. Sony");
        System.out.println("\nWe preform filter on the basis of price and rating");
        System.out.println("Press the choice below to perform filtration\n1. On the basis Price\n2. On the basis Rating");
        short choice = sc.nextShort();
        switch (choice){
            case 1:
                System.out.println("Enter the price range between 1,300 to 10,000");
                int userPrice = sc.nextInt();
                if(userPrice >= 1300 && userPrice <= 10000) {
                    hp.stream()
                            .filter(headPhones -> headPhones.getPrice() > userPrice)
                            .forEach(headPhones -> System.out.println(headPhones.getBrand() + "\t\t" + headPhones.getTitle()
                                    + "\t\t" + headPhones.getPrice() + "\t\t" + headPhones.getRating()));
                }
                break;
            case 2:
                System.out.println("Enter the rating range between 1.0 to 5.0");
                double userRating = sc.nextDouble();
                if(userRating >= 1.0 && userRating <= 5.0) {
                    hp.stream()
                            .filter(headPhones -> headPhones.getRating() > userRating)
                            .forEach(headPhones -> System.out.println(headPhones.getBrand() + "\t\t" + headPhones.getTitle()
                                    + "\t\t" + headPhones.getPrice() + "\t\t" + headPhones.getRating()));
                }
                break;
            default:
                System.out.println("Wrong choice entered.");
        }



    }
}

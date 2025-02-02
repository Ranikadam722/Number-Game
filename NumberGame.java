
package com.mycompany.number.game;

import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Random rm=new Random();
        
        int num=rm.nextInt(100)+1;
        
        System.out.print("\n");
        System.out.println("Welcome To Number Guessing Game");
        System.out.println("You have only 10 Trials");
        System.out.print("Guess a number between(1-100) =");
        
        int guess=sc.nextInt();
        int i=1;
        int count=1;
        
        while(i<=10){
            
            if(guess==num){
                System.out.println("Congrulations You win");
                System.out.println("You guess the number in "+count+" tries");
                break;
            }else if(guess>num){
                System.out.println("Too High");
            }else if(guess<num){
                System.out.println("Too Low");
            }
            System.out.print("Try again =");
            guess=sc.nextInt();
            i++;
            count++;
                
            if(i>10){
            System.out.println("Ohh No ! , You lost your Trials");
            }
        }
    }
}


    


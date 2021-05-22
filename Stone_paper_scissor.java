package com.company;

import java.util.Scanner;
import java.util.Random;

public class Stone_paper_scissor {
    public static void main(String[] args) {

        //0 for Stone
        //1 for paper
        //2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("***********  Stone paper Scissor ********");
        int n = 5;
        int marks = 0;
        int i = 0;
        while(n!=0)
        {
            System.out.println("Enter 0 for Stone, 1 for Paper , 2 for Scissor");
            int user_inp = sc.nextInt();

            Random rand = new Random();
            int comp_inp = rand.nextInt(3);


            if (user_inp == 0) {
                System.out.println("\tYou Chose : Stone \n");
            }
            else if (user_inp == 1) {
                System.out.println("\tYou Chose : Paper \n");
            }
            else if (user_inp == 2) {
                System.out.println("\tYou Chose : Scissor \n");
            }
            else {

            }


            if (comp_inp == 0) {
                System.out.println("\tComputer Choice : Stone");
            }
            else if (comp_inp == 1) {
                System.out.println("\tComputer Choice : Paper");
            }
            else if (comp_inp == 2) {
                System.out.println("\tComputer Choice : Scissor");
            }
            else {

            }


            if (user_inp == comp_inp) {
                System.out.println("Draw !!");
                i--;
            }
            else if ((user_inp == 0 && comp_inp == 2) || (user_inp == 1 && comp_inp == 0) || (user_inp == 2 && comp_inp == 1)) {
                System.out.println("You Win !!");
                marks++;
            }
            else {
                System.out.println("Computer Win !!!\n");
            }
            n--;
        }

        System.out.println("\n");
        System.out.println("Final Scores :");
        System.out.println(" Your Score : " + marks + " out of 5");
        int cmarks = 5-marks+i;
        System.out.println(" Computer Score : " + cmarks);
        if(marks > cmarks )
        {
            System.out.println("Congratulations You have Won the Game !!!!!!");
        }
        else
        {
            System.out.println(" Better Luck next Time :-( ");
        }




    }
}


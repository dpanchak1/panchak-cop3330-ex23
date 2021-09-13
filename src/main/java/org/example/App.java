/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 first_name last_name
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        int yn=-1;

        System.out.printf("Enter 1 for yes or 0 for no.%n");
        System.out.print("Is the car silent when you turn the key? ");
        yn=input.nextInt();
        if(yn==1)
        {
            System.out.print("Are the battery terminals corroded? ");
            yn=input.nextInt();
            if(yn==1)
            {
                System.out.print("Clean terminals and try starting again.");
            }
            else
            {
                System.out.print("Replace cables and try again.");
            }
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            yn=input.nextInt();
            if(yn==1)
            {
                System.out.print("Replace the battery");
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                yn=input.nextInt();
                if(yn==1)
                {
                    System.out.print("Check spark plug connections");
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    yn=input.nextInt();
                    if(yn==1)
                    {
                        System.out.print("Does your car have fuel injection? ");
                        yn=input.nextInt();
                        if(yn==1)
                        {
                            System.out.print("Get it in for service.");
                        }
                        else
                        {
                            System.out.print("Check to ensure the choke is opening and closing");
                        }
                    }
                    else
                    {
                        System.out.print("This should not be possible");
                    }
                }
            }
        }
    }
}


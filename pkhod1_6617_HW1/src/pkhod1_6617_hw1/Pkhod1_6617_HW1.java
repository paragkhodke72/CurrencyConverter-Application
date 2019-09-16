/*
CSCI 6617 S2 Fall 2019
Java Programming
Parag b.Khodke
pkhod1@unh.newhaven.edu
Instructor: Sheehan
NAME OF CLASS : pkhod1_6617_HW
This class will convert our Local currency into Desired currency from options if local currency is less than 1 million
user will not see its local currency option if he wants to convert from local currency to another.
after convert program, user will choose to continue program and/or user can quit the program from given menu  
*/
package pkhod1_6617_hw1;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Pkhod1_6617_HW1 {
    
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
    public static void main(String[] args) {
        getInput();
    }
    
    public static void getInput(){        
        //string userName;
        int userChoice;  // from main menu
        int currencyLimit = 1000000;
        int choice = 0; // get input to convert into another currency
        double sourseCurrency = 00.00, USD, INR, GBP, CHF;
        double currencyRate [][] = {
            { 1.000000, 1.227902, 1.012514, 0.013950 } , 
            { 0.814349, 1.000000, 0.824820, 0.011365 } ,
            { 0.987370, 1.212602, 1.000000, 0.013777 } ,
            { 71.687245, 88.022221, 72.582298, 1.000000 } ,   
        };
        
        System.out.println("Welcome to currency Converter Program");
        System.out.println("\nNow, To convert into Another Currency, First Select Your Local Currency:- "+
                            "\n\n1)  United States Dollars (USD) \n2)  British Pounds (GBP) \n3)  Swiss Francs (CHF) "
                            + "\n4)  Indian Rupees (INR) \n5)  I want to Quit the application ?");
    
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEnter Your Choice for Local currency :- ");
        userChoice = userInput.nextInt();
        
        if (userChoice == 5 ){
            System.out.print("\nThank you for choosing the program ! You Exit the program !!\n ");
        }
        else if ( userChoice > 0  && userChoice < 5 ){
                sourseCurrency = getCurrency(sourseCurrency );
            do{
                if (sourseCurrency <= currencyLimit){
                    //System.out.println("You Entered amount < 1_Million  ");
                }
                else{
                    System.out.println("Your Entered Amount > 1 million..Exceed ! Try again with amount smaller than one million. \n\n");
                      sourseCurrency= getCurrency(sourseCurrency);   
                }
            }while( sourseCurrency >= currencyLimit );
   
            switch(userChoice){
    
                case 1 :    System.out.println("\nNote that Your Entered amount is :- " + sourseCurrency + " ,"
                                               + " and Your Local Currency is :- United Stated Dollers - (USD)");
                            System.out.println("\nNow Choose From Following to Convert:- \n1)GBP \n2)CHF \n3)INR \n4)Quit!\n ") ;
                            int  a =  getUserChoice(choice);
                     
                            if(a == 1 ){
                                GBP = sourseCurrency /  currencyRate [0][1];
                               // df2.setRoundingMode(RoundingMode.UP);
                                System.out.println("\nYour Request Amount is :-  "+ sourseCurrency + " and converted amount from  Your USD to GBP is " + df2.format(GBP) );
                                System.out.println( sourseCurrency + " USD = " + String.format("%.2f", GBP) + " GBP");
                               getContinue();
                            } 
                            else if (a == 2) {
                                CHF = sourseCurrency /  currencyRate[0][2];
                               // df2.setRoundingMode(RoundingMode.UP);
                                System.out.println("\nYour Request Amount is :-  "+ sourseCurrency + " and converted amount from  Your USD to CHF is " + df2.format(CHF) );
                                System.out.println( sourseCurrency + " USD = " + String.format("%.2f", CHF) + " CHF");
                               getContinue();
                            }
                            else if (a == 3){
                               INR = sourseCurrency /  currencyRate [0][3] ;
                               // df2.setRoundingMode(RoundingMode.UP);
                                System.out.println("\nYour Request Amount is :-  "+ sourseCurrency +" and converted amount from  Your USD to INR is " + df2.format(INR) );
                               System.out.println( sourseCurrency + " USD = " + String.format("%.2f", INR) + " INR");
                               getContinue();
                            }
                            else if (a == 4){
                                 System.out.println("\nYou Exit your Code ! Bye\n");
                                System.exit(0);
                            }
                            break; 
                                
                case 2 :    System.out.println("\nNote that Your Entered amount is :- " + sourseCurrency + "  "
                                             + "and Your Local Currency is :- British Ponds - (GBP) ");
                            System.out.println("\nNow Choose From Following to Convert:- \n1)USD \n2)CHF \n3)INR \n4)Quit! \n" );
                             int  b =  getUserChoice(choice);
                    
                            if(b == 1 ){
                                USD = sourseCurrency /  currencyRate [1][0];
                               // df2.setRoundingMode(RoundingMode.UP);
                                System.out.println("\nYour Request Amount is :-  "+ sourseCurrency + " and converted amount from  GBP to USD is " + String.format("%.2f", USD) );
                                System.out.println( sourseCurrency + " GBP = " + String.format("%.2f", USD) + " USD");
                                getContinue();
                            } 
                            else if (b == 2) {
                                CHF = sourseCurrency /   currencyRate [1][2];
                               // df2.setRoundingMode(RoundingMode.UP);
                                System.out.println("\nYour Request Amount is :-  "+ sourseCurrency + " and converted amount from  GBP To CHF is " + String.format("%.2f", CHF));
                                System.out.println( sourseCurrency + " GBP = " + String.format("%.2f",CHF) + " CHF");
                                getContinue();
                            }
                            else if ( b == 3){
                                INR = sourseCurrency /  currencyRate [1][3];
                               // df2.setRoundingMode(RoundingMode.UP);
                                System.out.println("\nYour Request Amount is :-  "+ sourseCurrency +" and converted amount from  Your GBP To INR  is " + String.format("%.2f",INR) );
                                System.out.println( sourseCurrency + " GBP = " + String.format("%.2f",INR) + " INR");
                                getContinue();
                            }
                            else if (b == 4){
                                System.out.println("\nYou Exit your Code ! Bye\n");
                                System.exit(0);
                            }
                            break;         
                              
                case 3 :    System.out.println("\nNote that Your Entered amount is :- " + sourseCurrency + " "
                                + "and Your Local Currency is :- Swiss Francs - (CHF) " );            
                            System.out.println("\nNow Choose From Following to Convert:- \n1)USD \n2)GBP \n3)INR \n4)Quit! \n" );
                           int c= getUserChoice( choice);
                    
                            if( c == 1 ){
                                USD = sourseCurrency /  currencyRate [2][0];
                              //  df2.setRoundingMode(RoundingMode.UP);
                                System.out.println("\nYour Request Amount is :-  "+ sourseCurrency + " and converted amount from  Your CHF to Dollar is " + df2.format(USD) );
                                System.out.println( sourseCurrency + " CHF = " + String.format("%.2f",USD) + " USD");
                                getContinue();
                            } 
                            else if ( c == 2) {
                                GBP = sourseCurrency /  currencyRate [2][1];
                              //  df2.setRoundingMode(RoundingMode.UP);
                                System.out.println("\nYour Request Amount is :-  "+ sourseCurrency + " and converted amount from  Your CHF to GBP is " +  df2.format(GBP) );
                                System.out.println( sourseCurrency + " CHF = " + String.format("%.2f",GBP) + " GBP");
                                getContinue();
                            }
                            else if ( c == 3){
                                INR = sourseCurrency /  currencyRate [2][3];
                             //   df2.setRoundingMode(RoundingMode.UP);
                                System.out.println("\nYour Request Amount is :-  "+ sourseCurrency + " and converted amount from  Your CHF To INR is " + df2.format(INR) );
                                System.out.println( sourseCurrency + " CHF = " + String.format("%.2f",INR) + " INR");
                                getContinue();
                            }
                            else if ( c == 4){
                                System.out.println("\nYou Exit your Code ! Bye\n");
                                System.exit(0);
                            }
                            break;
                   
                case 4 :    System.out.println("\nNote that Your Entered amount is :- " + sourseCurrency + " and Your Local Currency is :- Indian Rupees - (INR) " );
                            System.out.println("\nNow Choose From Following to Convert:- \n1)USD \n2)GBP \n3)CHF \n4)Quit! \n" );
                           int  d = getUserChoice( choice);
                        
                            if(d == 1 ){
                               USD = sourseCurrency /  currencyRate[3][0];
                              //  df2.setRoundingMode(RoundingMode.UP);
                                System.out.println("\nYour Request Amount is :-  "+ sourseCurrency + " and converted amount from  Your INR to Dollar is " + String.format("%.2f",USD) );
                                System.out.println( sourseCurrency + " INR = " + String.format("%.2f",USD) + " USD");
                                getContinue();
                            } 
                            else if (d == 2) {
                                GBP = sourseCurrency /  currencyRate [3][1];
                             //   df2.setRoundingMode(RoundingMode.UP);
                               System.out.println("\nYour Request Amount is :-  "+ sourseCurrency + " and converted amount from  Your INR to GBP is " + String.format("%.2f",GBP) );
                               System.out.println( sourseCurrency + " INR = " + String.format("%.2f",GBP) + " GBP");
                               getContinue();
                            }
                            else if( d == 3){
                                CHF = sourseCurrency /  currencyRate [3][2];
                             //   df2.setRoundingMode(RoundingMode.UP);
                               System.out.println("\nYour Request Amount is :-  "+ sourseCurrency  + " and converted amount from INR to CHF is " + String.format("%.2f",CHF) );
                               System.out.println( sourseCurrency + " INR = " + String.format("%.2f",CHF) + " CHF");
                               getContinue();   
                            }
                            else if (d == 4){
                                System.out.println("\nQuit !! You Exit your Code ! Bye\n");
                               System.exit(0);
                            }    
                            break;
            
                default :   System.out.println("You have Entered invalid Choice For Your Local Currency, Please Try again .." );
                            System.out.println(" Kindly Try Again !! "); 
                            break;  
            }    
        }
        else {
            System.out.println("\nInvalid choice From given options! Try again\n\n");
            getInput();
        }
    }
        
    public static double getCurrency( double sourseCurrency  ){
        boolean isCurrency = false ;
            do{
                System.out.println("Kindly Enter Currency in your source currency < 1 million to convert:- or Press 'Q' for Quit ");
                Scanner userCurrency = new Scanner(System.in);  
                Scanner input = new Scanner(System.in);  
                if ( userCurrency.hasNextDouble() ){
                    sourseCurrency =userCurrency.nextDouble(); 
                    isCurrency = true;   
                } 
                else {
                    System.out.println("\nInvalid Currency choice ! please try again with correct currency amount \n");
                    isCurrency = false;
                    userCurrency.next();
                }
            }while ( !isCurrency );  
        return sourseCurrency;
    }
    
    public static int getUserChoice(int choice){
        
      Scanner input = new Scanner(System.in);
      choice = input.nextInt();
      if (choice > 0 && choice < 4){
      }    
      else 
          System.out.println("Invalid Choice ! Try again From Start   ");
      return choice;   
    }

    public static void getContinue(){
        
        int userInput; 
        System.out.println("\n\nHello, Do you want to convert another amount.\n1.Yes\n2.No\n");
        Scanner getInt = new Scanner(System.in);
        userInput = getInt.nextInt();
        if (userInput == 1)
                getInput();
        else{
            System.out.println("\nThank you for chosing currency convert application ! bye \n");  
            System.exit(0);
        }
    }   
}

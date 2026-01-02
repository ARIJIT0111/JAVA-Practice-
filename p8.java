//LEAP YEAR IS A YEAR HAVING 366 DAYS, WHILE THE NORMAL YEAR HAS 365 DAYS
//IF THE YEAR IS EVENLY DIVISIBLE BY 4 AND NOT DIVISIBLE BY 100, THEN IT IS A LEAP YEAR.
//IF THE YEAR IS DIVISIBLE WITH BOTH 4 AND 100 , THE WE NEED TO CHECK IF IT IS EVENLY DIVISIBLE BY 400, TO CONFIRM IT AS LEAP YEAR.

import java.util.Scanner;
public class p8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        
        
        if((year%4==0 && year%100!=0) || year% 400==0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
        
        
        sc.close();
        
    }
}
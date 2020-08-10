/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author 91909
 */
public class Switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        System.out.println("Enter your grade");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        
        if(choice > 90)
            System.out.println("you scored extremly well");
        else if(choice > 70 && choice < 90)
             System.out.println("very good");
        else if(choice > 50 && choice < 70)
               System.out.println("good");
        else if(choice > 35 && choice < 50)
                 System.out.println("less scored");
        else 
            System.out.println("FAIL");
    }
    
}

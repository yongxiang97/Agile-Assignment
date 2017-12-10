/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddeliverysystem;

import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author ChauMeng
 */
public class FoodDeliverySystem extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Maintain Menu System");
        System.out.println("=========================");
        System.out.println("1. Add Menu");
        System.out.println("2. Update Menu");
        System.out.println("3. Delete Menu");
        System.out.println("Please Select: ");
        
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        
        switch(choice){
            case 1:
                System.out.println("Please Enter the food name: ");
                String input = sc.nextLine();
                System.out.println("Please Enter the food Price: ");
                double foodprice = Double.parseDouble(sc.nextLine());
                break;
                
            case 2:
                
                break;
                
            default:
        }
    }
    
}

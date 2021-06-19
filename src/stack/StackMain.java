/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;
/**
 *
 * @author Usman Ghani Mughal
 */
public class StackMain {

    Scanner take_input=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StackImplementation obj=new StackImplementation();
        Scanner take_input=new Scanner(System.in);
        int ch,val;
        while(true)
        {
            System.out.println("\nPress 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for display");
            System.out.println("Press 4 for search");
            System.out.println("Press 5 for getSize");
            ch=take_input.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter the value you want to add :");
                    val=take_input.nextInt();
                    obj.push(val);
                    break;
                }
                case 2:
                {
                    System.out.println("this come out from Stack : "+obj.pop());
                    break;
                }
                case 3:
                {
                    obj.display();
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the value you want to search : ");
                    val=take_input.nextInt();
                    if(obj.search(val))
                    {
                        System.out.println("Yes value hass been found in Stack");
                    }
                    else
                    {
                        System.out.println("No value hass not been found in Stack");
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("This is the Size of Stack : "+obj.getSize());
                    break;
                }
                default:
                {
                    System.out.println("You Gave Wrong Input");
                }
            }
        }
    }
    
}

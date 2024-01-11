/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

import java.util.Scanner;

/**
 *
 * @author ellys
 */
public class Git {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        
        if(num1>num2){
        for(int i = num2+1;i<num1;i++){
            System.out.println(i);
        }
        }else{
               for(int i = num1+1;i<num2;i++){
            System.out.println(i); 
                }
        }
        
    }
    
}

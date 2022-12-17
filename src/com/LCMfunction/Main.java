package com.LCMfunction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        // Enter the two numbers in the input console
        System.out.println("Enter The First Number.");
        int number1 = scan.nextInt();
        System.out.println("Enter The First Number.");
        int number2 = scan.nextInt();
        System.out.print(lcm(number1, number2));
    }
    public static int lcm(int n1,int n2){
        int nm1 = 0;
        int nm2=0;
        for (int i=2;i<10;i++){
            if(n1%i==0 && n2%i==0){
                nm1=n1/i;
                nm2=n2/i;
                break;
            }

        }
        int ans=nm1*nm2;
        return ans;
    }
}

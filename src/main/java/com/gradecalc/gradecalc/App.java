package com.gradecalc.gradecalc;

import java.util.Scanner;

public class App {
	public static String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "Fail";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        
        
        String grade=calculateGrade(marks);

        System.out.println("Grade: " + grade);

        sc.close();
    }
}

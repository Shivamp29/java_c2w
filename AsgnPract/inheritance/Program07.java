package com.inheritance;


/*
 * Create a base class Course with courseName and duration. Inherit a class OnlineCourse 
 * that adds a platform and a method to display full course info.
 */

import java.util.Scanner;

class Course{
	String courseName;
	int duration;
}

class OnlineCourse extends Course{
	String platform;
	
	OnlineCourse(String coursename , int duration , String platform){
		this.courseName = coursename;
		this.duration = duration;
		this.platform = platform;
	}
	
	void showDetails() {
		System.out.println("------------------------------------");
		System.out.println("Course Details : ");
		System.out.println("courseName : " +courseName);
		System.out.println("duration : "+duration +" Months");
		System.out.println("platform : "+platform);

	}
}


public class Program07 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Enter CourseName : ");
        String CourseName = ip.nextLine();
        
        System.out.print("Enter duration : ");
        int duration = ip.nextInt();
        
        System.out.print("Enter platform: ");
        String platform = ip.next();
        
        OnlineCourse o = new OnlineCourse(CourseName, duration, platform);
        o.showDetails();
      }
}
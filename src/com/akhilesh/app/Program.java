package com.akhilesh.app;
import com.akhilesh.app.entity.Employee;
import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Enter id");
        emp.setId(input.nextInt());

        System.out.println("Enter your name: ");
        emp.setName(input.next());


        System.out.println("Your name is: "+emp.getId()+" "+emp.getName());
        
        
    }
}
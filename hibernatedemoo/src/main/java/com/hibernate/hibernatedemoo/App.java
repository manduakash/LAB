package com.hibernate.hibernatedemoo;

import java.util.Scanner;

import com.hibernate.hibernatedemoo.DaoImpl.StudentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
       StudentDaoImpl dao = new StudentDaoImpl();
       do{
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("PRESS 1 for add student \n PRESS 2 for display student");
    	   int a = sc.nextInt();
    	   switch(a) {
    	   case 1: dao.addStudent();
    	   break;
    	   case 2: dao.fetchStudent();
    	   break;
    	   }
       }while(true);
    }
}

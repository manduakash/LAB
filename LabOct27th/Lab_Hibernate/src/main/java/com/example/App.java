package com.example;
/*
@Author Sankhajit Roy
*/

import com.example.daoimpl.StudentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	// created a StudentDaoImpl class object and called the method
        StudentDaoImpl std = new StudentDaoImpl();
        std.addStudent();
    }
}

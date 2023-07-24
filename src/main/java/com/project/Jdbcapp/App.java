package com.project.Jdbcapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.project.dao.StudentDao;
import com.project.entities.StudentsEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, SQLException
    {
//        System.out.println("Press 1 for add Student");
//        System.out.println("Press 2 for delete Student");
//        System.out.println("Press 3 to update Student");
//        System.out.println("Press 4 to view Students");
//        System.out.println("Press 5 to exit");
        
        while(true) {
        	System.out.println("Press 1 for add Student");
            System.out.println("Press 2 for delete Student");
            System.out.println("Press 3 to update Student");
            System.out.println("Press 4 to view Students");
            System.out.println("Press 5 to exit");
            System.out.println("-------------------------------------------------------------------");
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	String s = br.readLine();
        	Integer i = Integer.parseInt(s);
        	if(i==1) {
        		System.out.print("Enter name of Student : ");
        		String sname = br.readLine();
        		System.out.print("Enter the mob no : ");
        		String smob = br.readLine();
        		StudentsEntity stu = new StudentsEntity(sname, smob);
        		StudentDao.addStudent(stu);
        		System.out.println("Student added successfully....");
        		System.out.println("*************************************************");
        		
        	}else if(i==2) {
        		System.out.println("Enter the name of Student : ");
        		String sname = br.readLine();
        		StudentDao.deleteStudent(sname);
        		System.out.println(sname+" is deleted successfully...");
        		System.out.println("*************************************************");
        		
        	}else if(i==3) {
        		System.out.println("Enter the old name of Student : ");
        		String oldname = br.readLine();
        		System.out.println("Enter the new name of Student : ");
        		String newname = br.readLine();
        		StudentDao.updateStudent(oldname,newname);
        		System.out.println("Name is updated...");
        		System.out.println("*************************************************");
        		
        	}else if(i==4) {
        		System.out.println("The student details are as follows");
        		System.out.println("------------------------------------------------");
        		StudentDao.showStudents();
        		
        	}else
        		break;
        	
        }
        
    }
}

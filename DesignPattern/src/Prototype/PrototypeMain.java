package Prototype;

import java.io.IOException;
import java.util.Scanner;

public class PrototypeMain {
	public static void main(String[] args) throws IOException {  
        
   	   Scanner br=new Scanner(System.in);
       System.out.print("Enter Employee Id: ");  
       int eid=Integer.parseInt(br.nextLine());  
       System.out.print("\n");  
         
       System.out.print("Enter Employee Name: ");  
       String ename=br.nextLine();  
       System.out.print("\n");  
         
       System.out.print("Enter Employee Designation: ");  
       String edesignation=br.nextLine();  
       System.out.print("\n");  
      	          
       System.out.print("Enter Employee Salary: ");  
       double esalary= Double.parseDouble(br.nextLine());  
       System.out.print("\n");  
          
       EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary);  
         
       e1.showRecord();  
       e1.show();
       System.out.println("\n");  
       EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
       e2.showRecord();  
   }     

}
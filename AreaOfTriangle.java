/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

/**
 *
 * @author MOHAMED SAMEER AHMED
 */
public class AreaOfTriangle {
    
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Program to calculate the area of Triangle using two different formula");
        
        System.out.println("Method 1:");
        
        System.out.println("Enter the breadth of the triangle");
        
        float b = sc.nextFloat() ;
        
        System.out.println("Enter the height of the triangle");
        
        float h  = sc.nextFloat();
        
        float area = (b*h)*(1f/2f);
        
        System.out.println("Area using method 1 is "+area);
        
        
        System.out.println("Ara using method 2 :");
        
        System.out.println("Enter the three sides X,Y,Z to calculate the area of triangle");
        
        float x = sc.nextFloat();
        
        float y = sc.nextFloat();
                
        float z = sc.nextFloat();
        

        float s = (0.5f)*(x+y+z);

        System.out.println(" S value is "+s);
        
        float a = (float)Math.sqrt((s*(s-x)*(s-y)*(s-z)));//As math.sqrt returns double I used float for type conversion so that it can be compatible.
                
        System.out.println("Area using method 2 is "+a);
        
        sc.close();
    }
    
}

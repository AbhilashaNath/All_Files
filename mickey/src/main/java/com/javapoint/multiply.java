package com.javapoint;


import org.testng.annotations.Parameters;  
import org.testng.annotations.Test;  
public class multiply   
{  
@Test  
@Parameters({"a","b"})  
public void add(int c, int d)  
{  
int mul=c*d;  
System.out.println("Multiplication of two numbers : "+mul);  
}  
}  
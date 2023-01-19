package com.manas.oop;

public class SumOfDigits {  
public static void main(String args[])  
{  
int n = 236, size, sum = 0;     
System.out.println(n);
while(n > 0)  
{      
size = n % 10;    
sum = sum + size;    
n = n / 10;  
}   
System.out.println("Sum of Digits: "+sum);  
}  
}  
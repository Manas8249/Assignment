package com.manas.oop;

public class ArrayGreater  {  
    public static void main(String[] args) {  
  
        int arr []= {25, 11, 7, 75, 56};   
        
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Greater is : " + max);  
    }  
}  
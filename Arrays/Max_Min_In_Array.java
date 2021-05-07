package com.dataStruct;

//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Max_Min_In_Array
{
  public static void main(String args[])throws IOException
  {
	  
      
      Get obj = new Get();
      int [] arr = {1, 5, 2, 0, 40, 52};
      int n = arr.length;
      System.out.println(obj.maximumElement(arr, n) + " " + obj.minimumElement(arr, n));
          
     }
  
}

//} Max_Min_In_Array Code Ends


//User function Template for Java

class Get
{
  public static int maximumElement(int arr[],int n)
  {
	  // Code to find Maximum Value
      int max = -1;
      
      for(int i = 0; i < n; i++) {
          if(arr[i] > max) {
              max = arr[i];
          }
      }
      return max;
  
  }
  
  public static int minimumElement(int arr[],int n)
  {
      // Code to find Minimum Value
      int min = Integer.MAX_VALUE;
      for(int i = 0; i < n; i++) {
          if(arr[i] < min) {
              min = arr[i];
          }
      }
      return min;
  }
}
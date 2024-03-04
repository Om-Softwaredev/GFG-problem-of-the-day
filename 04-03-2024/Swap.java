//https://www.geeksforgeeks.org/problems/need-some-change/1
/*
    Given an array arr of n positive integers. 
    The task is to swap every ith element of 
    the array with (i+2)th element.
*/
import java.util.*;
class Swap
{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of lement in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter " + n + " element in array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        swapElements(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    // this function should be used in gfg
    public static void swapElements(int[] arr, int n)
    {
        // Code here
   
        for(int i=0;i<n-2;i++){
           int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
    }
}
package com.company;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        boolean isSorted=true;
        int arr[]={1,2100,3,466,5,32,46};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted ");
        }
        else {
            System.out.println("The array is not sorted ");
        }
    }
}

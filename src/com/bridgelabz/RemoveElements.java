package com.bridgelabz;

public class RemoveElements {
    public static int removeDuplicates(int array[], int n){
        if(n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for(int i=0; i<n-1; i++){
            if(array[i] != array[i+1]){
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[n-1];
//Changing the original array
        for(int i=0; i<j; i++){
            array[i] = temp[i];
        }
        return j;
    }
    public static void main (String[] args) {
        int array[] = {18,1,2,2,3,8,5,15};
        int length = array.length;
        System.out.println("Elements of array: ");
        for (int i=0;i<length;i++) {
            System.out.print(array[i]+" ");
        }
            length = removeDuplicates(array, length);
//Printing The array elements
        System.out.println("");
        System.out.println("After removing duplicate elements: ");
        for(int i=0; i<length; i++)

            System.out.print(array[i]+" ");

    }
}

package com.bridgelabz;

import java.util.Scanner;

public class DuplicateElement {

    public static void main(String[] args) {
        int a[] = {10, 12, 45, 67, 33,33, 12, 12, 78};
        int size = a.length;
        System.out.println("size of array: " + size);
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse array: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Duplicate Elements: ");
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (a[i] == a[j])
                    System.out.print(a[j] + " ");
            }
        }
    }


}

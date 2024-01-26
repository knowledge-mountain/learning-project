package com.learning.simplerestapi;

public class PairsNumber {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 0, 1, 6, 2, 3, 11, -9, 1, -10};
        int number = new PairsNumber().countIterations(arr);
        System.out.println("The length of array = " + arr.length);
        System.out.println("The square of array.length = " + arr.length * arr.length);
        System.out.println("The number iterations = " + number);
    }

    public int calcPairsNaive(int[] arr, int checkSum) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == checkSum) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public int countIterations(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                count++;
            }
        }
        return count;
    }
}

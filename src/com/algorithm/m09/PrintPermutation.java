package com.algorithm.m09;

public class PrintPermutation {
    public void printPermutation(int n, int[] A, int cur) {
        if (cur == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(A[i]+" ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                boolean ok = true;
                for (int j = 0; j < cur; j++) {
                    if (A[j] == i) {
                        ok = false;
                    }
                }
                if (ok) {
                    A[cur] = i;
                    printPermutation(n, A, cur + 1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        PrintPermutation printPermutation = new PrintPermutation();
        printPermutation.printPermutation(5, A, 0);
    }
}

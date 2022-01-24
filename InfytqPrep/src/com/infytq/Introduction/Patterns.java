package com.infytq.Introduction;

public class Patterns {
    public static void main(String[] args) {
        pattern9(4);
    }
    static void pattern9 (int n) {
        for(int row = 1; row <= 2 * n; row++) {
            for (int col = 1; col <= 2 * n; col++) {
                int atEveryIndex = 242;
                System.out.println(atEveryIndex);
            }
            System.out.println();
        }
    }
    static void pattern8 (int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int space = 1; space <= n - c; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
    }
    static void pattern7 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
    }
    static void pattern6 (int n) {
        int row, col;
        for ( row = 1; row < 2 * n; row++) {
            int totalColsRow = row > n ? n - (row - n) : row;
            int noOfSpaces = n - totalColsRow;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }
            for ( col = 1; col <= totalColsRow ; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    static void pattern5 (int n) {
        int row, col;
        for ( row = 1; row < 2 * n; row++) {
            int totalColsRow = row > n ? n - (row - n) : row;
            for ( col = 1; col <= totalColsRow ; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern1 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern2 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    static void pattern3 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1 ; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    static void pattern4 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}

package com.infytq.Introduction;
import java.util.*;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] fuel = new int[n];
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) fuel[i] = sc.nextInt();
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            for(int i = 0; i < n; i++){
                int carryPrev = 0;
                int currentFuel = fuel[i];
                for(int j = i; j < n + i; j++){
                    int index = (j + 1) % n;
                    if(currentFuel < arr[index])
                        break;
                    carryPrev = currentFuel - arr[index];
                    currentFuel = fuel[index + 1] + carryPrev;
                }
            }
        }

    }
}



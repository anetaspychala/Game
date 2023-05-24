package org.example;

import java.util.Random;
import java.util.Scanner;

public class zaduzozamalo {
    private int x; //pole
    private int y;
    public void letsPlay(){
    int x = drawIntNumber1();
    int y = getNumber1();

        while (x != y) {
        if (x > y) {
            System.out.println("za mało");
        } else if (x < y) {
            System.out.println("za duzo");
        }
        y = getNumber1(); // Aktualizacja wartości y
    }

        System.out.println("jest ok");
}

    public static int drawIntNumber1() {
        Random rnd = new Random();
        int computerNumber = rnd.nextInt(101); // Losowanie liczby od 0 do 100
        return computerNumber;
    }

    public static int getNumber1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij liczbę");
        int userNumber = scanner.nextInt();
        return userNumber;
    }
}
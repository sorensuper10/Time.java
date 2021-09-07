package com.company;

public class Main {

    public static void main(String[] args) {
        int hour = 18;
        int minute = 0;
        System.out.print("Number of seconds since midnight: ");
        System.out.print(hour*60*60 + minute);

        int time = 6;
        System.out.print(" Number of seconds remaining in a day: ");
        System.out.print(time*60*60);

        System.out.print(" Percent of the day that has passed:");
        System.out.print(hour*100/24);

        int m = 30;
        System.out.print(" Time since I started working on this exercise:");
        System.out.print(m-minute);
    }
}

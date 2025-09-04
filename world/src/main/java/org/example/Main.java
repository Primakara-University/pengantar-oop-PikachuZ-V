package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Halo Silahkan Input Nama : ");
        String nama = scanner.nextLine();

        System.out.println();
        System.out.println("Halo, " + nama+ "!");
        System.out.println("Selamat Datang di program saya");

        scanner.close();

    }
}
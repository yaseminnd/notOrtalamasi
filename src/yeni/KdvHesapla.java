package yeni;

import java.util.Scanner;

public class KdvHesapla {

    public static void main(String[] args) {
        double tutar, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarı Giriniz: ");
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;
        System.out.println("Kdv Oranı: " + kdvOran);
        System.out.println("Kdv Tutarı: " + kdvTutar);
        System.out.println("Kdv'li Tutar: " + kdvliTutar );
    }
}
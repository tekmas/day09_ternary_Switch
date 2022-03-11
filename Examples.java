package day09_ternary_Switch;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir sayı girin");
        double sayi = scan.nextDouble();

        if ((sayi > 999) && (sayi <= 9999)) {
            if (sayi % 5 == 0) {
                if (sayi % 10 == 0) {
                    System.out.println("girilen sayı 5'e bölünebilen 4 basamaklı pozitif bir çift sayıdır");
                } else {
                    System.out.println("girilen sayı 5'e bölünebilen 4 basamaklı pozitif bir tek sayıdır");
                }
            } else {
                System.out.println("girilen sayı 5'e bölünemeyen 4 basamaklı pozitif bir sayıdır");
            }
        }
        else if ((sayi < -999) && (sayi >= -9999)){
            if (sayi % 5 == 0) {
                if (sayi % 10 == 0) {
                    System.out.println("girilen sayı 5'e bölünebilen 4 basamaklı negatif bir çift sayıdır");
                } else {
                    System.out.println("girilen sayı 5'e bölünebilen 4 basamaklı negatif bir tek sayıdır");
                }
            } else {
                System.out.println("girilen sayı 5'e bölünemeyen 4 basamaklı negatif bir sayıdır");
            }
        }

        else if (sayi!=0000){
            System.out.println("girilen sayı 4 basamaklı bir sayı değildir");
        }
        else {
            System.out.println("lütfen geçerli bir sayı girin");
        }
    }
}
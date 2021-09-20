package Mentora;

import java.util.Scanner;

public class _3_OrnekJavaSorusu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Kardes Sayisini Giriniz : ");
        int kardesSayisi = sc.nextInt();
        System.out.print("Kutuda Kac Dondurma Var : ");
        int dondurma = sc.nextInt();
        paylastir(kardesSayisi, dondurma);
    }

    public static void paylastir(int kardes, int dondurma) {

        if (dondurma%kardes==0 && dondurma>kardes) {
            System.out.println("ver");
        }

        else System.out.println("kendin ye");
    }
}

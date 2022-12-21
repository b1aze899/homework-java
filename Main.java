package com.company;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        float d;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длинну шеста h=");
        float h = in.nextFloat();
        System.out.print("Улитка поднялась за день на a=");
        float a = in.nextFloat();
        System.out.print("Улитка спустилась за ночь b=");
        float b = in.nextFloat();
        if (a < b) {
            System.out.println("Не доползет");
        } else if (a == b) {
            System.out.println("Будет ползать туда-сюда");
        } else {
            d = h / (a - b);
            System.out.println("Доползет за " + d + " д");
        }
    }
}
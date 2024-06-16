package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    System.out.println("あなたの年齢を入力してください");
    Scanner scanner1 = new Scanner(System.in);
    String ageString = scanner1.nextLine();
    int age = Integer.parseInt(ageString);

    int fortune = new Random().nextInt(3);
    System.out.println("結果が出ました");
    System.out.println(age + "歳の" + name + "さん、あなたの番号は" + fortune + "です。");
  }
}
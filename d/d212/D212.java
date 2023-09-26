package paiza.d.d212;

import java.util.Scanner;

public class D212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine()); //長さ
        int totalLength = length * 10;
        		
        System.out.println(totalLength);
        
        /* 
         * 【疑問点】
         * Scannerが閉じられていないと警告が出ますが、基本的にcloseメソッドを記載しておいた方が良いでしょうか。
         * Javaの公式文書ではcloseメソッドの使用を推奨しており、良いプラクティスとされているようでしたが
         * 小規模コードでも毎回記載する方が良いでしょうか。
         */
        sc.close();
    }
}

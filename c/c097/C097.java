package paiza.c.c097;

import java.util.Scanner;

/**
 * paizaスキルチェック
 * C097の問題です。
 * プレゼント当選者を計算するプログラムです。
 */
public class C097 {
    /**
     * メインメソッドはプログラムのエントリーポイントです。
     * @param args 引数（未使用）
     */
    public static void main(String[] args) {
    	// 標準入力からデータを読み取る
        Scanner sc = new Scanner(System.in);
               
        // 応募者の人数
        int numberOfApplicants = sc.nextInt();
        
        // プレゼントAの倍数で当選者となる整数Xを取得
        int x = sc.nextInt();
        
        // プレゼントBの倍数で当選者となる整数Yを取得
        int y = sc.nextInt();
        
        // 各応募者について当選情報を出力
        for (int i = 1; i <= numberOfApplicants; i++) {
        	if (i % x == 0 && i % y == 0) {
        		System.out.println("AB");
        	}
        	else if (i % x == 0) {
        		System.out.println("A");
        	}
        	else if (i % y == 0) {
        		System.out.println("B");
        	}
        	else {
        		System.out.println("N");
        	}
        }
        
        // スキャナーを閉じる
        sc.close();
    }
}

package paiza.b.b131;

import java.util.Scanner;

/**
 * paizaスキルチェック
 * B131の問題です。
 * 指定されたルートを辿った場合にかかる運賃を表す整数を出力するプログラムです。
 */
public class B131 {
    /**
     * メインメソッドはプログラムのエントリーポイントです。
     * @param args 引数（未使用）
     */
    public static void main(String[] args) {
    	// 標準入力からデータを読み取る
        Scanner sc = new Scanner(System.in);
        
        // 路線の数と駅の数を取得
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 運賃を格納する二次元配列
        int[][] fare = new int[N][M];
        
        // 運賃表を読み込む
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                fare[i][j] = sc.nextInt();
            }
        }
        
        // ゴールまでの経由駅の数を取得
        int X = sc.nextInt(); // 経由駅の数
        int totalFare = 0;
        int currentStation = 0; // 現在の駅は1番目の路線の1番目の駅

        // 経由駅を順に移動して運賃を計算
        for (int i = 0; i < X; i++) {
            int targetRoute = sc.nextInt() - 1; // 路線のインデックス
            int targetStation = sc.nextInt() - 1; // 駅のインデックス
            int fareDifference = fare[targetRoute][targetStation] - fare[targetRoute][currentStation];

            totalFare += Math.abs(fareDifference); // 運賃の差額は絶対値を取る
            currentStation = targetStation;
        }

        System.out.println(totalFare);
        
        // スキャナーを閉じる
        sc.close();
    }
}

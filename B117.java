package paiza.b.b117;

import java.util.Scanner;

/**
 * paizaスキルチェック
 * B117の問題です。
 * 最後に公道に出る教習車が公道に出るまで教習所内のコースを何周する必要があるか求めるプログラムです。
 */
public class B117 {
    /**
     * メインメソッドはプログラムのエントリーポイントです。
     * @param args 引数（未使用）
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 教習車の台数
        int[] carOrder = new int[N]; // 教習車の出発順序
        
        // 各教習車の出発順序を読み込み、carOrder配列に格納
        for (int i = 0; i < N; i++) {
            carOrder[i] = sc.nextInt();
        }

        int laps = 0; // コースを回った回数
        int nextCarToExit = 1; // 次に出て行く教習車の車番

        for (int i = 0; i < N; i++) {
            if (carOrder[i] == nextCarToExit) {
                // 次に出て行く教習車が見つかった場合
                nextCarToExit++;
            } else {
                // 次に出て行く教習車でない場合、コースを周回する
                laps++;
            }

            if (laps > 0 && carOrder[i] == 1) {
                break; // 最初に出発した教習車が公道に出たら終了
            }
        }
        
        System.out.println(laps); // コースを周回した回数を出力
        
        sc.close();
    }
}

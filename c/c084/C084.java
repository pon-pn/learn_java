package paiza.c.c084;
import java.util.Scanner;

/**
 * paizaスキルチェック
 * C084の問題です。
 * 標準入力から渡された文字列を装飾して表示するプログラムで
 * 文字列を "+" の枠で囲み表示します。
 */
public class C084 {
    /**
     * メインメソッドはプログラムのエントリーポイントです。
     * @param args 引数（未使用）
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // ユーザーからの入力を受け取る
        String inputText = sc.nextLine();
        
        // 入力文字列の長さを取得
        int textLength = inputText.length(); 
        // "+" を文字列の長さに応じて繰り返し、枠を生成
        String textFrame = "+".repeat(textLength + 2);
        
        // 上枠を表示
        System.out.println(textFrame);
        // 入力文字列を枠で囲んで表示
        System.out.println("+" + inputText + "+");
        // 下枠を表示
        System.out.println(textFrame);
        
        // スキャナーを閉じる
        sc.close();
    }
}

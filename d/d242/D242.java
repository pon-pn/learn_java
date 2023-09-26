/* 
 * 【疑問点】
 * パッケージ宣言 package paiza.d.d242; の部分は記載しておくほうがベターでしょうか。
 * Eclipseで新規作成時に自動生成されますが、今回のような小規模コードの場合では削除しても問題ないかと思いました。
 * しかし、プログラムのファイル構造と一致していることを表記するためにやはり必要なのでしょうか。
 */
package paiza.d.d242;

import java.util.Scanner;

public class D242 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ユーザーからの入力を読み取る

		int originalMoney = Integer.parseInt(sc.nextLine()); // 所持金額
		int profit = Integer.parseInt(sc.nextLine()); // 利益額
		int loss = Integer.parseInt(sc.nextLine()); // 損失額

		int currentMoney = originalMoney + profit - loss; // 現在の所持金額

		System.out.println(currentMoney);

		sc.close();
	}
}

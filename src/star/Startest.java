// 다음과 같이 동작하는 프로그램을 작성 해 봅니다. (for)
// 줄 수를 입력하세요==> 5
// *
// **
// ***
// ****
// *****

package star;

import java.util.Scanner;
public class Startest {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int rows;
			
			System.out.println("줄 수를 입력하세요");
			rows = sc.nextInt();
			
			for (int i=1; i<=rows; i++) {
				for (int j=1; j<=i; j++) {
					System.out.print("*");
			}
			System.out.println();
		}
}
}
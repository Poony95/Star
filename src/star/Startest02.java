// 다음과 같이 동작하는 프로그램을 작성 해 봅니다. (do while)
// 줄 수를 입력하세요==> 5
// *
// **
// ***
// ****
// *****

package star;

import java.util.Scanner;
public class Startest02 {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int rows;
			
			System.out.println("줄수를 입력하세요");
			rows = sc.nextInt();
			
			int i=1;
			do {
				int j=1;
				do {
					System.out.print("*");
					j++;
				} while (j <=i);
				System.out.println();
				i++;
			} while (i <= rows);
}
}
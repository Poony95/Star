/*
	다음과 같이 동작하는 프로그램을 작성해봅니다.

	줄수를 입력하세요==>3
	칸수를 입력하세요==>5
	*****
	*****
	*****
*/

package star;

import java.util.Scanner;
public class Startest03 {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int rows=0;
			int cols=0;
			
			System.out.println("줄수를 입력하세요");
			rows = sc.nextInt();
			
			System.out.println("칸수를 입력하세요");
			cols = sc.nextInt();
			
			for(int i=1; i<=rows; i++) {
				for(int j=1; j<=cols; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
//세 수 
//20191231
//ifAlgorithm

import java.util.Scanner;

public class Q10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A;
		int B;
		int C;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		if (A <= B) {
			if (A <= C) {
				if (C < B)
					System.out.println(C);
				if (C >= B)
					System.out.println(B);
			} else if (A > C)
				System.out.println(A);
		}
		if (A > B) {
			if (B <= C) {
				if (A > C)
					System.out.println(C);
				if (A <= C)
					System.out.println(A);

			} else if (B > C)
				System.out.println(B);
		}

		sc.close();
	}

}

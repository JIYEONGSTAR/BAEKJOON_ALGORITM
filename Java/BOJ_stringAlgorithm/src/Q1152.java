//�ܾ��� ����
//20200109
//stringAlgorithm

import java.util.Scanner;

public class Q1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String word[] = n.split(" ");
		int countspace = 0;
		char ch[] = n.toCharArray();// �ܾ� �����ϱ� ���� ' '���� �˾ƺ��� ����
		for (int i = 0; i < word.length; i++) {
			if (ch[i] == (char) 32)
				countspace++;
			else
				break;
		}

		System.out.println(word.length - countspace);
		sc.close();
	}

}

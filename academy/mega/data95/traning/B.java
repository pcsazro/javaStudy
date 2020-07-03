package training;

import java.util.Scanner;

public class B {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String n[] = new String[3];

		for (int i = 0; i < n.length; i++) {
			System.out.print("data�엯�젰 >> ");
			n[i] = sc.next();
		}

		for (int k = 0; k < n.length; k++) {
			if ((int) n[k].charAt(7) == '1') {
				System.out.println("�궓�옄");
			} else {
				System.out.println("�뿬�옄");
			}
		}
		sc.close();

	}
}

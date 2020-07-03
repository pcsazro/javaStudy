package training; 

public class A {

	public static void main(String args[]) {

		int num[] = new int[100];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		int three = 0;
		for (int j = 0; j < num.length; j++) {
			if ((num[j] % 3) == 0) {
				three = three + num[j];
			} else {
			}
		}
		System.out.println(three);
		
		int five = 0;
		for (int k = 0; k < num.length; k++) {
			if ((num[k] % 5) == 0) {
				five = five + num[k];
			}
		}
		System.out.println(five);

	}
}

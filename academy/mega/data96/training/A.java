package training;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		String A = "aabbbcc";
		ArrayList<String> Alist = new ArrayList<String>();
//		String[] Alist2 = new String[3];
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int i = 0; i < A.length(); i++) {
			Alist.add(A.substring(i, i+1));
		}
		
		for (int j = 0; j < Alist.size(); j++) {
			if (Alist.get(j).equals("a")) {
				a = a + 1;
			} else if (Alist.get(j).equals("b")) {
				b = b + 1;
			} else if (Alist.get(j).equals("c")) {
				c = c + 1;
			}
		}
		
		System.out.println("a("+a+")"+"b("+b+")"+"c("+c+")");
		
	}

}

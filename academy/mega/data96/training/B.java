package training;

import java.util.ArrayList;
import java.util.HashSet;

public class B {

	public static void main(String[] args) {
		String B1 = "나는 사람, 너도 사람, 우리도 사람, 모두 다 사람";
		String[] Blist = B1.split(",");

		for (int i = 0; i < Blist.length; i++) {
			System.out.println(Blist[i]);
		}

		int h = 0;
		for (int i = 0; i < Blist.length; i++) {
			if (Blist[i].contains("사람")) {
				h = h + 1;
			}
		}
		System.out.println("사람(" + h + ")");

		String B2 = "나는 사람 너도 사람 우리도 사람 모두다 사람";
		String[] Blist2 = B2.split(" ");

		HashSet<String> Bset = new HashSet<String>();
		for (int i = 0; i < Blist2.length; i++) {
			Bset.add(Blist2[i]);
		}

		ArrayList<String> Blist3 = new ArrayList<String>(Bset);
		
		for (int i = 0; i < Blist3.size(); i++) {
			for (int j = 0; j < Blist2.length; j++) {
				if (Blist3.get(i).equals(Blist2[j])) {
				}
			}
		}

	}
}

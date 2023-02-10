package daliy_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day_14_2023_01_30 {

	public static void main(String[] args) {
		List<Integer> in = new ArrayList<Integer>();
		List<Integer> out = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int min = 0;
		int count = 0;

		for (int i = 1; i <= max; i++) {
			in.add(sc.nextInt());
		}
		for (int i = 0; i <= max - 1; i++) {
			if (in.get(i) != 0) {
				out.add(in.get(i));
			} else {
				for (int j = 0; j <= out.size() - 1; j++) {
					if(j==0) {
						if(out.get(j)==0) {
							System.out.println(0 + "b");

							break;							
						}else {
							min = out.get(0);
						}
					}
					if (out.size() == 1) {
					} else if (Math.abs(min) > Math.abs(out.get(j))) {
						min = out.get(j);
						count = j;
					}else if(Math.abs(min) == Math.abs(out.get(j))) {
						if(min>out.get(j)) {
							min = out.get(j);
							count = j;							
						}
					}
				}
				System.out.println(out);
//				if (!out.isEmpty()) {
//					out.remove(count);
//				}
				System.out.println(min + "a");

			}
		}

	}

}

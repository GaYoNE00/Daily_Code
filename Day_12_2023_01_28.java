package daliy_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> rslist = new ArrayList<Integer>();

		System.out.print("최대값을 정해주세요 : ");
		int max = sc.nextInt();
		for (int i = 1; i <= max; i++) {
			list.add(sc.nextInt());
			rslist.add(0);
		}
		list.add(0);
		for (int j = 0; j <= max - 1; j++) {
			for (int t = 1; t <= max - j; t++) {
				if (list.get(j) < list.get(j + t)) {
					rslist.set(j, list.get(j + t));
					break;
				} else {
					rslist.set(j, -1);
				}
				System.out.println(list.get(j) + " < " + list.get(j + 1));
			}
		}
		list.remove(max);

		System.out.println("입력 값 = " + list);
		System.out.println("출력 값 = " + rslist);

	}

}

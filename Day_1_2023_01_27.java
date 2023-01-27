import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day_1_2023_01_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int get;
		int max;

		List<Integer> seq = new ArrayList<>();
		List<String> ans = new ArrayList<>();

		System.out.print("최대값을 지정하세요 : ");
		max = sc.nextInt();
		int I = 1;
		for (int i = 1; i <= max; i++) {

			System.out.print("값을 지정하세요 : ");
			get = sc.nextInt();
			int j = 1;

			while (j <= get) {
				j++;
				if (seq.isEmpty()) {
					seq.add(I++);
					ans.add("+");
				}
				if (Collections.max(seq) == get) {
					seq.remove(seq.size() - 1);
					ans.add("-");
					break;
				} else if (I <= get) {
					seq.add(I++);
					ans.add("+");

				} else {
					System.out.println("NO");
					i--;
					break;

				}
			}

		}
		System.out.println(ans);

	}

}

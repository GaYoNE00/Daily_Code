import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day_18_2023_02_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = sc.nextInt(), min = 0, count = 0, sum = 0;

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list_out = new ArrayList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer tokenizer = new StringTokenizer(br.readLine());
			while (tokenizer.hasMoreTokens()) {
				list.add(Integer.parseInt(tokenizer.nextToken()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i <= list.size() - 1; i++) {
			min = list.get(i);
			count = 0;
			for (int j = 0; j <= list.size() - 1; j++) {
				if (min > list.get(j)) {
					min = list.get(j);
					count = j;
				}
			}
			list_out.add(min);
			list.remove(count);
			i--;
		}
		for (int s = 0; s <= list_out.size() - 1; s++) {
			for (int s1 = 0; s1 <= s; s1++) {
				sum += list_out.get(s1);
			}
		}
		System.out.println(sum);

	}

}

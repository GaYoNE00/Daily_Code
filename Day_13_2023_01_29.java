package daliy_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day_13_2023_01_29 {

	public static void main(String[] args) {
		List<Integer> card = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		for (int i = 1; i <= max; i++) {
			card.add(i);
		}
		for (int j = 0; j <= max; j++) {
			card.remove(0);
			if (card.size() <= 1) {
				break;
			} else {
				card.add(card.get(0));
				card.remove(0);
			}
		}
		System.out.println("마지막 남은 카드 : "+card);
	}

}

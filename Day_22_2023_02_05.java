import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day_22_2023_02_05 {
	public static void main(String[] args) {
		List<Integer> lsin = new ArrayList<Integer>();
		List<Integer> lsout = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		int value = 0, count = 0;
		int min;
		for (int i = 0; i <= max - 1; i++) {
			lsin.add(sc.nextInt());
		}
		for (int i = 0; i <= lsin.size() - 1; i++) {
			value = lsin.get(i);
			count = i;
			for (int j = 0; j <= lsin.size() - 2; j++) {
				if (value > lsin.get(j + 1)) {
					value = lsin.get(j + 1);
					count = j + 1;
				}
			}
			lsout.add(value);
			lsin.remove(count);
			i--;
		}
		for(int i = 0; i<=lsout.size()-1;i++) {
			System.out.println(lsout.get(i));
		}
	}
}

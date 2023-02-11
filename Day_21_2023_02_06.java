import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day_21_2023_02_06 {
	
	static List<Integer> in = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b, c, count=0;
		
		for(int i=a; i >= 1; i--) {
			in.add(i);
			System.out.print(i+" ");
		}

		for(int i=0; i <= a-2; i++) {
			b = in.get(0);
			c = in.get(1);
			
			if(b>c) {
				in.set(0,c);
				in.set(1,b);				
				count++;
			}
		}
		System.out.println("\n"+ count);
		System.out.println(in);
	}

}

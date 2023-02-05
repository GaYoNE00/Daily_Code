import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Day_19_2023_02_04 {
	static int max, k, min, count;
	static List<Integer> in = new ArrayList<Integer>();
	static List<Integer> out = new ArrayList<Integer>();
	public static void set() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//			while(tokenizer.hasMoreTokens()) {
//				//System.out.println(Integer.parseInt(tokenizer.nextToken()));
//			}
			max = Integer.parseInt(tokenizer.nextToken());
			k = Integer.parseInt(tokenizer.nextToken());
//			System.out.println(max+" "+k);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer tokenizer = new StringTokenizer(br.readLine());
			while(tokenizer.hasMoreTokens()) {
				in.add(Integer.parseInt(tokenizer.nextToken()));				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void oleum() {
		for(int i = 0; i<=in.size()-1; i++) {
			min = in.get(i);
			count = i;
			for(int j=0; j<=in.size()-1; j++) {
				if(min>in.get(j)) {
					min=in.get(j);
					count = j;
				}
			}
			out.add(min);
			in.remove(count);
			i--;
		}
		System.out.println(out.get(k-1));
		System.out.println(out);
	}
	public static void main(String[] args) {
		set();
		input();
		oleum();
		
	}

}

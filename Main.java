package daliy_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
	static List<Integer> in_a = new ArrayList<Integer>();
	static List<Integer> in_b = new ArrayList<Integer>();
	static int max,result;
	
	public static void main(String[] args) {
		a();
		b();
		as();
	}
	static void a() {
		Scanner sc = new Scanner(System.in);
		max = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer tokenizer = new StringTokenizer(br.readLine());
			while(tokenizer.hasMoreTokens()) {
				in_a.add(Integer.parseInt(tokenizer.nextToken()));				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	static void b() {
		Scanner sc = new Scanner(System.in);
		max = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer tokenizer = new StringTokenizer(br.readLine());
			while(tokenizer.hasMoreTokens()) {
				in_b.add(Integer.parseInt(tokenizer.nextToken()));				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	static void as() {
		for(int i = 0; i<=in_b.size()-1; i++) {
			for(int j = 0; j<=in_a.size()-1; j++) {
				if(in_b.get(i)==in_a.get(j)) {
					result = 1;
					break;
				}else {
					result = 0;					
				}
			}
			System.out.println(result);
		}
	}

}

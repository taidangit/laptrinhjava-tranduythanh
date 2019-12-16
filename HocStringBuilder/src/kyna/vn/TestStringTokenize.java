package kyna.vn;

import java.util.StringTokenizer;

public class TestStringTokenize {

	public static void main(String[] args) {
		String s1="Obama Putin Un";
		StringTokenizer tokenizer=new StringTokenizer(s1);
		while(tokenizer.hasMoreTokens()) {
			String value=tokenizer.nextToken();
			System.out.println(value);
		}
		System.out.println("----------------------------");
		String s2="Obama;Putin;Kim Jong Un!Dang Phat Tai";
		StringTokenizer tokenizer2=new StringTokenizer(s2, ";!");
		while(tokenizer2.hasMoreTokens()) {
			String value=tokenizer2.nextToken();
			System.out.println(value);
		}
	}

}

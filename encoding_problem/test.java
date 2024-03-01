package encoding_problem;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number and key To Encode: ");
		encoding e = new encoding(sc.nextInt(), sc.nextInt());
		System.out.println(e.logic());
	}

}

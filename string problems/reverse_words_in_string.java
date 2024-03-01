package Day_1;

import java.util.Scanner;

public class reverse_words_in_string {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String array[] = new String[60];
        System.out.print("Enter a String: ");
        String temp = s.nextLine();
        String str = "";

        int count = 0;

        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == ' ') {
                array[count] = str;
                str = "";
                count += 1;
            }

            else {
                str = temp.charAt(i) + str;
                if (i == temp.length()-1)
                {
                    array[count] = str;
                }
            }
        }
        System.out.print("Finally Reversed: ");
        for (String s1 : array) {
            if (s1 != null)
            {
                System.out.print(s1+" ");
            }
        }
    }
}

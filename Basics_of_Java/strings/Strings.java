package strings;

import java.util.*;

public class Strings {
    public static void main(String args[]) {
        // Initiate String builder
        StringBuilder sb = new StringBuilder("Ankur Halder");
        Scanner sc = new Scanner(System.in);
        // print any character
        System.out.println(sb.charAt(0));

        // update
        sb.setCharAt(0, 'M');
        System.out.println(sb);

        // add
        sb.insert(1, "o");
        System.out.println(sb);

        // delete

        sb.delete(0, 2);
        System.out.println(sb);

        // add again
        sb.insert(0, "A");
        System.out.println(sb);

        // append
        sb.append(" ");
        sb.append("i");
        sb.append("s");
        sb.append(" ");
        sb.append("a");
        sb.append(" ");
        sb.append("g");
        sb.append("o");
        sb.append("o");
        sb.append("d");
        sb.append(" ");
        sb.append("g");
        sb.append("u");
        sb.append("y");

        System.out.println(sb);
        System.out.println(sb.length());

        // reverse a string
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
        sc.close();
    }
}

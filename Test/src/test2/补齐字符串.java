package test2;

import java.util.Scanner;

public class 补齐字符串 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int count = Integer.valueOf(in.nextLine());
            for (int i = 0; i < count; i++) {
                String input = in.nextLine();
                if (input == null || input.length() == 0) {
                    continue;
                }
                StringBuilder sb = new StringBuilder(input.trim());
                if (sb.length() % 8 != 0) {
                    int more = 8 - sb.length() % 8;
                    for (int j = 0; j < more; j++) {
                        sb.append("0");
                    }
                }
                for (int j = 0; j < sb.length(); j += 8) {
                    System.out.println(sb.substring(j, j + 8));
                }
            }
        }
    }
}
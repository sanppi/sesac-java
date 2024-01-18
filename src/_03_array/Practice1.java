package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
                System.out.println("문자를 입력해주세요. :");
                String input = sc.nextLine();

                if(input.equals("exit")) {
                    break;
                }
                strings.add(input);
            }

        for (String string : strings) {
            System.out.println(string);
        }

        sc.close();
        }
    }


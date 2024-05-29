/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.twostrings;

import java.util.Scanner;

/**
 *
 * @author Nhat Anh
 */
public class TwoStrings {

    public static String twoStrings(String s1, String s2) {
        for (char c : s1.toCharArray()) {
            if (s2.contains(c + "")) {
                return "YES";
            }
        }
        return "NO";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        String[] str1 = new String[q];
        String[] str2 = new String[q];
        for (int i = 0; i < q; i++) {
            str1[i] = sc.nextLine();
            str2[i] = sc.nextLine();
        }

        for (int i = 0; i < q; i++) {
            System.out.println(twoStrings(str1[i], str2[i]));
        }

    }
}

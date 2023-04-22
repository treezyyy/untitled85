package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String IP = in.nextLine();
        System.out.println(True_IP(IP));

    }

    static String True_IP(String IP){
        Pattern p = Pattern.compile("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)");
        Matcher m = p.matcher(IP);
        if (m.find()) {
            return IP.substring(m.start(), m.end());
        }
        return "Верный IP отсутствует";


    }
}

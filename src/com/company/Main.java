package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("file-====");
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText("D:\\module 2\\demotext2\\src\\slow\\file.txt");
//        readFileExample.readFileText(path);

    }
}

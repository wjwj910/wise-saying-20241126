package com;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //lab1();
        //lab2();
        //lab3();
        lab4();
    }


    private static void lab1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("명령)");
        String cmd = scanner.nextLine();

        System.out.println("입력한 명령: " + cmd);
    }

    private static void lab2(){
        InputStream in = new ByteArrayInputStream("안녕\n잘가".getBytes());
        Scanner scanner = new Scanner(in);

        System.out.print("명령)");
        String cmd = scanner.nextLine().trim();

        System.out.println("입력한 명령: " + cmd);

        System.out.print("명령)");
        cmd = scanner.nextLine().trim();

        System.out.println("입력한 명령: " + cmd);
    }

    private static void lab3() {
        System.out.println("안녕하세요");
    }

    private static void lab4() {
        System.out.println("== 시작 ==");
        // 출력이 모니터로 안나오게 설정
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
        //output에 쌓임
        System.out.print("안녕하세요.");
        System.out.println("반갑습니다.");

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

        System.out.println("== 끝 ==");
        System.out.println("출력 : " + output.toString());
        // output 자원 해제
        try {
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
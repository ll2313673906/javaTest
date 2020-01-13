package com.soft1841;
/*
 * author@l恋
 */

import java.io.*;
import java.util.Scanner;

public class InputToFile{
    public static void main(String[] args) throws IOException {
        System.out.println("请你输入：");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        //方法1：通过字符流输出
        char[] chars = inputString.toCharArray();
        File destFile1 = new File("E:/result1.txt");
        Writer out1 =  new FileWriter(destFile1,true);
        out1.write(chars);
        out1.close();
  }
}

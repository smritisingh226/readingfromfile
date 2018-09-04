package com.smriti;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        File file = new File("djhdfj.txt");
    Scanner sc= new Scanner(file);
    while (sc.hasNextLine())
    System.out.println(sc.nextLine());
    }
}

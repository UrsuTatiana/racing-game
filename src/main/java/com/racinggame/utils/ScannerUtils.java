package com.racinggame.utils;

import java.util.Scanner;

public class ScannerUtils {

   private static final Scanner SCANNER = new Scanner(System.in);

    public static int nextIntAndMovedToNextLine(){
        int integer = SCANNER.nextInt();
        SCANNER.nextLine();
        return integer;
    }

    public static double nextDoubleAndMoveNextLine(){
        double value = SCANNER.nextDouble();
        SCANNER.nextLine();
        return value;
    }

    public static String nextLine(){
        return SCANNER.nextLine();

    }
}


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isFinish = false;
        while (!isFinish) {
            System.out.println("Введите выражение или \"STOP\" для выхода");

            String str = in.nextLine();
            if (str.equals("STOP")) {
                isFinish = true;
                break;
            }
            
            if (str.contains("+")) {
                Double a = Double.valueOf(str.substring(0, str.indexOf("+")));
                Double b = Double.valueOf(str.substring(str.indexOf("+") + 1));
                sum c = new sum();
                System.out.println(c.execute(a, b));
            } else if (str.contains("-")) {
                Double a = Double.valueOf(str.substring(0, str.indexOf("-")));
                Double b = Double.valueOf(str.substring(str.indexOf("-") + 1));
                subtract c = new subtract();
                System.out.println(c.execute(a, b));
            } else if (str.contains("*")) {
                Double a = Double.valueOf(str.substring(0, str.indexOf("*")));
                Double b = Double.valueOf(str.substring(str.indexOf("*") + 1));
                multiply c = new multiply();
                System.out.println(c.execute(a, b));
            } else if (str.contains("/")) {
                Double a = Double.valueOf(str.substring(0, str.indexOf("/")));
                Double b = Double.valueOf(str.substring(str.indexOf("/") + 1));
                divide c = new divide();
                System.out.println(c.execute(a, b));
            }
        }
    }
}

class Operation {
    double execute(double a, double b) {
        return 0;
    }
}

class sum extends Operation {
    @Override
    double execute(double a, double b) {
        return a + b;
    }
}

class subtract extends Operation {
    @Override
    double execute(double a, double b) {
        return a - b;
    }
}

class multiply extends Operation {
    @Override
    double execute(double a, double b) {
        return a * b;
    }
}

class divide extends Operation {
    @Override
    double execute(double a, double b) {
        return a / b;
    }
}

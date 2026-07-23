package kopo.codingtest.level0;

public class Share {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        System.out.println(Solution(num1, num2));
    }

    static int Solution(int num1, int num2) {
        int answer = 0;
        return num1 / num2;
    }
}
package kopo.codingtest.level0;

public class remain {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 2;
        System.out.println(Solution(num1, num2));
    }

    static int Solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }
}
package kopo.codingtest.level0;

public class pizza1 {
    public static void main(String[] args) {

        int n = 15;
        int answer = (n + 6) / 7;

        System.out.println(Solution(answer));

    }

    static int Solution(int n) {
        int answer = (n + 6) / 7;
        return answer;

    }
}
package kopo.codingtest.level0;

public class age {
    public static void main(String[] args) {

        int result = Solution(40);
        System.out.println(result);
    }
    static int Solution(int age) {
        int answer = 2023 - age;
        return answer;
    }
}
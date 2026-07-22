package kopo.codingtest.level0;

import aQute.bnd.annotation.Resolution;

public class comparison {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;
        System.out.println(Solution(num1, num2));
    }

    static int Solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }
        return answer;
    }
}
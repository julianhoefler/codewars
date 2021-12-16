package katas.bouncingballs;

public class Solution {

    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || window >= h || bounce <= 0 || bounce >= 1) {
            return -1;
        }
        int counter = 1;

        h*=bounce;
        while (h > window) {
            h *= bounce;
            counter += 2;

        }
        return counter;
    }
}
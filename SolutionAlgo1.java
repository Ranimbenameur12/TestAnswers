/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class SolutionAlgo1 {

    public static int[] Solution(int N, int[] A) {
//2 variables to store max and min of counters
        int MaxCount = 0;
        int MinCount = 0;

        int[] counters = new int[N];

        for (int i = 0; i < A.length; i++) {

            if (A[i] == N + 1) {
                MinCount = MaxCount;
            } //Increase x and change the value of MinCount
            else {
                if (counters[A[i] - 1] < MinCount) {
                    counters[A[i] - 1] = MinCount;
                }
                counters[A[i] - 1] = +1;
            }
            if (MaxCount < counters[A[i] - 1]) {
                MaxCount = counters[A[i] - 1];
            }
        }
        return counters;

    }
}

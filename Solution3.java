/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class Solution3 {

    int sum, max;

    public int solution(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            final int value = Math.abs(a[i]);
            sum += value;
            if (max < value) {
                max = value;

            }
            a[i] = value;

        }
        int result = sum;
        return result;
    }
}


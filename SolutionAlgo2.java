/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author LENOVO
 */
public class SolutionAlgo2 {

    public static int[] Solution(int N, int[] A) {
//
        int L = A.length;

//Max in Suite Fibonnaci 
        int max = 0;
        for (int i = 0; i < L; i++) {
            max = Math.max(A[i], max);
        }
        int[] fibonacci = new int[max + 1];
//increment for “0”
//init for fibonacci 

        fibonacci[0] = 1;
        fibonacci[1] = 1;

//search result for 2P 
//
        for (int i = 2; i <= max; i++) {
            fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % (1 << 30);
        }

        int[] results = new int[L];
        for (int i = 0; i < L; i++) {
            int[] B = null;
            results[i] = fibonacci[A[i]] % (1 << B[i]);
// where, "1 << B[i]" means 2^B[i]}

        }
        return results;
    }
}

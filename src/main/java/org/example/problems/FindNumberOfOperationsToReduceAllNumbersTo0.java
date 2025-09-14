package org.example.problems;

public class FindNumberOfOperationsToReduceAllNumbersTo0 {

    private long getOperationCount(int num){
        long cnt = 0;
        int i = 1;
        int base = 1;
        while (base <= num) {
            int end = Math.min(base * 2 - 1, num);
            cnt += (long) ((i + 1) / 2) * (end - base + 1);
            i++;
            base *= 2;
        }
        return cnt;
    }
    public long minOperations(int[][] queries) {
        long res=0;
        for(int i=0;i<queries.length;i++){
            long count1=getOperationCount(queries[i][0]-1);
            long count2=getOperationCount(queries[i][1]);
            res+=(count2-count1+1)/2;
        }
        return res;
    }
}

// The problem gives a set of intervals, each represented as [l,r], and we need to reduce all numbers within these intervals to 0. In each operation, we can choose two numbers, divide them by 4, and take the floor of each result. We are asked to find the sum of the minimum number of operations required across all intervals.

// Dividing a number by 4 is equivalent to shifting it right by two bits in binary. For example, 11,(1011
// 2
//  ) divided by 4 becomes 2,(10
// 2
//  ). Let’s look at some examples to see how many operations are needed to reduce numbers to 0:

// Numbers 1,2,3 require only 1 operation, and their binary lengths are 1 and 2.
// Numbers 4,5,…,15 require 2 operations, and their binary lengths are 3 and 4.
// Numbers 16,17,…,63 require 3 operations, and their binary lengths are 5 and 6.
// From this pattern, we see that for a binary number of length x, we need only ⌈
// 2
// x
//  ⌉ operations. Using this, we can calculate the total number of operations for all numbers within a given range. By iterating over all binary lengths, we can compute the total number of operations in [1,r] and in [1,l−1]. The difference gives the number of operations in [l,r]. Note, however, that here an operation refers to dividing a single number by 4, which differs slightly from the original definition.

// Once we know the total number of times individual numbers are operated on, we can also determine how many pair operations are needed. This is simply the total number of operations divided by 2, rounded up. Rounding up is necessary because if the total is odd, the final operation must pair a non-zero number with a 0.




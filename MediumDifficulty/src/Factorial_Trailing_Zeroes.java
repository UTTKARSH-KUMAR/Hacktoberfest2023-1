/*
Problem Statement

Given an integer n, return the number of trailing zeroes in n!.
Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

Example 1:

Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.
Example 2:

Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.

Example 3:
Input: n = 0
Output: 0

Constraints:

0 <= n <= 10^4

Follow up: Could you write a solution that works in logarithmic time complexity?
*/

/*
Solution Walkthrough:

The naive method of calcylating factorial and counting zeroes is inefficient as it will overflow very fast.

To solve this question, we make use of the Legendre's formula which gives an expression for the exponent of the largest power of a prime p that divides the factorial n!.
Please refer to https://en.wikipedia.org/wiki/Legendre%27s_formula to learn more about it.

Now, we know that zeroes can be there in the factorial when 2 and 5 both are there some number of times. Therefore to get number of zeroes, we see what is the maximum power of both 2 and 5 which divides the number and take the minimum of that.
Further we can see that max power of 2 in any factorial will be greater than or equal to max power of 5 in the same factorial. As (n/2) >= (n/5), (n/4) >= (n/25), and so on.
So we will calculate the max power of 5 and output it as the number of trailing zeroes in the factorial.

Note that we cannot apply Legendre's formula directly for 10 as it is not prime.
*/

class Solution {
    public int trailingZeroes(int n) {
        return (n/5+n/25+n/125+n/625+n/3125);
      // note that we have precisely done the formula as integer division is basically taking floor at each step.
      // furthermore, we have stopped at n/3125 as n <= 10000 which means n/15625 is always zero, so further terms can be safely neglected.
      // then we can see that we get an O(1) solution for this problem.
      // more terms can be added in the sum if the constraints for n are changed.
    }
}

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
To solve this question, we make use of the Legendre's formula which gives an expression for the exponent of the largest power of a prime p that divides the factorial n!.
Please refer to https://en.wikipedia.org/wiki/Legendre%27s_formula to learn more about it.

Now, 
*/

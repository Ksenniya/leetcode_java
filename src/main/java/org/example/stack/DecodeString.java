package org.example.stack;

import java.util.Stack;

/*
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.



Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"

 */
public class DecodeString {
/*

"3[a2[c]]"

res '

num
 */

    public String decodeString(String s) {

        Stack<Integer> nums = new Stack<>();
        Stack<String> res = new Stack<>();
        res.push("");
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int number = 0;
                int start = i;
                while (s.charAt(start) >= '0' && s.charAt(start) <= '9') {
                    number = number * 10 + (s.charAt(start) - '0');
                    start++;
                }
                i = start-1;
                nums.push(number);
            } else if (ch == '[') {
                res.push("");
            } else if (ch == ']') {
                int count = nums.pop();
                String curRes = res.pop();
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    sb.append(curRes);
                }
                res.push(res.pop() + sb);
            } else {
                res.push(res.pop() + ch);
            }

            i++;
        }

        return res.pop();
    }
}

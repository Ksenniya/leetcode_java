package org.example.stack;

import java.util.*;
import java.util.stream.Collectors;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> openChar = new Stack<>();
        Queue<Character> queue = s.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(LinkedList::new));
        Set<Character> openCharsSet = new HashSet<>(Arrays.asList('(', '{', '['));
        while (!queue.isEmpty()){
            Character c =queue.poll();
            if (openCharsSet.contains(c)){
                openChar.push(c);
            }
            else {
                if (c.equals('}')){
                    if (!openChar.pop().equals('{')){
                        return false;
                    }
                }
                if (c.equals(']')){
                    if (!openChar.pop().equals('[')){
                        return false;
                    }
                }
                if (c.equals(')')){
                    if (!openChar.pop().equals('(')){
                        return false;
                    }

                }
            }
        }
        return true;
    }
}

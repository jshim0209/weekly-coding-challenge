package com.revature.challenge;

import java.util.LinkedList;

// Sum Lists: You have two numbers represented by a linked list, where each node contains a single
//        digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
//        function that adds the two numbers and returns the sum as a linked list.
//
//        EXAMPLE
//        Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
//        Output: 2 -> 1 -> 9. That is, 912.
//
//        FOLLOW UP
//        Suppose the digits are stored in forward order. Repeat the above problem.
//        Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
//        Output: 9 -> 1 -> 2. That is, 912.

public class SumLists {

    public static int linkedListToInt(LinkedList<Integer> list, int listSize) {
        int a = 0;
        for (int i = listSize - 1, j = 1; i >= 0; i--, j *= 10) {
            a += list.get(i) * j;
        }
        return a;
    }

    public static int reverseLinkedListToInt(LinkedList<Integer> list, int listSize) {
        int b = 0;
        for (int i = 0, j = 1; i < listSize; i++, j *= 10) {
            b += list.get(i) * j;
        }
        return b;
    }

    public static int add(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static LinkedList<Integer> intToLinkedList(int sum) {
        LinkedList<Integer> result = new LinkedList<>();

        while (sum != 0) {
            result.add(0, sum % 10);
            sum /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> first = new LinkedList<>();
        LinkedList<Integer> second = new LinkedList<>();
        LinkedList<Integer> firstReverse = new LinkedList<>();
        LinkedList<Integer> secondReverse = new LinkedList<>();

        firstReverse.add(7);
        firstReverse.add(1);
        firstReverse.add(6);

        secondReverse.add(5);
        secondReverse.add(9);
        secondReverse.add(2);

        first.add(6);
        first.add(1);
        first.add(7);

        second.add(2);
        second.add(9);
        second.add(5);

        System.out.println(intToLinkedList(add(reverseLinkedListToInt(firstReverse, firstReverse.size()), reverseLinkedListToInt(secondReverse, secondReverse.size()))));

        System.out.println(intToLinkedList(add(linkedListToInt(first, first.size()), linkedListToInt(second, second.size()))));
    }
}

package com.InterviewPrograms;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
	public static Long[] findNextGreaterElement(Long[] arr, int n) {
        Long[] result = new Long[n];
        Stack<Long> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements smaller or equal to arr[i]
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            // If stack is empty, no greater element
            result[i] = stack.isEmpty() ? -1L : stack.peek();

            // Push current element
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        Long[] arr = new Long[n];
        
        // Input array
        System.out.println("Enter the elements for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        // Compute Next Greater Elements
        Long[] result = findNextGreaterElement(arr, n);

        // Print output
        for (Long val : result) {
            System.out.print(val + " ");
        }
        sc.close();
    }
}
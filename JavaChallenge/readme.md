# Code Challenge: Class 01
in this challenge we just deifined a function called **reverseArray** which takes an array as an argument and return an array with elements in reversed order.

## Whiteboard Process
[Whiteboard](./Assest/Screenshot%20(383).png)

## Approach & Efficiency
Approach:
The approach taken in the code is a simple iterative method to reverse the array. It initializes a new array called result of the same size as the input array and then iterates through the input array, placing the elements in reverse order into the result array.
Efficiency:

Time Complexity: O(n)

The time complexity is O(n), where n is the number of elements in the input array. The function iterates through the entire input array once, performing constant-time operations in each iteration. Hence, the time complexity is linear.
Space Complexity: O(n)

The space complexity is O(n) as well. The function creates a new array result of the same size as the input array to store the reversed elements. The space used is directly proportional to the number of elements in the input array.

## Solution

package JavaChallenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) 
    {
        int testArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversedArray = reverseArray(testArray);
        System.out.println(Arrays.toString(reversedArray));
    }
    public static int[] reverseArray(int array[])
    {
        int arrayLength = array.length;
        int[] result = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            result[arrayLength - i - 1] = array[i];
        }

        return result;
    }
}
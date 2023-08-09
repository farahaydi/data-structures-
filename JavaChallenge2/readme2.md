# Code Challenge: Class 01
in this challenge we just deifined a function called **insertShiftArray** which takes an array and number as an argument and return an array with the new value added at the middle index.
## Whiteboard Process
[Whiteboard](../assest/Screenshot%20(395).png)

## Approach & Efficiency
Approach: The code defines an ArrayList<Integer> and adds initial elements [10, 20, 30]. The insertShiftArray method takes an integer and the list, calculates the middle index, inserts the integer there, and returns the modified list.


## Solution

 public static ArrayList<Integer> insertShiftArray(int n, ArrayList<Integer> list) {
        int middleIndex = (int) Math.ceil((double) list.size() / 2);
        list.add(middleIndex, n);
        return list;
    }

In this code, the reverseArray function is invoked in the main method. The function accepts an array as a parameter, and it aims to reverse the array. The reversed array is stored in a new array of the same length.

Inside the reverseArray function:

The variable arrayLength holds the length of the input array.
A new array is created to store the reversed elements.
A loop iterates through the input array, and for each index, the value of the last element in the input array is assigned to the corresponding index in the new array. This effectively reverses the array.
In the main method:

An initial array [10, 20, 30] is passed to the reverseArray function.
The reversed array is returned and stored in a new array.
The Array.toString() method is used to convert the reversed array into a human-readable string representation, which is then printed.
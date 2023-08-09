# Code Challenge: Class 02
in this challenge we just deifined a function called **insertShiftArray** which takes an array and number as an argument and return an array with the new value added at the middle index.
## Whiteboard Process
[Whiteboard](./Screenshot%20(395).png)

## Approach & Efficiency
Approach: The code defines an ArrayList<Integer> and adds initial elements [10, 20, 30]. The insertShiftArray method takes an integer and the list, calculates the middle index, inserts the integer there, and returns the modified list.


## Solution

  public static int [] insertShiftArray(int n, int list[]) {
        int middleIndex = list.length / 2;
        list[middleIndex]=n;
        return list;
    }

>in this piece of code i create a function this taka an array and then store the length of array on variable called middleIndex then diveid it by 2 to access the middle of array , then i use middleIndex as an index to add the n parameter to middle of array.
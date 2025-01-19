# Big-O Analysis on Array
Input Array: {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94}
Input Size (n): The array has 11 elements, so n = 11.
Maximum Number (max): The largest number is 783, which has 3 digits.
Number of Digits (d): The algorithm will perform sorting for d = 3 digit places (ones, tens, hundreds).
Total Time Complexity for This Input:
The time complexity is d * n:
O(3 * 11) = O(33) operations.

# Steps on sorting the Array
# Step 1: Sort by the 1s Place
Extract the digits in the 1s place:
3, 9, 2, 2, 4, 3, 6, 5, 2, 1, 4.
Sort the numbers based on these digits:
{491, 472, 182, 692, 783, 543, 94, 264, 295, 356, 99}.

# Step 2: Sort by the 10s Place
Extract the digits in the 10s place:
9, 7, 8, 9, 8, 4, 9, 6, 9, 5, 9.
Sort the numbers based on these digits:
{94, 99, 491, 264, 295, 356, 543, 472, 182, 692, 783}.

# Step 3: Sort by the 100s Place
Extract the digits in the 100s place:
0, 0, 4, 2, 2, 3, 5, 4, 1, 6, 7.
Sort the numbers based on these digits:
{94, 99, 182, 264, 295, 356, 472, 491, 543, 692, 783}.
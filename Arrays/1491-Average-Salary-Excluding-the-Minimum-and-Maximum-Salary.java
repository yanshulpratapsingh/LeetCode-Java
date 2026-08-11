/*
 * LeetCode: 1491. Average Salary Excluding the Minimum and Maximum Salary
 * Difficulty: Easy
 * Topic: Arrays
 *
 * Approach:
 * Find the minimum salary, maximum salary, and total sum
 * of all salaries in a single traversal.
 *
 * Then subtract the minimum and maximum salary from
 * the total and divide by the number of remaining salaries.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public double average(int[] salary) {

        int max = salary[0];
        int min = salary[0];
        int sum = 0;

        // Find minimum, maximum and total sum
        for (int i = 0; i < salary.length; i++) {

            if (salary[i] > max) {
                max = salary[i];
            }

            if (salary[i] < min) {
                min = salary[i];
            }

            sum += salary[i];
        }

        // Exclude minimum and maximum salary
        return (double) (sum - max - min) / (salary.length - 2);
    }
}
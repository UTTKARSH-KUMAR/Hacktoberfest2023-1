// Container With Most Water
// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0; // Left pointer
        int right = height.length - 1; // Right pointer

        while (left < right) {
            // Calculate the width between the two lines
            int width = right - left;
            // Calculate the height as the minimum of the two line heights
            int minHeight = Math.min(height[left], height[right]);
            // Calculate the water contained between the lines
            int currentWater = width * minHeight;
            // Update the maximum water if the currentWater is greater
            maxWater = Math.max(maxWater, currentWater);

            // Move the pointer with the shorter height towards the other pointer
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        ContainerWithMostWater solution = new ContainerWithMostWater();
        int maxWater = solution.maxArea(height);
        System.out.println("Maximum amount of water that can be stored: " + maxWater);
    }
}

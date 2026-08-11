// Last updated: 8/11/2026, 2:20:14 PM
class Solution {
    public int maxTurbulenceSize(int[] arr) {

        if (arr.length <= 1)
            return arr.length;

        int maxOddStart = 1, maxEvenStart = 1, currOddStart = 1, currEvenStart = 1;

        for (int i = 1; i < arr.length; i++) {

            if (i % 2 == 0) {

                currOddStart = arr[i - 1] > arr[i] ? currOddStart + 1 : 1;
                currEvenStart = arr[i - 1] < arr[i] ? currEvenStart + 1 : 1;

            } else {

                currOddStart = arr[i - 1] < arr[i] ? currOddStart + 1 : 1;
                currEvenStart = arr[i - 1] > arr[i] ? currEvenStart + 1 : 1;

            }

            maxOddStart = Math.max(maxOddStart, currOddStart);
            maxEvenStart = Math.max(maxEvenStart, currEvenStart);

        }

        return Math.max(maxOddStart, maxEvenStart);

    }
}
// Search in Rotated Sorted Array
// input: sorted, rotated array with distinct numbers (in ascending order) It is rotated at a pivot point. Find the index of given element.
// ---------------
// |4|5|6|7|0|1|2|
// ---------------
// target: 0 and output: 4

public class q3 {
    public static int search(int arr[], int tar, int si, int ei) {
        if(si > ei) {
            return -1;
        }

        // kamm
        int mid = si + (ei - si) / 2;

        // case found
        if(arr[mid] == tar) {
            return mid;
        }
        // mid on l1
        if(arr[si] <= arr[mid]) {
            // case a : left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            } else {
                // case b : 
                return search(arr, tar, mid+1, ei);
            }
        }
        // mid on l2
        else {
            // case c : right
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            } else {
                // case d : left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0; //output-> 4
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}

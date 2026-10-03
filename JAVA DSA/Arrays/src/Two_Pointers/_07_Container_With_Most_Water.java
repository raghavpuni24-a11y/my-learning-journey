package Two_Pointers;

import java.util.Arrays;

public class _07_Container_With_Most_Water {
    public static int _Find_Container(int[] arr){
        int ans=0;
        int start=0, end=arr.length-1;
        while(end>start) {
             int area=0;
             int min = Math.min(arr[start], arr[end]);
             int dist = end - start;
             area = min * dist;
             if (ans < area) ans = area;
            // move the shorter wall, because it decides the water height.
            // moving the taller wall can't help: width shrinks and height stays capped by the short one.
            if (arr[start] <= arr[end]) start++;          // this is the main logic
            else end--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(_Find_Container(arr1));

    }
}

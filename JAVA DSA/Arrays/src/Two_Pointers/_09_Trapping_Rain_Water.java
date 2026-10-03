package Two_Pointers;

public class _09_Trapping_Rain_Water {
    public static int Trap_Water(int[] arr){
        int start=0, end=1; // for arr.length > 2
        while(end<arr.length){      // phle check kro ki  end aur end+1 main kaun bada h;
            if(arr[end] < arr[end+1]){
                end++;
            }
            else{
                int min_height = Math.min(arr[start],arr[end]);
                int dist=end-start;
                while (dist>1){  //  min dist needed  is 3 to calc the  middle area b/w the 2 heights
                    
                    
                }
                start=end+1;
                end++;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={2,1,0,1,3};

    }
}

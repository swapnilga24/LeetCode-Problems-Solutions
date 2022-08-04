
class HelloWorld {
    public static int search(int arr[],int low,int high,int target){
        int res=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                res=mid;
                break;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
            if(arr[mid]>target){
                high=mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) 
    {
        int arr[] = new int[]{2, 5, 7, 9, 10, 12, 15, 16, 18, 20, 24, 28, 32, 35};
        int target = 15;
        int low=0;
        int high=1;
        while(arr[high]<=target){
            low=high;
            high=high*2;
        }
        int res = search(arr,low,high,target);
        System.out.print("res!"+res);
    }
}

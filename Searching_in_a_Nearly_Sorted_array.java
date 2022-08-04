// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 3, 40, 20, 50, 80, 70};
        int target = 40;
        int low=0;
        int high=arr.length-1;
        int res=-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                res=mid;
                break;
            }
            if(mid+1<=high && arr[mid+1]==target){
                res=mid+1;
                break;
            }
            if(mid-1>=low && arr[mid-1]==target){
                res=mid-1;
                break;
            }
            if(arr[mid]<=target){
                low=mid+2;
            }else{
                if(arr[mid]>=target){
                    high=mid-2;
                }
            }
        }
        System.out.println("Hello, World!"+res);
    }
}

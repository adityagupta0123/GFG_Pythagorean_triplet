
class Solution {
    boolean checkTriplet(int[] arr, int n) {
        Arrays.sort(arr);
	    
	    for(int i = n - 1; i >= 2; i--)
	    {
	        int start = 0, end = i - 1;
	        
	        while(start < end)
	        {
	            int a = arr[start] * arr[start];
	            int b = arr[end]   * arr[end];
	            int c = arr[i]     * arr[i];
	            
	            if(a + b == c)
	               return true;
	            
	            if(a + b > c)
	               end--;
	            else
	               start++;
	        }
	    }
	    
	    return false;
	
    }
}

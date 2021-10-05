class Main
{
    // Function to find the maximum sum of a contiguous subarray
    
    public static int kadaneNeg(int[] A)
    {
        
        int maxSoFar = Integer.MIN_VALUE;
 
        
        int maxEndingHere = 0;
 
        // traverse the given array
        for (int i: A)
        {
            
            maxEndingHere = maxEndingHere + i;
 
            
            maxEndingHere = Integer.max(maxEndingHere, i);
 
            
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }
 
        return maxSoFar;
    }
 
    public static void main(String[] args)
    {
        int[] A = { -8, -3, -6, -2, -5, -4 };
 
        System.out.println("The maximum sum of a contiguous subarray is " +
                kadaneNeg(A));
    }
}









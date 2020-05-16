import java.util.*;
class InsertionSort {
    public void InsertAsc(int A [],int n)
        {
            for (int j=1; j<n; ++j){
                int key=A[j];
                int i=j-1;
                while(i>=0 &&A[i]>key)
                {
                    A[i+1]=A[i];
                    
                    i=i-1;
                }
                A[i+1]=key;
            }
            System.out.println("The sorted numbers are"+Arrays.toString(A));
            
        }
    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers of number that you want to sort");
        int n=scan.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the numbers that you want to sort");
        for(int i=0;i<n;i++)
        {
            A[i]=scan.nextInt();
            
        }
        
        System.out.println("The numbers  you have given are"+Arrays.toString(A));
        
        
        InsertionSort ob = new InsertionSort();
        ob.InsertAsc(A,n);
           
        
    }

}
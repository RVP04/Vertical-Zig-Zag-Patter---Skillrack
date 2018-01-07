import java.util.*;
public class Hello {

    public static void main(String[] args) {
                    
                    Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    
                    int[][] matrix = new int[n][n];
                    int counter = 1;
                    int i=0,j=0;
                    for(i=0;i<n;i++)
                    {
                        if(j==n)
                        {
                           for(j=n-1;j>i-1;j--,counter++)
                           {
                               matrix[j][i]=counter;
                           }
                        }
                        else
                        {
                            for(j=i;j<n;j++,counter++)
                            {
                            matrix[j][i]=counter;
                            }
                        }
                    }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(matrix[i][j]!=0)
                    System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
         
                }
}

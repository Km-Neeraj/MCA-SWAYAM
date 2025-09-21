import java.util.*;
class Solution 
{
    static ArrayList<Integer> spiralMatrix(int[][]mat,int n)
    {
         ArrayList<Integer> res=new ArrayList<>();
         int top=0,bottom=n-1,left=0,right=n-1;
         while(left<=right&&top<=bottom)
         {
                for(int i=left;i<=right;i++)
                {
                  res.add(mat[top][i]); 
                }
                top++;
                for(int i=top;i<=bottom;i++)
                {
                  res.add(mat[i][right]);
                }
                right--;
                if(top<=bottom)
                {
                    for(int i=right;i>=left;i--)
                    {
                         res.add(mat[bottom][i]);
                    }
                    bottom--;
                }
                if(left<=right)
                {
                     for(int i=bottom;i>=top;i--)
                     {
                           res.add(mat[i][left]);
                     }
                     left++;
                }
         }
         return res;
    }
}
public class SpiralMatrix {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            int n=sc.nextInt();
                            int[][]mat=new int[n][n];
                            for(int i=0;i<n;i++)
                            {
                              for(int j=0;j<n;j++)
                              {
                                mat[i][j]=sc.nextInt();
                              }
                            }
                            ArrayList<Integer> res=Solution.spiralMatrix(mat,n);
                            for(int c:res)
                            {
                               System.out.print(c+" ");
                            }
                            sc.close();

                         }
                         
}

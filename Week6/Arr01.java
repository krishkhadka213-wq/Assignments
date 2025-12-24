package Week6;


public class Arr01
{
    public static void main(String[] args)
    {
        // array declaration
        // array construction
        // array initialization
        
        int[] age; // array declaration
        age= new int[5]; // array construction
    
        // {0,0,0,0,0}
        
        // array intialization
        age[0]= 10;
        age[1]=5;
        age[2]=20;
        age[3]=25;
        age[4]=30;
        
        System.out.println(age[0]); // accessing an array element
        
        // {10,5,20,25,30}
        
        // 0 - (length-1) = 5-1=4
        
        int[] agr={10,20,30,40,50}; // total sum=> 
        
        
        System.out.println(agr.length);
        
        //last index => agr.length -1; 
        
        // traversing an array
        
        int sum=0;
        for(int i=0; i< agr.length; i++ )
        {
            sum= sum + agr[i];
        }
        
        System.out.println(sum);
        
        
        // reversing an array
        
        
        for(int i= agr.length-1 ; i >=0; i-- )
        {
            System.out.println(agr[i]);
        }
        
        
        
        // multidimensional 
        
        int[][] matrix; // 2d declare
        matrix= new int[2][3]; // 2d construction
        
        
        // 2d initialization
        matrix[0][0]= 10;
        matrix[0][1]=20;
        matrix[0][2]= 30;
        matrix[1][0]= 40;
        matrix[1][1]= 50;
        matrix[1][2]=60;
        
        
        int[][] mat1= { {1,2,3},{4,5,6} };
        
        for(int i=0; i< mat1.length; i++)
        {
            for(int j=0; j< mat1[i].length; j++)
            {
                System.out.print(mat1[i][j]);
            }
            
            System.out.println();
        } 
    }
}
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                if(i==0 || i==row-1 || j==0 || j==col-1){
                    System.out.print(col+" ");
                }
                
                else{
                    System.out.print(i+" ");
                }
            
        }
        System.out.println();
        
        }
        
    }
}


4 3
3 3 3 
3 1 3 
3 2 3 
3 3 3 

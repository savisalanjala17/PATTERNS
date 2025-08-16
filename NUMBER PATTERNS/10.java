
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=3;
    
        for(int i=0;i<n*2-1;i++){
            if(i<n){
            for(int j=0;j<=i;j++){
                
                    System.out.printf("%-2d ",count);
            }
            }
            
            else{
                for(int j=0;j<n*2-1-i;j++){
                
                    System.out.printf("%-2d ",count);
            }
                
            }
        System.out.println();
        count=(i<n-1) ? count+1 : count-1;
      
        
        }
        
    }
}


4
3  
4  4  
5  5  5  
6  6  6  6  
5  5  5  
4  4  
3  

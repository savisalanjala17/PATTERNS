import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=6;
    
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                
                    System.out.printf("%-2d ",count);
            
        }
        System.out.println();
        count--;
        
        }
        
    }
}


4
6  6  6  6  
5  5  5  
4  4  
3  

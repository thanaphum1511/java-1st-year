import java.util.Scanner;
public class Flower {
  public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i, j;
        for(i=1; i<=5; i++){
            for(j=1; j<=2; j++){
                System.out.print(i+","+j+" ");
            }
            System.out.println();
        }

        scan.close();
    }
}
/*  public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int i, j, n;
        System.out.print("Enter n: ");
        n =sn.nextInt();
        for(i=1; i<=n; i++){
          for(j=1; j<=n; j++){
            System.out.print("*");
          }
          System.out.println();
       }
    }
}  */
/*   public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int i, j, row, column;
        System.out.print("Enter row: ");
        row =sn.nextInt();
        System.out.print("Enter column: ");
        column =sn.nextInt();
        for(i=1; i<=row; i++){
            for(j=1; j<=column; j++){
                System.out.print("*");
            }
        System.out.println();
        }        
    }
}   */
/*  public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int i, n, j;
        System.out.print("Enter n: ");
        n =sn.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n)
                    System.out.print("*");
                else
                    System.out.print(" "); 
            } 
            System.out.println();   
        }
    }
}  */
/*  public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n, i, j;
        System.out.print("Enter n: ");
        n =sn.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }                
    }
}  */
/* public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int i, n, j;
        System.out.print("Enter x:" );
        n =sn.nextInt();
        for (i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j==i||j==n+1-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }                    
    }
}  
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter n: ");
        n = scan.nextInt();
        for(i=1; i<=n; i++){ 
            for(j=1; j<=i; j++){ 
                System.out.print("*");
            }
        System.out.println();
        }
    scan.close();
    }
}
*/
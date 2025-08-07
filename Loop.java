import java.util.Scanner;
public class Loop {
/*  public static void main(String[] args) {
       int i;
       for (i= 1; i <= 10; i++){
       System.out.print(i+" ");
       }    
    }
}*/
/*  public static void main(String[] args) {
        int i;
        for (i=10; i>=1; i--){
            System.out.print(i+" ");
        }    
    }
}*/
/*  public static void main(String[] args) {
        int i;
        for (i=1; i<=10; i++){
        System.out.println("Thanaphum");
        }    
    }
} */
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n, i;
        System.out.print("Enter n: ");
        n =scan.nextInt();
        for (i=0; i< n; i++){
            System.out.println("Phum");
        }
    }   
}*/
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int i, x;
        System.out.print("Enter x: ");
        x =scan.nextInt();
        for(i=1; i<=10; i++){
            System.out.println(x+" x "+i+" = "+x*i);
        }
        scan.close();
    }
}  */
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int i, n, sum=0;
        System.out.print("Enter n: ");
        n = scan.nextInt();
       for (i = 1; i <=n; i++)
       { sum = sum + i;
       }
       System.out.println("Sum 1 to "+n+" = "+sum);
     scan.close();
     //n=5 =15 คือ 1+2+3+4+5 
    }
}*/
/*  public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int i,n;
        for(i=1;i<=3;i++){
            System.out.println("Round: "+i);
            System.out.print("Enter n ");
            n =scan.nextInt();   
            if(n%2==0){
                System.out.println(n+" is an even number");
            }
            else{
                System.out.println(n+" is an odd number");
            }
        }
    }
}*/
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int i, n;
            System.out.print("Enter n: ");
            n =scan.nextInt();
            for(i=1; i<=n; i++){
            if(i%2==0){
                System.out.println(i+" is an even number");
            }
            else{
                System.out.println(i+" is an odd number");
            }
        }
        scan.close();
    }
}*/
  public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int i, x=-1, secret=7;
        for(i=1; i<=5; i++){
            System.out.print("Round"+i+" :Enter x: ");
            x =scan.nextInt();
            if(x>secret){
                System.out.println(x+" is too much");
            }
            else if(x<secret){
                System.out.println(x+" is too less");
            }
            else{
                System.out.println(x+" is CORRECT!!!");
                break;//corectแล้วคือจบ
            }
        }
        scan.close();
        if(x==secret){
            System.out.println("YOU WIN!!!");
        }
        else{
            System.out.println("YOU LOST!!!");
        }
    }
}
/*  public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int i, x, max=0;
        for(i=1;i<=5;i++){
            System.out.print("Round "+i+": Enter x: ");
            x =scan.nextInt();
            if(x>max)
            max=x;
        }
        System.out.println("Max value = "+max);    
        scan.close();
    }
}*/
 /*  public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int i, x, max=0;
        for(i=1;i<=5;i++){
            System.out.print("Round "+i+": Enter x: ");
            x =scan.nextInt();
            if(x>max)
            max=x;
            if(i==1){
                max=x;
            }
        }
        System.out.println("Max value = "+max);    
        scan.close();
    }
}*/
/*  public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int i,x,max=0;
        System.out.print("Round1: Enter x: ");
        x = scan.nextInt();
        max = x;
        for(i=2;i<=5;i++){
            System.out.print("Round "+i+": Enter x: ");
            x =scan.nextInt();
          if(x>max){
           max=x;
          }
        }    
        System.out.println("Max = " +max);
        scan.close();
    }              
}   */ 
/*  public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int x, max, i;
        System.out.print("Round 1: Enter x: ");
        x =scan.nextInt();
        max=x;
        for(i=2; i<=5; i++){
            System.out.print("Round "+i+": Enter x: ");
            x =scan.nextInt();
            if(max<x){
                max=x;
            }
        }
        scan.close();
        System.out.println("Min = "+max);
    }
}*/
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int i, n;
        System.out.print("Enter n: ");
        n =scan.nextInt();
        for(i=1; i<=n; i++){
          if(i%2==1){
           System.out.print(i+" ");
          }    
        }
    }
}   */
/*  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, n, count=0;
        System.out.print("Enter n: ");
        n = scan.nextInt();
        for (i = 1; i <=n; i++){
        if(n%i==0){
        count++;
        }
        }
        if(count == 2){
          System.out.println(n+" is a prime number.");
        }
        else{
          System.out.println(n+" is NOT a prime number.");
        }
        scan.close();  
    }
}*/
    
          
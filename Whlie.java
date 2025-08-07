import java.util.Scanner;
public class Whlie {
/* public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        int x;
        char check='Y';
        while (check=='Y') {
            System.out.print("Enter x: ");
            x =sn.nextInt();
            if(x%2==0){
                System.out.println(x+" is an even munber");
            }    
            else{
                System.out.println(x+" is an odd number");    
            }
            System.out.print("Do you want to continue? (Y/N) ");
            check =sn.next().charAt(0);
        }
        System.out.println("END");

    }
}*/
/* public static void main(String[] args) {
        Scanner sn=new Scanner (System.in);
        int num=1, total=0;
        while (num>0) {
            System.out.print("Enter num of packages : ");
            num =sn.nextInt();
            total =total+num;
        }
        System.out.println("Total = "+total);
    }
}*/
 public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        float score;
        while (true) {
            System.out.print("Enter score: ");
            score =sn.nextFloat();
            if(score>=50.00 && score<=100){
            System.out.println("PASS");
            }
            else if(score>=0.00 && score<50.00){
            System.out.println("FAIL");
            }
            else if(score>100||score<0.00){
                System.out.println("END");
                break;
            }
        }  
   }
           
}
 /*public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int i;
        for(i=1; i<10; i++){ 
            if(i==5){ 
                continue;
            }
            System.out.print(i+" ");
        }
    }
}*/
    
    
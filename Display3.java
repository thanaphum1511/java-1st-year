import java.util.Scanner;
public class Display3 {
/*  public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x;
        System.out.print("Enter x: ");
        x = scan.nextInt();
        if(x>=0){
            System.out.println(x+" is more than or equal to zero");
        }
        System.out.println("END");
        scan.close();     
    }
} */
/*  public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int A, B;
        System.out.print("Enter A: ");
        A =scan.nextInt();
        System.out.print("Enter B: ");
        B=scan.nextInt();
        if(A>B){
            System.out.println(A+" is more than "+B);   
       }
    System.out.println("END");
    scan.close();
    }
}*/
/*  public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x;
        System.out.print("Enter x: ");
        x =scan.nextInt();
        if(x>=0){
            System.out.println(x+" is a positive numbeer");
        }
        else{
            System.out.println(x+" is a negative numbeer");
        }
        System.out.println("END");
        scan.close();
    }
}*/
/*  public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a, b;
        System.out.print("Enter A: ");
        a =scan.nextInt();
        System.out.print("Enter B: ");
        b =scan.nextInt();
        if(a>b){
            System.out.println(a+" is more than "+b);
        }
        else{
            System.out.println(a+" is less than "+b); 
        }
        System.out.println("END");
        scan.close();
    }
}  */
/*  public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x;
        System.out.print("Enter num: ");
        x =scan.nextInt();
        if(x%2==0) {
            System.out.println(x+" is an even number");
        }
        else{
            System.out.println(x+" is an odd number");
        }
        System.out.println("END");
        scan.close();        
    }      
}*/
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x;
        System.out.print("Enter x: ");
        x =scan.nextInt();
        if(x>0){
         System.out.println(x+" is a positive number");
        }
        else if(x==0){
          System.out.println(x+" is a zero number");
        }
        else{
          System.out.println(x+" is a negative number");
        }
        System.out.println("END");
        scan.close();     
    }
}  */
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a, b;
        System.out.print("Enter A: ");
        a =scan.nextInt();
        System.out.print("Enter A: ");
        b =scan.nextInt();
        if(a>b){
           System.out.println(a+" is more than "+b);
        }
        else if (a==b){
            System.out.println(a+" is equal to "+b);
        }
        else{
            System.out.println(a+" is less than "+b);
        }
        System.out.println("END");
        scan.close();
    }
}*/
/*  public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int x;
        System.out.print("Enter x: ");
        x =scan.nextInt();
        if((x>0) && (x%2==0)){
            System.out.println(x+" is a positive even number");
        }    
        else if(x==0){
            System.out.println(x+" is ZER");
        }    
        else if((x>0)&&(x%1==0)){
            System.out.println(x+" is positive odd number");
        }
        else if((x<0)&&(x%2==0)){
            System.out.println(x+" is negative even number");
        }
        else{
            System.out.println(x+" is negative odd number");
        }
        System.out.println("END");
        scan.close();
    }
}   */
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x;
        System.out.print("Enter x: ");
        x =scan.nextInt();
        if(x>0)
        { if(x%2==0)
          { System.out.println(x+" is a positive even number");
          }
          else
          { System.out.println(x+" is a positive odd number");
          }
        }
        else if(x<0)
        { if(x%2==0)
           { System.out.println(x+" is a negative even number");
           }
           else
           { System.out.println(x+" is a negative odd number");
           }
        }
        else //or else if(x==0)
        { System.out.println(x+" is ZERO");
        } 
        System.out.println("END");
    }
}*/
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        char c;
        System.err.print("Enter c: ");
        c =scan.next().charAt(0);
        if(c=='A' ||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println(c+" is a vowel");
        }
        else{
            System.out.println(c+" is a consonant");
        }
    }
} */
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int d,m;
        System.out.print("Enter day: ");
        d =scan.nextInt();
        System.out.print("Enter month: ");
        m =scan.nextInt();
        if((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&(d<=31)&&d>0){
            System.out.println(d+"/"+m+" is Valid");
        }
        else if((m==4||m==6||m==9||m==11)&&(d<=30)&&d>0){
            System.out.println(d+"/"+m+" is Valid");
        }
        else if((m==2)&&(d<=28)&&d>0){
            System.out.println(d+"/"+m+" is Valid");
        }
        else{
            System.out.println(d+"/"+m+" is Invalid");
        }
    }  
} */
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        float score;
        System.out.print("Enter score ");
        score =scan.nextFloat();
        if(score>80.00){
            System.out.println("A");
        }
        else if((score>=70.00)&&(score<80.00)){
            System.out.println("B");
        }
        else if((score>=60.00)&&(score<70.00)){
            System.out.println("C");
        }
        else if((score>=50.00)&&(score<60.00)){
            System.out.println("D");
        }
        else{
            System.out.println("E");
        }
    }                
}*/
/*  public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float w,l;
        System.out.print("Enter width: ");
        w =scan.nextFloat();
        System.out.print("Enter lenght: ");
        l =scan.nextFloat();
        if (w==l){
          System.out.println("This is a square");
        }
        else{
           System.out.println("This is a rectangular");
        }
    }
}*/
  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        float w,l;
        System.out.print("Enter width: ");
        w =scan.nextFloat();
        System.out.print("Enter lenght: ");
        l =scan.nextFloat();
        if (w>0 && l>0){
         if (w==l)
           { System.out.println("This is a square");
           }
           else
           { System.out.println("This is a rectangular");
           }
        }
        else
        { System.out.println("Invalid inputs\n");
        } 
    }
}
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        float x, abs;
        System.out.print("Enter x:");
        x =scan.nextFloat();
        if(x<0)
         { abs = -x;
         }
         else
         { abs = x;
         }
        System.out.println("Absolute x is " +abs);
    }
}
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x, abs;
        System.out.print("Enter x: ");
        x =scan.nextInt();
        if(x<0)
         {abs=-x;
         }
         else
         {abs=x;
         }
        System.out.println("Absolute of "+x+" is "+abs);
        scan.close();
    }
}*/
/*  public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int x, abs;
       System.out.print("Enter x: ");
       x = scan.nextInt();
       abs = x<0? -x:x;
       System.out.println("Absolute of "+x+" is "+abs);
       scan.close();
    }
}*/
 /* public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        float a, b, big_num;
        System.out.print("Enter a: ");
        a =scan.nextFloat();
        System.out.print("Enter b: ");
        b =scan.nextFloat();
        big_num = a>=b? a:b;
        System.out.println("The greater number is "+big_num);
        scan.close();
    }
}
/*  public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
       float a, b;
       System.out.print("Enter a: ");
       a =scan.nextFloat();
       System.out.print("Enter b: ");
       b =scan.nextFloat();
       System.out.println("The greater number is "+(a>=b? a:b));
       scan.close();
    }
}  */ 
/*  public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        float score;
        System.out.print("Enter score: ");
        score =scan.nextFloat();
        System.out.println(score + (score >= 50? " is Pass" : " is Fail" ));
        scan.close();
    }
}  */
/*  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int x;
     System.out.print("Enter x (1, 2, or 3): ");
     x = scan.nextInt();
     switch(x){
     case 1: System.out.println("ONE");
     
     break;
     
     case 2: System.out.println("TWO");
     
     break;
     
     case 3: System.out.println("THREE");
     
     break;
     
     default: System.out.println("ERROR");
     }
     System.out.println("END");
     scan.close();
    }
} */
/*  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char grade;
        System.out.print("Enter x (P or F): ");
        grade =scan.next().charAt(0);
        switch (grade) {
            case 'P':System.out.println("PASS");
                
                break;
            case 'F' :System.out.println("Fail");

                 break;
            default :System.out.println("ERROR");
                break;
        }
        System.out.println("END");
        scan.close();
    }
}*/
/*public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        char c;
        System.out.print("Enter c: ");
        c =scan.next().charAt(0);
        switch (c) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println(c+" is a vowel");    
                break;
        
            default:System.out.println(c+" is a consonant");
                break;
        }
    }
}*/
    
import java.util.Scanner;
public class Method {
   /* public static void main(String[] args) {
        System.out.println("Hello from main method");
        myMethod();
    }
    static void myMethod(){
        System.out.println("Hello from myMethod");
    }
}*/
/* public static void main(String[] args) {
        System.out.println("Hellow from main method");
        myMethod();
        myMethod();
        myMethod();
    }
    static void myMethod(){
        System.out.println("Hello from myMethod");
    }    
}*/
/* public static void main(String[] args) {
        System.out.println("Hello from main method");
        myMethod();
        System.out.println("Hello from main method");
        myMethod();
        System.out.println("Hello from main method");
        myMethod();

    }
    static void myMethod(){
        System.out.println("Hello from my Method");
    }    
}*/
/*  public static void main(String[] args) {
        System.out.println("Hello feom main method");
        add();
        System.out.println("Back to main method");
        System.out.println("End of main method");
    }
    static void add(){
        Scanner sn =new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Hello from myMethod");
        System.out.print("Enter num1: ");
        n1 =sn.nextInt();
        System.out.print("Enter num2: ");
        n2 =sn.nextInt();
        n3 =n1+n2;
        System.out.println(n1+" + "+n2+" = "+n3);
        System.out.println("End of main method");
    }    
}*/
/*     public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter num1: ");
        n1 =sn.nextInt();
        System.out.print("Enter num2: ");
        n2 =sn.nextInt();
        add (n1,n2);
    }
    static void add(int a,int b){
        int c;
        c= a+b;
        System.out.println(a+" + "+b+" = "+c);
    } 
}  */
/* public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        int num;
        System.out.print("Enter num: ");
        num =sn.nextInt();
        evenORodd(num);
    } 
    static void  evenORodd(int x){
        if(x%2==0){
            System.out.println(x+" is an even number");
        }
        else{
            System.out.println(x+" is an odd number"); 
        }       
    }    
}  */  
/*  public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        int i,num;
        for(i=1;i<=5;i++){
            System.out.print("Enter num "+i+": ");
            num =sn.nextInt();
            evenORodd(num);
        }    
    }
    static void evenORodd(int x){
        if(x%2==0){
        System.out.println(x+" is an even number"); 
        } 
       else{
        System.out.println(x+" is an odd number"); 
        }  
    }
}*/
/* public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        int i,num;
        for(i=1;i<=5;i++){
            System.out.print("Enter num "+i+": ");
            num =sn.nextInt();
            evenORodd(num);
        }    
    }
    static void evenORodd(int x){
        if(x>0){
         System.out.println(x+" is an positive number"); 
        } 
        else if(x<0){
         System.out.println(x+" is an negative number"); 
        }    
       else{
         System.out.println(x+" is ZERO"); 
        }  
    }
}*/
/* public static void main(String[] args) {
        int i;
        int num[]={10,-5,9,0,-2}; 
        for(i=0;i<5;i++){
            evenORodd(num[i]);
        }
    }
    static void evenORodd(int x){
        if(x%2==0){
            System.out.println(x+" is an even number");
        }
        else{
            System.out.println(x+" is an odd number");  
        } 
    }
} */
/* public static void main(String[] args) {
        int num1[]={1,2,3,4,5};
        int num2[]={10,20,30,40,50};
        int i;
        for(i=0;i<5;i++){
            add(num1[i],num2[i]);
        }    
    }
    static void add(int x, int y){
        int z;
        z = x+y;
        System.out.println(x+" + "+y+" = "+z);
    }
}*/
/* public static void main(String[] args) {
        float num1[]={1.1f,2.2f,3.3f,4.4f,5.5f};
        float num2[]={1.2f,2.1f,-30,4,5.5f};
        int i;
        for(i=0;i<5;i++){
            compare(num1[i], num2[i]);
        }      
    }
    static void compare(float x, float y){
        if(x<y){
            System.out.println(x+" is more than "+y);
        }
        else if(x>y){
            System.out.println(x+" is less than "+y);
        }
        else{
            System.out.println(x+" is equal to "+y);    
        }
    }    
}  */  
/*  public static void main(String[] args) {
        String name[]={"Peter", "Simon", "Alice"};
        int i;
        for(i=0;i<3;i++){
            check_length(name[i]);
        }
    }
    static void check_length(String temp){
        System.out.println(temp+" has "+temp.length()+" letters");
    } 
}  */
/*  public static void main(String[] args) {
        String name[]={"Peter", "Simon", "Alice"};
        float score[]={55.50f, 32.00f, 75};
        int i;
        for(i=0;i<3;i++){
            check(name[i],score[i]);
        }    
    }
    static void check(String name, float score){
        if(score>=50.00){
            System.out.println(name+" is PASS");
        } 
        else{
            System.out.println(name+" is FAIL");
        }
    }
}  */
/* public static void main(String[] args) {
        int num[]={10,-2,3,-40,-5};
        int abs, i;
        for(i=0; i<5; i++){
          abs = absolute(num[i]);
          System.out.println("Absolute of "+num[i]+" = "+ abs);
        }
    }
    static int absolute(int x){
        if(x<0)
        x = -x;
        return x;
    }
}*/
/*  public static void main(String[] args) {
        int num[]= {1,20,300,40,5};
        int i;
        System.out.println("Before calling add2");
        for(i=0;i<5;i++){
            System.out.println("Num["+i+1+"] = "+num[i]);
        }
        System.out.println("Call add2");
        for(i=0;i<5;i++){
            add(num[i]);
        }
        System.out.println("After calling add2");
        for(i=0;i<5;i++){
            System.out.println("Num["+i+1+"] + "+num[i]);
        }
    }
    static void add(int x){
        x = x+2;
        System.out.println("x = "+x);
    }                           
}*/
public static void main(String[] args) {
    String name[]={"Simon", "Alice", "Bob"};
    float time[]={9.32f, 9.10f, 9.26f};
    String winner_name;
    winner_name = winner(name, time);
    System.out.println("Winner = "+winner_name);
    }
    static String winner(String name[], float time[]){
    float min=time[0];
    int i;
    String winner_name="";
    for(float x:time){
    if(x<min){
    min=x;
    }
    }
    for(i=0; i<time.length; i++){
    if(time[i]==min)
    winner_name=name[i];
    }
    return winner_name;
    }
    }
    


    
    

import java.util.Scanner;
// Import the Scanner class
class Sn {
/*  public static void main(String[] args) {
    String name;
    Scanner scan = new Scanner(System.in);
    // Create a Scanner object named scan
    System.out.print("Enter username: ");
    name = scan.nextLine(); // Read string input
    System.out.println("My name is: " + name);
  }
}*/
/*  public static void main(String[] args) {
        String name;
        int age;
        float weight;
        char blood_type;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter username: ");
        name = scan.nextLine(); // Read string input
        System.out.print("Enter your age: ");
        age = scan.nextInt(); // Read int input
        System.out.print("Enter your weight: ");
        weight = scan.nextFloat(); // Read float input
        System.out.print("Enter your blood type: ");
        blood_type = scan.next().charAt(0);
        System.out.println("My name is: " + name);
        System.out.println("I am " +age+ " years old.");
        System.out.println("I am " +weight+ " kilograms."); 
        System.out.println("My blood type is " +blood_type+".");
    }
}*/
    
/*  public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1 = scan.nextInt();
        System.out.print("Enter num2: ");
        num2 = scan.nextInt();
        num3 = num1 + num2;
        System.out.println(num1+" + "+num2+" = "+num3); 
        //Enter num1: 20
        //Enter num2: 30
        //20 + 30 = 50
    }
}*/
/*  public static void main(String[] args) {  
      float height1, height2, height3, ave;
      Scanner scan =new Scanner(System.in);
      System.out.print(" Please enter height of Tim: ");
      height1 = scan.nextFloat();
      System.out.print("Please enter height of Peter: ");
      height2 = scan.nextFloat(); 
      System.out.print("Please enter height of Simon: ");       
      height3 = scan.nextFloat(); 
      ave = (height1+height2+height3)/3;
      System.out.println(" Average height is = "+ave);
      scan.close();
    }
}*/
/*  public static void main(String[] args) {
        char Grade_Eng, Grade_Thai, Grade_Math;
        Scanner scan =new Scanner(System.in);
        System.out.print(" Enter grade of English: ");
        Grade_Eng =scan.next().charAt(0);
        System.out.print(" Enter grade of Thai: ");
        Grade_Thai =scan.next().charAt(0);
        System.out.print(" Enter grade of Math: ");
        Grade_Math =scan.next().charAt(0);
        System.out.println("Grade of English is "+Grade_Eng);
        System.out.println("Grade of Thai is "+Grade_Thai);
        System.out.println("Grade of Math is "+Grade_Math);
        scan.close();
        //ไม่มี+ char
    }
}*/
    
/*  public static void main(String[] args) {
        String Grade_Eng, Grade_Thai, Grade_Math;
        Scanner scan =new Scanner(System.in);
        System.out.print(" Enter grade of English: ");
        Grade_Eng =scan.nextLine();
        System.out.print(" Enter grade of Thai: ");
        Grade_Thai =scan.nextLine();
        System.out.print(" Enter grade of Math: ");
        Grade_Math =scan.nextLine();
        System.out.println("Grade of English is "+Grade_Eng);
        System.out.println("Grade of Thai is "+Grade_Thai);
        System.out.println("Grade of Math is "+Grade_Math);
        scan.close();
    }
}*/
/*  public static void main(String[] args) {
        String name, fav_subject;
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your name: ");
        name =scan.nextLine();
        System.out.print("Enter your favorite subject ");
        fav_subject =scan.nextLine();
        System.out.println("Favorite subject of "+name+ " is "+fav_subject);
        scan.close();
    }
}*/
/*  public static void main(String[] args) {
        int budget, price, pieces, remaining_money;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your budget: ");
        budget = scan.nextInt();
        System.out.print("Enter the product's price: ");
        price = scan.nextInt();
        pieces = budget / price;
        remaining_money = budget - (pieces*price);
        System.out.println("You can buy "+pieces+" pieces ");
        System.out.println("You have "+remaining_money+" Baht left.");
        scan.close();
        //Enter your budget: 2100
        //Enter the product's price: 500
        // You can buy 4 pieces 
        //You have 100 Baht left.
    }
} */
/*  public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num =scan.nextInt();
        System.out.println(num+" x 1 = "+ (num*1) );
        System.out.println(num+" x 2 = "+ (num*2) );
        System.out.println(num+" x 3 = "+ (num*3) );
        System.out.println(num+" x 4 = "+ (num*4) );
        System.out.println(num+" x 5 = "+ (num*5) );
        System.out.println(num+" x 6 = "+ (num*6) );
        System.out.println(num+" x 7 = "+ (num*7) );
        System.out.println(num+" x 8 = "+ (num*8) );
        System.out.println(num+" x 9 = "+ (num*9) );
        System.out.println(num+" x 10 = "+ (num*10) );
        System.out.println(num+" x 11 = "+ (num*11) );
        scan.close();
    }   
} */
/*  public static void main(String[] args) {
       String name, gender;
       int age;
       float height;
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter your name and surname: ");
       name =scan.nextLine();
       System.out.print("Enter your gender: ");
        gender =scan.nextLine();
       System.out.print("Enter you age: ");
       age =scan.nextInt();
       System.out.print("Enter your height: ");
       height =scan.nextFloat();
       System.out.println("My name is "+name);
       System.out.println("I am "+gender);
       System.out.println("I am "+age);
       System.out.println("I am "+height+" meters tall");
       scan.close();
    }
}   */
//Less than < A<B
//• More than > A>B
//• Equal to == A==B
// Not equal to != A!=B
//• Less than or equal to <= A<=B
//• More than or equal to >= A>=B

 /* public static void main(String[] args) {
        int num1=0, num2=5;
        System.out.println(num1+" > "+num2+" = "+(num1>num2));
        System.out.println(num1+" < "+num2+" = "+(num1<num2));
        System.out.println(num1+" == "+num2+" = "+(num1==num2));
        System.out.println(num1+" != "+num2+" = "+(num1!=num2));
        System.out.println(num1+" >= "+num2+" = "+(num1>=num2));
        System.out.println(num1+" <= "+num2+" = "+(num1<=num2));
       // 0 > 5 = false
        //0 < 5 = true
       //0 == 5 = false
       //0 != 5 = true
       //0 >= 5 = false
       //0 <= 5 = true

    }  
}*/
//• 5>0 && -3<0 TRUE && TRUE Answer is TRUE
//• 5>0 && -3>0 TRUE && FALSE Answer is FALSE
//• 5<0 || -3<0 FALSE || TRUE Answer is TRUE
//• 5<0 || -3>0 FALSE || FALSE Answer is FALSE
    
/*  public static void main(String[] args) {
        boolean check;
        check = 5>0 && -3<0;
        System.out.println(check);
        check = 5>0 && -3>0;
        System.out.println(check);
        check = 5<0 || -3<0;
        System.out.println(check);
        check = 5<0 || -3>0;
        System.out.println(check);
    }
}*/
/*  public static void main(String[] args) {
        int num1, num2;
        boolean check;
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter num1: ");
        num1 =scan.nextInt();
        System.out.print("Please enter num2: ");
        num2 =scan.nextInt();
        System.out.println(num1+" > "+num2+" = "+(num1>num2));
        System.out.println(num1+" < "+num2+" = "+(num1<num2));
        System.out.println(num1+" == "+num2+" = "+(num1==num2));
        System.out.println(num1+" != "+num2+" = "+(num1!=num2));
        scan.close();
    }
}   */
 public static void main(String[] args) {
        int age;
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter age: ");
        age =scan.nextInt();
        boolean answer;
        answer =age>=0 && age<=200;
        System.out.println(answer);
        scan.close(); //Please enter age: 201 false
    }
}


     

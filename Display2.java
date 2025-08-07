public class Display2 {
    // + เพิ่มตัวถูกดำเนินการสองตัว
    // - ลบตัวถูกดำเนินการที่สองจากตัวแรก
    // * คูณสองตัวถูกดำเนินการ
    // / หารเศษด้วยตัวส่วน
    // % ใช้เพื่อค้นหาส่วนที่เหลือของการหาร   ///modulo can only work with integer numbers (int)
    // ++ ตัวดำเนินการเพิ่ม - เพิ่มค่าจำนวนเต็มทีละหนึ่ง
    // -- ตัวดำเนินการลด - ลดค่าจำนวนเต็มลงหนึ่ง

/*  public static void main(String[] args) {
        int num1 = 20, num2;
        num2 = num1 + 30;
        System.out.println("num1 is " + num1);
        System.out.println("num2 is " + num2);
        num2 = num2 + 100;
        System.out.println("num2 is " + num2);
         //result = num1=20 num2=50 num2=150   
    }
}*/
/*  public static void main(String[] args) {
        int num1 = 20, num2;
        num2 = num1 - 30;
        System.out.println("num1 is " + num1);
        System.out.println("num2 is " + num2);
        num2 = num2 - 100;
        System.out.println("num2 is " + num2);
        //result = num1=20 num2=-10 num2=-110
    }
}*/
/*  public static void main(String[] args) {
        int num1 = 20, num2 = 30, num3;
        num3 = num1 + num2;
        System.out.println("Total = " + num3);
        System.out.println("Total = " + (num1+num2));
    } 
}*/
/*  public static void main(String[] args) {
        int x=5;
        float y=2.5f;
        System.out.println("x + y = " +(x+y));
        System.out.println("x - y = " +(x-y));
    }
}*/
    // In C language, types of data and operators are very important
    // • int +-*/%   int result is int
    // • float +-*/%   float result is float
    // • float +-*/%   int result is float
    // • Int +-*/%   float result is float

    //• float has higher priority than int

/*  public static void main(String[] args) {
        int num1 = 5, num2 = 2, num3;
        num3 = num1 * num2;  
        System.out.println("Result = " + num3);
        num3 = num1 / num2;
        System.out.println("Result = " + num3);   
        //It is 2 not 2.5 because
        //• int +-คูณ หาร% int result is int
    }
} */
/*  public static void main(String[] args) {
        float num1 = 5f, num2 = 2f, num3;
        num3 = num1 * num2;
        System.out.println("Result = " + num3);
        num3 = num1 / num2;
        System.out.println("Result = " + num3);
        //เอาเศษส่วน
    }
}*/
/*  public static void main(String[] args) {
        String name1="Phum", name2="Sorbit", name3="Pun";
        int age1=18, age2=19, age3=18;
        float ave;
        ave = (age1+age2+age3)/3.0f;
        System.out.println(name1 + " is " + age1 + " years old. ");
        System.out.println(name2 + " is " + age2 + " years old. ");
        System.out.println(name3 + " is " + age3 + " years old. ");
        System.out.println(" Average age = " +ave);
    }
}*/
/*  public static void main(String[] args) {
        float a=5, b=2, answer1, answer2;
        answer1 = (a*3)+b/2;
        System.out.println("Answer1 = " + answer1);
        answer2 = (a*3)+b/2-(3+5/2);
        System.out.println("Answer2 = " + answer2);
        //answer2 = 15.0 + 1.0 - 5 = 11.0
    }
}*/
/*  public static void main(String[] args) {
        int num1=10, num2=3, num3;
        int num4=10, num5=5, num6;
        num3 = num1%num2;
        num6 = num4%num5;
        System.out.println("num3 = " + num3);
        System.out.println("num6 = " + num6);
        /// %คือเศษของการหารเช่น 10/3=9เศษ1
    }
}*/
/*  public static void main(String[] args) {
        int num1=10, num2=3, num3;
        int num4=10, num5=5, num6;
        num3 = num1%num2;
        num6 = num4%num5;
        System.out.println("num3 = " + num3);
        System.out.println("num6 = " + num6);
        System.out.println(num1+" % "+num2+" = "+num3);
        System.out.println(num4+" % "+num5+" = "+num6);
    }
}*/
/* public static void main(String[] args) {
        int a, b;
        a = 7/3;
        b = 7%3;
        System.out.println("a = "+a);
        System.out.println("b = "+b); 
        //a=2 b=1
    }
}*/
/*  public static void main(String[] args) {
        int total=150;
        int hour, minute;
        hour = total / 60;
        minute = total % 60;
        System.out.println(total+" minutes = "+hour+" hours and "+minute+" minutes."); 
        //150 minutes =2 hours and 30 minutes.
     }
}*/
/*  public static void main(String[] args) {
        int total=16;
        int week, day;
        week = total / 7;
        day = total % 7;
        System.out.println(total+" days = "+week+" weeks and "+day+" days.");
        //16 days = 2 weeks and 2 days.
    }
}*/
/* public static void main(String[] args) {
        int total=100;
        int month, week, day;
        month = total/30;
        week = (total%30)/7;
        day = (total%30)%7;
        System.out.println(total+" days = "+month+" months "+week+" weeks and "+day+" days. ");
        ///100 days = 3 months 1 weeks and 3 days.
    }
}*/
/*  public static void main(String[] args) {
        int num = 5;
        System.out.println(num);
        num++;
        System.out.println(num);
        ++num;
        System.out.println(num);
    }
}*/
/*  public static void main(String[] args) {
        int num = 5;
        System.out.println(num);
        num--;
        System.out.println(num);
        --num;
        System.out.println(num); 
    }
}*/
/*  public static void main(String[] args) {
        int num1 = 5, num2;
        num2 = num1++;
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        //locates after num1; thus, store the value if num1 into number.Then, increment value of num1 later.
        //num1 = 6 , num2 = 5
    }
}*/
  public static void main(String[] args) {
        int num1 = 5, num2;
        num2 = ++num1;
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        //locates before num1; thus, increment value of num1 before storing value in num2
        // num1=6 , num2=6
    }
}

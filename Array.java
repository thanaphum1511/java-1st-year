import java.util.Scanner;
public class Array {
/*  public static void main(String[] args) {
        int age[] = {10,20,30};
        System.out.println("Show data in age[]");
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
    }
}*/
 /* public static void main(String[] args) {
        int age[] = {10,20,30};
        int i;
        System.out.println("Show data in age[]");
        for(i=0;i<3;i++){
            System.out.println("age ["+i+"]="+age[i]);
        }
    }
}   */     
/*  public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        int age[] =new int[3];
        int i;
        for (i=0;i<3;i++){
            System.out.print("Round "+(i+1)+": Enter age : ");
            age[i] =sn.nextInt();
        }
        System.out.println("Show data");
        for(i=0;i<3;i++){
            System.out.println("age["+i+"] = "+age[i]);
        }
    }
}  */
  /* public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        float score[] =new float[2];
        int i;
        for(i=0;i<2;i++){
            System.out.print("Round"+(i+1)+": Enter score: ");
            score[i]=sn.nextFloat();
        } 
        System.out.println("Show data in score[]");
        for(i=0;i<2;i++){
            System.out.println("score["+i+"]="+score[i]);
        }
    }
}    */                   
/*  public static void main(String[] args) {
        String name[]= {"Thanaphum","Achita"};
        System.out.println("Show data in name[]");
        System.out.println(name[0]);
        System.out.println(name[1]);     
    }
}   */
/* public static void main(String[] args) {
        String name[] = {"Thanaphum","Achita"};
        int i;
        System.out.println("Show data in name[]");
        for(i=0;i<2;i++){
            System.out.println("name["+i+"] = "+name[i]);
        }
    }
}  */
/*  public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        String name[]= new String[2];
        int i;
        for(i=0;i<2;i++){
            System.out.print("Round"+(i+1)+": Enter name: ");
            name[i] =sn.nextLine();
        }
        System.out.println("Show data in name[]");    
        for(i=0;i<2;i++){
            System.out.println("name["+i+"] = "+name[i]);
        }
    }
}   */
/*  public static void main(String[] args) {
       Scanner sn =new Scanner(System.in);
       String subject[] =new String[2];
       char grade[] =new char[2];
       int i;
       for(i=0;i<2;i++){
        System.out.print("Round"+(i+1)+": Enter subject: ");
        subject[i] =sn.nextLine();
        System.out.print("Enter grade: ");
        grade[i] =sn.next().charAt(0); 
        sn.nextLine();       }
       System.out.println("Show data in subject[] and grade[]");
       for(i=0;i<2;i++){
        System.out.println("subject["+i+"] = "+subject[i]);
        System.out.println("grade["+i+"] = "+grade[i]);      
       }
    }
}   */
/*  public static void main(String[] args) {
            Scanner sn =new Scanner(System.in);
            int age[] =new int[3];
            float sum=0, ave;
            int i;
            for(i=0;i<3;i++){
                System.out.print("Enter age["+i+"]: ");
                age[i] =sn.nextInt();
                sum =sum+age[i];
            }
            ave =sum/age.length;
            System.out.println("Show data"); 
            for(i=0;i<3;i++){
                System.out.println("age["+i+"] = "+age[i]);
            }    
            System.out.println("Sum = "+sum);
            System.out.println("Ave = "+ave);       
        }
}*/
/* public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        float score[] =new float[5];
        int i, hi_i=0, low_i=0;
        float hi_score=0, low_score=100;
        for(i=0;i<5;i++){
            System.out.print("Enter score of student "+(i+1)+": ");
            score[i] =sn.nextFloat();
            if(score[i]>hi_score){
               hi_score=score[i];
               hi_i=i;
            }
            if(score[i]<low_score){
                low_score=score[i];
                low_i=i;
            }        
        }
        System.out.println("The hightest is "+hi_score);
        System.out.println("Student "+(hi_i+1)+" has the hightest score");
        System.out.println("The lowest score is "+low_score);
        System.out.println("Student "+(low_i+1)+" has the lowest score");
    }    
}*/
/*public static void main(String[] args) {
// Scores for 5 students in Math, English, and JAVA
        String name[]={"Simon", "Peter", "Alice", "Smith", "John"};
        float score[][]={{65.50f, 88.00f, 90.50f},
                {95.50f, 83.00f, 50.50f},
                {77.50f, 97.00f, 80.50f},
                {66.50f, 97.00f, 63.50f},
                {64.50f, 75.00f, 98.50f}};

        int i, j;
        float max[]={0,0,0}; // max of 3 subjects
        for(j=0; j<3; j++){
            for(i=0; i<5; i++){
                if(score[i][j]>max[j]){
                    max[j]=score[i][j];
                }
            }
        }
        System.out.println("Max score of Math = "+max[0]);
        for(i=0; i<5; i++){
            if(score[i][0]==max[0]){
                System.out.println(name[i]);
            }
        }
        System.out.println("Max score of English = "+max[1]);
        for(i=0; i<5; i++){
            if(score[i][1]==max[1]){
                System.out.println(name[i]);
            }
        }
        System.out.println("Max score of JAVA = "+max[2]);
        for(i=0; i<5; i++){
            if(score[i][2]==max[2]){
                System.out.println(name[i]);
            }
        }
    }
}*/
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("กรุณากรอกจำนวนตัวเลข: ");
            int n = scanner.nextInt();

            // รับค่าตัวเลขโดยตรง
            System.out.print("กรุณากรอกตัวเลข 1: ");
            double number1 = scanner.nextDouble();

            System.out.print("กรุณากรอกตัวเลข 2: ");
            double number2 = scanner.nextDouble();

            // คุณสามารถขยายให้รับค่ามากกว่านี้ตามที่ต้องการ
            // เพิ่มตัวแปรตามจำนวนที่ n ต้องการ

            // สมมุติว่า n = 2 ในตัวอย่างนี้
            double sum = number1 + number2;
            double average = sum / n;

            System.out.println("ค่าเฉลี่ยคือ: " + average);

            scanner.close();
        }
    }




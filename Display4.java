import java.util.Scanner;
public class Display4 {
/*  public static void main(String[] args) {
        int age[]= {10, 20, 30};
        System.out.println("Show data in age[]");
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        //Show data in age[]
        //10
        //20
        //30
    }
}*/
/* public static void main(String[] args) {
        int age[]= {10, 20, 30};
        int i;
        System.out.println("Show data in age[]");
        for(i=0; i<3; i++){
         System.out.println("age["+i+"] = "+age[i]);
        }
    }
}*/
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float score[]= new float[5];
        int i;
        float sum=0;
        for(i=0; i<5; i++){
          System.out.print("Round "+(i+1)+": Enter score: ");
          score[i]=scan.nextFloat();
          sum=sum+score[i];
        }
        System.out.println("Show data in score[]");
        for(i=0; i<5; i++){
          System.out.println("score["+i+"] = "+score[i]);
        }
        System.out.println("Summation = "+sum);
        scan.close();
    }
}
/*  public static void main(String[] args) {
        String subject[] = new String[2];
        char grade[]= new char[2];
        int i;
        for(i=0; i<2; i++){
          Scanner scan = new Scanner(System.in);
          System.out.print("Round "+(i+1)+": Enter subject: ");
          subject[i]=scan.nextLine();
          System.out.print("Enter grade: ");
          grade[i]=scan.next().charAt(0);
          scan.nextLine();
          scan.close();
        }
        System.out.println("Show data in subject[] and grade[]");
        for(i=0; i<2; i++){
          System.out.println("subject["+i+"] = "+subject[i]);
          System.out.println("grade["+i+"] = "+grade[i]);
        }
    }
}*/

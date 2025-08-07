public class Array2 {
/* public static void main(String[] args) {
        String name[][]={{"PETER", "BRAD", "SIMON", "JOHN", "ALAN"},
        {"JIM", "TIM", "ANN", "BABARA", "STEVE"}};
        int sum=0,num, i,j;
        for(i=0; i<name.length; i++){
          for(j=0; j<name[i].length; j++){
            num=name[i][j].length();
            sum = sum+num;
          }
        }
        System.out.println("There are "+sum+" characters");
    }
}*/
 public static void main(String[] args) {
            //score of 2 sec, 3 student, midterm final;
            float scores[][][]={{{45.5f, 40.0f},{50.0f, 49.5f},{35.0f,35.0f}},
            {{40.5f, 44.0f},{30.0f, 39.5f},{45.0f,45.0f}}};
            int i,j,k;
            for(i=0; i<2; i++) //sections
            { System.out.println("======= Section " +(i+1)+ "=======");
            for(j=0; j<3; j++) //students
            { System.out.println("Student "+(j+1));
            for(k=0; k<2; k++) //midterm or final
            { if(k==0){
            System.out.println("Midterm score = "+scores[i][j][k]);
            }
            else{
            System.out.println("Final score = "+scores[i][j][k]);
            }
            }
            }
            System.out.println();
            }
            }
            }
        
 


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
      //1
       /* int [] ArrNum=new int[5];
        ArrNum[0]=50;
        ArrNum[1]=-20;
        ArrNum[2]=0;
        ArrNum[3]=30;
        ArrNum[4]=40;
        if(ArrNum[0]==ArrNum[ArrNum.length-1]){
        System.out.println(true);}
        else{
            System.out.println(false);
        }*/
    //2
        /*int [] ArrNum1={1,4,17,7,25,3,100};
        System.out.println(Arrays.toString(ArrNum1));
        int ArrNum2=0;
        for(int i=0;i<ArrNum1.length;i++){
            ArrNum2=ArrNum2+ArrNum1[i];

          }
        double Average=ArrNum2/ArrNum1.length;
        System.out.println("Average :"+Average);
        for(int i=0;i<ArrNum1.length;i++){
        if(ArrNum1[i]>Average)
            System.out.println("numbers greater than Average :"+ArrNum1[i]);
        }*/
     //3
      /*  int [] ArrNum3={20,30,40};

            if(ArrNum3[0]>=ArrNum3[ArrNum3.length-1]){
                System.out.println("the larger value is :"+ArrNum3[0]);
            }
                else {
                System.out.println("the larger value is :"+ArrNum3[ArrNum3.length-1]);}*/
        //4
       /* int [] ArrNum4={200,30,40};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(ArrNum4));
        int temp=ArrNum4[0];
        ArrNum4[0]=ArrNum4[ArrNum4.length-1];
        ArrNum4[ArrNum4.length-1]=temp;
        System.out.println(" Array after swapping:");
        System.out.println(Arrays.toString(ArrNum4));*/

       //5
      /*  Scanner input=new Scanner(System.in);
        System.out.println("please Enter the Size of Array");
        int size1=input.nextInt();

        if (size1>=5){
            System.out.println("Number is correct");

            int[] ArrNum5=new int[size1];
            ArrayList<Integer> Odd=new ArrayList<Integer>();
            ArrayList<Integer> Even=new ArrayList<Integer>();

            for(int i=0;i<size1;i++){
                System.out.println("please enter the numbers");
                int num=input.nextInt();
                if(num%2==1){
                    Odd.add(num);

                }
                else{
                    Even.add(num);
                }
            }
            System.out.println(Odd);
            System.out.println(Even);


        }*/
     //6

       /* int [] ArrNum6={2,3,6,6,4};
        int [] ArrNum7={2,3,6,6,4};
        if(Arrays.equals(ArrNum6,ArrNum7)){

            System.out.println(true);}
        else {
            System.out.println(false);}*/
        }

        }




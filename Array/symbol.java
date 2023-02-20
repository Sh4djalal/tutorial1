package Array;

import java.util.Date;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class symbol {

    public static void main(String agrs[]){

        mininumber();        
    }
    static void Symbol_array(){

        int[]name1 = new int[0];
        int[]name2 ={0,0,0};

        int[][]name3 = new int[0][0];
        int[][]name4 ={
        {  ,  }
        };

    }


    static void even_number(){

        int[]shad = new int[10];
            for(int x=0; x<10; x++){
            
            shad [x]= x;
            
            if(x%2==0){
            
            System.out.print(shad[x]);
            
            }
    }

}



    static void sum_array(){

        int sum = 0;
    int[][] array = new int[5][4]; 

        array[0][0] = 0;
        array[0][1] = 55;
        array[0][2] = 88;
        array[0][3] = 99;
        array[1][0] = 0;
        array[4][3] = 69;

    for(int x=0; x<5; x++ ){//rez

        for(int y=0; y<4; y++){   // colom
            sum++;
    System.out.println(array[x][y]);
    }
        }
        System.out.println("sum="+array.length);
            }

    static void even_num(){
    int[]array= new int[10];
        int sume=0,sumo=0;
            for(int x=0; x<10; x++){
                array[x]=x;
                if(x%2==0){
                    sume++;
                    System.out.println("That is even number:"+x);
                        }else if(x%2==1){
                            sumo++;
                            System.out.println("That is odd number:"+x);
                        } 
                    }System.out.print("sum even number="+sume+ ", sum odd number="+sumo);
            }    

    static void maxnumber(){

            int[]array= {44,66,100,101,11,102,45};
            int z,h,max=0;
            for(int x=0; x<array.length; x++){
                for(int y=0; y<array.length; y++){
                z=array[x];
                h=array[y];    
            if(z<h){
                max=h;
                
            }
            }
            }System.out.println(max);
            }

    static void mininumber(){

        Date T = new Date();
        System.out.println(T);
        int[]array ={1,2,3,4,5,6,88,8,9,10};
        int min=array[0],z;
            for(int x=1; x<array.length; x++){
                z=array[x];
                if(z<min){
                    min=z;
                }
                
            }System.out.println(min);
    }

    static void maxandmin(){

        int[]array={44,55,22,11,33,77,0};
        int max=array[0],min=array[0];

        for(int i=1; i<array.length; i++){
            if(array[i]>max){
                max=array[i];

            }else if(array[i]<min){
                min=array[i];
            
            }
        }System.out.println(max+" "+min);
    }

}

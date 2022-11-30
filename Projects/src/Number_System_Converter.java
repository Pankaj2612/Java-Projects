import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Number_System_Converter {





    static void printvalue(){
        System.out.println("HI, This Program converts Decimal number System to Binary number System");
        Scanner input_user1 = new Scanner(System.in);
        Scanner input_user2 = new Scanner(System.in);
        
        int user_input1 = input_user1.nextInt();
        int user_input2 = input_user2.nextInt();
        input_user1.close();
        input_user2.close();
        
        ArrayList v = new ArrayList<>();
        
           

            for  (int i = user_input1 ; i >=1;){
                
                int q = i % user_input2;
                i = i / user_input2; 
                v.add(q);
            }
            Collections.reverse(v);
    
            System.out.println(v);


            } 

        
        



    
    public static void main(String [] args) {

        

        

        printvalue();
        

        
    }
    
}

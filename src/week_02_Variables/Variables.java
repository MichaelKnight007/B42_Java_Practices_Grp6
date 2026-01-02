package week_02_Variables;

import week_06_Methods.Methods;
import week_07_Class_And_Object.Personel.Personel_Class;

public class Variables {


    public static void main(String[] args) {



        Methods.firstMethod();

        System.out.println("Group-05 is great.");
        System.out.println("Hello Group-05.");
        System.out.println("A good start is important for Group-05.");


        System.out.println("----------------------------------------------------");
        String groupName = "Group-06";

        System.out.println(groupName+" is great.");
        System.out.println("Hello "+groupName+ ".");
        System.out.println("A good start is important for " +groupName+".");


        byte num1=-128;
        short num2=32_767;
        int num3=65535; // 4 bytes
        long num4=9223372036854775807L;

        float float5Number55555=0.55165165F;
        double doubleNumber=1.999999999999999;

        String stringNumber="A";
        char ch='A';
        char c_1='A';

        String class_A="ABBBBBB";

        char a$='A';

// 1. Varaibles are created


        double db1=num3; //implicit casting

        int intiger_casting_with_double= (int) doubleNumber; // 8 bytes to 4 bytes

        System.out.println("intiger_casting_with_double = " + intiger_casting_with_double);//1

        System.out.println("intiger_casting_with_double = " + doubleNumber);

        System.out.println("Havalar ne güzel");
    }
}

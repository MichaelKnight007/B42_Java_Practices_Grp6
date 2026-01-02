package week_03_Operators;

public class Operators {
    public static void main(String[] args) {

        //Concatenation

        System.out.println(3 + 5 + "Cydeo" + 3 + 5); //8Cydeo35
        System.out.println(3 + 5 + "Cydeo" + 3 + 5 + 6); //8Cydeo356
        System.out.println(3 + 5 + "Cydeo" + (3 + 5 + 6)); //8Cydeo14
        System.out.println(3 + 5 + "Cydeo" + 3 * 5); //8Cydeo15
        System.out.println("" + 3 + 5 + "Cydeo" + 3 + 5); //35Cydeo35


        // Arithmetic Operators

        System.out.println(5 + 3);
        System.out.println(5 - 3);
        System.out.println(5 * 3);
        System.out.println(5 / 3); //1
        System.out.println(5 % 3); // 2

        // 1215_1235_3654_1256 ==> 12** **** **** 1256
        System.out.println("(1215_1235_3654_1256%1000) = " + (1215_1235_3654_1256l % 10000));

        // Unary Operators

        int a = 5;

        System.out.println(5 + a++); //10 ==> a++ a=a+1 // a=6
        System.out.println(5 + ++a); //12 ==> a=7


        a += 2; // a=a+2 --> 9
        a -= 2; // a=a-2 --> 7
        a *= 2; // a=a*2 --> 14
        a /= 2; // a=a/2 --> 7

        // Logical Operators

        int age = 17;
        boolean isUSCitizen = true;

        // System.out.println(age >= 18 & isUSCitizen); // true
        // System.out.println(age >= 18 & isUSCitizen); // false
        System.out.println(age >= 18 & isUSCitizen); // false
        System.out.println(age >= 18 & isUSCitizen); // false
        System.out.println(age >= 18 && isUSCitizen); // false


        System.out.println(isUSCitizen & ++age > 18);//
        System.out.println("age with 1 & = " + age); // 18

        System.out.println(isUSCitizen && ++age > 18);// 18
        System.out.println("age with 2 &s = " + age); //


        boolean isUKCitizen2 = !false;
        System.out.println(isUKCitizen2 | isUSCitizen); // true
        System.out.println(isUKCitizen2 || isUSCitizen); // true

        boolean bl = !false; //true

        // Precedence

        System.out.println(3 + 5 - 2); // 6
        System.out.println(3 + (5 - 2)); // 6
        System.out.println(3 + 5 * 2); // 13
        System.out.println(3 + 5 * 6 / 2); // 18
        System.out.println((3 + 5) * 6 / 2); //24


    }
}

package week_05_Loops;

public class Loops {
    public static void main(String[] args) {

        //int num=5, num2=6, num3;


        // ********************** FOR LOOP **************************************
        //int i ; // Global or instance variable
/*
        for (int i = 0; i < 5; i++) { //i=0, i= i+1  ==> i=0, i=0+1 ==> i=1, i=1+1 ==> i=2, i=2+1, i=3+1, i=4+1 ==> i=5
            System.out.println(i); // 0, 1, 2, 3, 4
            System.out.println(i + 5); // 5, 6, 7, 8,
        }*/

        //  System.out.println("i = " + i);
        //System.out.println(i);*/

/*




        for (int i = 5; i > 0; i--) { // i= i-1  ==> i=5, i=5-1, i=4-1, ... i=1-1
            System.out.println(i+ ". Hello group_7"); // 5, 4, 3, 2, 1
        }*/

       /* for(;;){
            System.out.println("Hello World");
        }*/

     /*   System.out.println("------------------------------------------------------");

        for (int i = 0; i < 10; i++) {// i= i+3 ==> i= 3, 3+1, 7+1, 11+1

            System.out.print(i + ", "); // 0, 4, 8

            i += 3; // 0+3, 4+3, 8+3
        }*/


        /*System.out.println("------------------------------------------------------");
        for (int i = 0; i < 5; ) {// i=
            System.out.println(i);

            i++;
            System.out.println("------------------------");
            System.out.println("i after increasing by one " + i);

            System.out.println("//////////////////////////////////////////////");
            System.out.println();

        }*/

       /* System.out.println("------------------------------------------------------");

        // int x = 0; // Global/instance variable belongs to main

        for (int x = 0; x < 5; x++) {
            System.out.println("x: " + x);

        }

        System.out.println(x*5);
*/
/*

        for (int i = 1, j = 5; i <= 10 && j >= 5 ; i++, j++) {

            System.out.print("i = " + i);
            System.out.println(" j = " + j);

        }

        System.out.println("---------------------------------------------------");

        for (int i = 1, j = 5; i <= 10 && j < 20; i++, j++) {

            System.out.print("i = " + i);
            System.out.println(" j = " + j);
        }
*/


       /* System.out.println("----------------------- continue -------------------------------");

        for (int i = 0; i <= 5; i++) {// i=0, i=1, i=2, i=3, i=4, i=5, i=6

            if (i == 3) {// 0 !=3, 1!=3, 2!=3, 3==3, 4!=3
                continue;
            }
            System.out.println(i); // 0, 1, 2, 4, 5
        }*/


      /* System.out.println("--------------------- break ---------------------------------");
        for (int i = 0; i <= 5; i++) {// i=0, i=1, i=2, i=3

            if (i==3){
                break;
            }
            System.out.println(i); // 0, 1, 2
        }*/

        //  ******************************* Nested LOOP  *********************************
        /*System.out.println("-------------------------- NESTED LOOP ----------------------------");


        for (int i = 1; i <= 5; i++) { //i=1, 2
            System.out.println("Outer Loop i = " + i); // 1, 2, 3

            for (int j = 1; j <= 5; j++) {// j=1, 2, 3, 4, 5, 6

                System.out.println("i"+ i +" j = " + j); // i=1 and j=1, i=1 and j=2, i=1 and j=3, i=1 and j=4, i=1 and j=5
                // i=2 and j=1, i=2 and j=2, i=2 and j=3, i=2 and j=4, i=2 and j=5
                // i=3 and j=1, i=3 and j=2, i=3 and j=3, i=3 and j=4, i=3 and j=5

                *//*for(int k = 1; k <= 5; k++) {
                    System.out.println("i"+ i +" j"+ j +" k = " + k);
                    for(int l = 1; l <= 5; l++) {
                        System.out.println("i"+ i +" j"+ j +" k = " + l);
                    }
                }*//*


            }

        }
*/


      /*  for (int i = 10; i >= 0; i--) {
            System.out.print(i +" ");

        }*/



       /* for (int i = 1; i <= 10; i++) {// i=1, i=2,
            //  System.out.print(i);

            for (int j = 1; j <= 10; j++) { // i=1 and j=1, i=1 and j=2, i=1 and j=3, ... i=1 and j=10, i=1 and j=11
                // i=2 and j=1, i=2 and j=2, i=2 and j=3, ... i=2 and j=10, i=2 and j=11

                System.out.print(i + "*" + j + "= " + i * j + "\t"); //1*1, 1*2, 1*3, ..., 1*10

            }

            System.out.println();
        }
*/
//  ******************************* Infinite LOOP  *********************************
       /* System.out.println("-------------------------- Infinite LOOP ----------------------------");

        for (int i = 0; i < 5; i--) { //
            System.out.println(i); //
        }*/


        //  ******************************* WHILE LOOP  *********************************
        //  System.out.println("-------------------------- WHILE LOOP ----------------------------");

      /*  Scanner input = new Scanner(System.in);


        int num = 1;

        while (num <= 8) { // 1,2...8, 9
            System.out.println("Value of num is " + num);// 0, 1.., 8
            num++; // 1, 2 , 3... , 8, 9
        }*/

        /*while(true){

            System.out.println("Enter a number:");
            int number = input.nextInt();

            if (number%2==0){
                System.out.println("The number is even");
            }else {
                System.out.println("The number is odd");
            }

            System.out.println("Do you want to continue?");
            input.nextLine();
            String answer=input.nextLine();

            if(answer.equalsIgnoreCase("no")){
                break;
            }
        }
*/

        /*boolean bl1 = 9 < 10; //true

        while (bl1){
            System.out.println(bl1);
             bl1 = false;
        }*/

/*
        int a=10;

        while(a>=0){
            System.out.println(a+". Group_12 is great but slient...");
            a--;
        }*/


        //  ******************************* DO WHILE LOOP  *********************************
       /* System.out.println("-------------------------- DO WHILE LOOP ----------------------------");

        int num1 = 35;

        do {
            System.out.println("Value of num is " + num1); //35
            num1++;
        } while (num1 < 35); //false*/

//  ******************************* EXERCISES  *********************************
      /*  System.out.println("************************** EXERCISE_1 ******************************");

        boolean flag = true;

        for (int i = 0; i <= 5; i++) {//i=0, i=1, i=2

            if (flag) {//flag=true, false, true
                System.out.print(i + " "); // 0 , 2, 4
            }

            flag = !flag;// flag= true, false, true, false,

        }*/

/*
       System.out.println("************************** EXERCISE_2 ******************************");

        for (char ch = 'A'; ch <= 'D'; ch++) { // 65, 66, 67, 68

            if (ch == 'C') {
                continue;
            }

            System.out.print(ch + " "); //A, B

            if (ch == 'B') {
                break;
            }
        }*/

       /* System.out.println("************************** EXERCISE_3 ******************************");

        int x = 10;
        for (int i = 0; i < 5; i++) {//0 ,1, 2, 3, 4
            x += i; // x=x+i; x=10+0, 10+1, 11+2, 13+3, 16+4
        }
        System.out.println(x);//20
*/
        /*System.out.println("************************** EXERCISE_4 ******************************");

        int i=9;

        if (i<10){
            System.out.println("Too short");
            break;
        }else {
            System.out.println(i++);
        }*/


        /*System.out.println("************************** EXERCISE_5 ******************************");

        String str = "Java";
        String str2 = new String(str);

        int count = 10;

        do {
            count += 2; //

        } while (str == str2);

        System.out.println(count);*/

        /*System.out.println("************************** EXERCISE_6 ******************************");

        for (int i = 0; i <= 5; i++) { //i=0, 1, 2, 3, 4, 5

            if (i + 2 > 5) {//0+2!>5,3!>5,4!>5, 5!>5, 6>5, 7>5
                continue;
            }

            System.out.print(i + " ");//0 , 1 ,2 ,3 ,
        }*/


       /* System.out.println("************************** EXERCISE_7_1 ******************************");

        for (int i = 0; i < 5; i++) {// i=0, 3, 6
            System.out.println("hello");
            i += 2;//i=0+2,3+2,
        }*/


       /* System.out.println("************************** EXERCISE_7_2 ******************************");
        for (int i = 0; i < 5; i++) { // i=0,
            System.out.println("hello");
            break;
        }*/

       /* System.out.println("************************** EXERCISE_8 ******************************");

        for (int i = 0; i < 10; i++) {
            // i=0,
            if(i==5){ // false,
                continue;
            }
            System.out.print(i + " "); // 0, 1, 2, 3, 4, 6 ,7, 8, 9
        }*/

      /*  System.out.println("************************** EXERCISE_9 ******************************");
        int x = 0;

        while (x < 4) { // x=0,1, 2, 3, 4
            x = x + 1; // x=0+1, 1+1, 2+1, 3+1  x++;
        }
        System.out.println(x);*/

       /* System.out.println("************************** EXERCISE_10 ******************************");

        int count= 0;

        do{ // count=0,1
            System.out.println("Welcome to Java...");//
            count++; //1, 2, 3, 4 , 5
        }while(count < 5);*/


        if (5 > 6) {
            System.out.println(5);
        }
        // ****************************** KAHOOT **********************************************

        /*System.out.println("****************************** KAHOOT_2 *******************************************");
        int x = (9 - 10) ? 10 : (11 < 12) ? 9;
        System.out.println(x);*/
/*
        System.out.println("****************************** KAHOOT_3 *******************************************");
        for(int i=0;i<=20; i+=2){System.out.print(i + " ");}*/

        /*System.out.println("****************************** KAHOOT_4 *******************************************");
        int number=6;
        if(number%2==0){
            System.out.println(number + " is even");
        }

        if(number%2!=1){
            System.out.println(number + " is even");
        }*/

      /*  System.out.println("****************************** KAHOOT_5 *******************************************");
        boolean x = true;
        boolean y = false;

        if (x && y) {
            System.out.println(false);
        }else{
            System.out.println(true);
        }*/


      /*System.out.println("****************************** KAHOOT_6 *******************************************");
        for (int i = 0; i < 5; i++) { // i=0 , 4 , 8
            System.out.println("Hello");
            i+=3;
        }*/


       /* System.out.println("****************************** KAHOOT_7 *******************************************");
        for (int i = 1; i <= 10; i++) {

            // System.out.println(i + " ");

            if (i == 4) {
                break;
            }
            System.out.println(i + " ");
        }*/


     /*   System.out.println("****************************** KAHOOT_8 *******************************************");

        int x = 7;
        int y = 5;


        if (x > y)
            System.out.println(true);

            System.out.println(false);

        System.out.println("Java");

*/
       /* System.out.println("****************************** KAHOOT_9 *******************************************");

        int marks = 50;

        if(marks<=70)
            System.out.println("Distinction");
        else if (marks>=35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
*/

    /* System.out.println("****************************** KAHOOT_10 *******************************************");
        int x = 1;

        while (x < 6) {
            System.out.println("Hello");
            if (x == 4) {
                break;
            }
        }*/


       /* System.out.println("****************************** KAHOOT_11 *******************************************");
        int i=5;

        do{
            System.out.println("Cydeo");
            i++;
        } while(i<5);*/


        System.out.println("****************************** KAHOOT_12 *******************************************");

        int i=0;
        for (i = 0; i <= 5; i++) {

            System.out.print("i= "+i + " ");
        }

        System.out.println("i after the loop= " + i);


       /* for (int a = 1; a <= 30; a++) {
            if (a % 3 == 0) {
                System.out.println(a + " a is divisible by 3");
            } else if (a % 5 == 0) {
                System.out.println(a+ " a is divisible by 5");

            } else if (a % 10 == 0) {
                System.out.println(a + " a is divisible by 10");
            } else if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a + " a is divisible by 15");
            } else {
                System.out.println(a + " a is divisible by anything else");
            }
        }
        */


       /* for (int a = 1; a <= 30; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a + " a is divisible by 15");
            }else if (a % 10 == 0) {
                System.out.println(a + " a is divisible by 10");
            }else if ( a % 5 == 0) {
                System.out.println(a + " a is divisible by 5");
            } else if (a % 3 == 0) {
                System.out.println(a + " a is divisible by 3");

            }else{
                System.out.println(a + " a is divisible by anything else");
            }
        }*/
    }
}

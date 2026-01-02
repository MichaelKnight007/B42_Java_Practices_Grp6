package week_07_Class_And_Object.Personel;

public class Emplooyee {
    public static void main(String[] args) {

        //  ********* Objects *************
        Personel_Class employee_1 = new Personel_Class();

        Personel_Class employee_2 = new Personel_Class();
        Personel_Class employee_3 = new Personel_Class();

        // ******* Obj_1 ****************
        employee_1.firstName = "Mike";
        employee_1.lastName = "Knight";
        employee_1.age = 50;
        employee_1.registrationNumber = 12345;
        // employee_1.jobTitle = "Mentor";
        employee_1.department = "SDET";
        employee_1.salary = 250000;
        //employee_1.yearsOfExperience=2;
        employee_1.isFullTime = true;
        //employee_1.companyName = "Cydeo";

        System.out.println("employee_1 = " + employee_1);
        System.out.println();

        employee_1.displayingPersonelData();
        employee_1.rest("Lobby");
        employee_1.eat();

        // employee_1.sleep();
        Personel_Class.sleep();

        System.out.println("=================================================");

        ////////////////////////////////////////////////////
        employee_2.firstName = "Faris";
        employee_2.lastName = "El Battahe";
        employee_2.age = 20;
        employee_2.registrationNumber = 1234565;
        employee_2.department = "SDET";
        employee_2.salary = 250000;
        employee_2.isFullTime = true;
        employee_2.jobTitle = "Mentor";
        employee_2.yearsOfExperience = 5;
       // employee_2.companyName="Cydeo";

        System.out.println("employee_2 = " + employee_2);

        employee_2.displayingPersonelData();
        employee_2.eat();
        employee_2.work();


        System.out.println("===============================================");

        employee_3.displayingPersonelData();

    }
}

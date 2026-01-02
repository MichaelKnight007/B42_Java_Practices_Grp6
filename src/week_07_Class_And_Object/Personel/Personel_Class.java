package week_07_Class_And_Object.Personel;

public class Personel_Class {

    // ********** Fields ************************

    public String firstName;
    public String lastName;
    public int age;
    public int registrationNumber;
    public String jobTitle;
    public String department;
    public int yearsOfExperience;
    public double salary;
    public boolean isFullTime;
    public String companyName ="Cydeo";


    // ***************** Methods *********************************

    /**
     * This method is created to show who is working at the moment.
     */
    public void work() {
        System.out.println(firstName + " " + lastName + " is working now.");
    }


    /**
     *
     * @param location (this location is a place in the company facilities)
     */
    public void rest(String location) {
        System.out.println(firstName + " " + lastName + " is resting now at the " + location + ".");
    }


    public void eat() {
        System.out.println(firstName + " " + lastName + " is eating now.");
    }


    public static void sleep() {
        System.out.println("Personel is sleeping now.");
    }

    public void displayingPersonelData() {
        System.out.println("Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Department: " + department);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Salary: " + salary);
        System.out.println("Full Time: " + isFullTime);
        System.out.println("Company Name: " + companyName);

    }


    // ******************** toString() **************************


    @Override
    public String toString() {
        return "Personel_Class{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", registrationNumber=" + registrationNumber +
                ", jobTitle='" + jobTitle + '\'' +
                ", department='" + department + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}

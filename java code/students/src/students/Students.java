
package students;

import java.util.Scanner;
import static students.student.numOfStudent;

class student{
    public String ID;
    int BirthDate;
    String FirstName, LastName;
     private double GPA;
     public static int numOfStudent=0;
     private study_program program;
 student(){
    this("","","",2019,0.0,new study_program());
}
student  (String ID,String FirstName,String  LastName, int  BirthDate,double GPA,study_program p)
{
    this.ID=ID;
    this.BirthDate=BirthDate;
     this.FirstName=FirstName;
     this.LastName=LastName;
      this.GPA=GPA; 
      program=p;
      numOfStudent++;
}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(int BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public static int getNumOfStudent() {
        return numOfStudent;
    }

    public static void setNumOfStudent(int numOfStudent) {
        student.numOfStudent = numOfStudent;
    }

 public String getName(){
 String full_name=FirstName+" "+LastName;
 return full_name;
 }
public int getAge(){
int new_age=2019-BirthDate; 
return new_age;
}
protected double update_GPA(double gpa){
 GPA= (GPA+gpa)/2 ;
 return GPA;
}

    public study_program getProgram() {
        return program;
    }




}

class study_program{
private String major;
private String degree;
private int year;

    study_program(String major, String degree, int year) {
       this.major=major;
       this.degree=degree;
       this.year=year ; 
       
    }

    study_program() {
     
    }

    public String getMajor() {
        return major;
    }

    public String getDegree() {
        return degree;
    }

    public int getYear() {
        return year;
    }


}







public class Students {
static Scanner input=new Scanner(System.in);
static int numstudent=0;
 static student s[];
     public static int cheack(String id)
        {
       
            for (int j = 0; j < 10; j++) {
               if(id.equals(s[j].getID()))
        return j; 
            }
        return -1;
        }
     
     
     
    public static void main(String[] args) {
 
          int ch;
 
       String menue="1-Add a new product \n 2-Update a student \n 3-Update a GPA  4-Delete a student \n  5-print \n  0-exit";
        System.out.println(menue);
       ch=input.nextInt();
        while(ch!=0){
       switch (ch){
          case 1:
          {
        System.out.println("please enter how many student you want to enter");
        numstudent=input.nextInt();
              if (student.numOfStudent<numstudent){
                  System.out.println("please enter first name");
                  String lname=input.next();
                   System.out.println("please enter last name");
                   String fname=input.next();
                    System.out.println("please enter ID");
                     String ID=input.next();
                     System.out.println("please enter birthday year");
                     int age=input.nextInt();
                      System.out.println("please enter gpa");
                  double GPA=input.nextDouble();
                  System.out.println("last qualification  ******************");
                  System.out.println("please enter major");
                  String major=input.next();
                  System.out.println("please enter degree");
                       String degree=input.next();
                  System.out.println("please enter get year");
                  int year=input.nextInt();
                  
             s[student.numOfStudent]=new student(ID,fname,lname, age,GPA,new study_program(major,degree,year));
              }
              
              }
               break;
         case 2:{
             System.out.println("please enter ID");
             String id=input.next();
             int c=cheack(id);
             if (c!=-1)
             {
                 
             System.out.println("please enter first name");
                  String lname=input.next();
                   System.out.println("please enter last name");
                   String fname=input.next();
                    System.out.println("please enter ID");
                     String ID=input.next();
                     System.out.println("please enter birthday year");
                     int age=input.nextInt();
                      System.out.println("please enter gpa");
                  double GPA=input.nextDouble();
                  System.out.println("last qualification  ******************");
                  System.out.println("please enter major");
                  String major=input.next();
                  System.out.println("please enter degree");
                       String degree=input.next();
                  System.out.println("please enter get year");
                  int year=input.nextInt();
                  s[c].setBirthDate(age);
                  s[c].setFirstName(fname);
                  s[c].setLastName(lname);
                  s[c].setID(ID);
                  s[c].setGPA(GPA);
                  
             
             }
             else 
                 System.out.println("we don't have");
               break;
         }
         case 3:
         {
             System.out.println("please enter ID");
             String id=input.next();
             int c=cheack(id);
             if (c!=-1)
             {
             System.out.println("please enter ID");
                     String ID=input.next();
                     s[c].setID(ID);
                   for (int i = c; i < student.numOfStudent; i++) {
                   s[i]=s[i+1];
                 }
             student.numOfStudent--;
             }
         }
               break;
         case 4:
         {
             for (int i = 0; i < 10; i++) {
                 s[i].getName();
                 System.out.println("student name: "+s[i].getName());
                 System.out.println("student age: "+s[i].getAge());
                 System.out.println("Student ID: "+s[i].getID());
                 System.out.println("Student GPA"+s[i].update_GPA(i));
                  System.out.println("**************last qualification  ******************");
                  System.out.println(" major: "+s[i].getProgram().getMajor());
                  System.out.println("degree: "+s[i].getProgram().getDegree());
                  System.out.println(" year:  "+s[i].getProgram().getYear());
             }
         }
               break;
         
          default:
              break;
       }
       System.out.println(menue);
       ch=input.nextInt();
       }
    }}
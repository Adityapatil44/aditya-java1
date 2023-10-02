package Constructor_Overloading;

public class Student {
    String name,email;
    int rollNo,marks,pin;
    Student(int marks,int pin)
    {
        System.out.println("I am in 1st constructor");
        this.marks = marks;
        this.pin=pin;
        

    }
    Student( int marks,String name)
    {
        System.out.println("I am in 2nd constructor"); 
        this.marks=marks;
        this.name=name;
    }
    Student(String name,int rollNo)
    {
        System.out.println("I am in 3rd constructor"); 
        this.name=name;
        this.rollNo=rollNo;


    }
    Student( String name,int rollNo,String email)
    {
         System.out.println("I am in  4th constructor");
         this. 
    }
    void display()
    {
         System.out.println("name is"+name);
         System.out.println("marks is"+marks);
         System.out.println("rollNO is"+rollNo);
         System.out.println("email is"+email);
    }
    public static void main(String[] args) {
        Student st1=new Student(100,410206);
        st1.display();
        System.out.println("-----------------------------");
        Student st2=new Student("Aditya",101);
        st2.display();
         System.out.println("-----------------------------");
        Student st3=new Student ("Aditya",10,"aditya@gmail.com");
        st3.display();
         System.out.println("-----------------------------");
        Student st4=new Student(102,"Aditya");
        st4.display();
    }


    
}

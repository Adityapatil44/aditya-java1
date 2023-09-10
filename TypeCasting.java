public class TypeCasting {
public static void main(String[]args){
    //implicit type casting
    int a,b;
    a=15;
    b=20;
    double a1,b1,div;
    a1=a;
    b1=b;
    div=a1/b1;
    System.out.println("div is"+div);

    //explicit type casting (double to int)
    //syntax destination variable=(destination data type)source variable
    double pi=3.14;
    int p=(int)pi;
    System.out.println("p value is"+p);
    
    //constant & static variable
     String collegeName="pillai Hoc";
    System.out.println("my college name is"+collegeName);
     // collegeName="MGM college";
   // System.out.println("my college name is"+collegeName);


}


    
}

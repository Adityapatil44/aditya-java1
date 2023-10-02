package Method_Overloading;

public class Operation {
    void add(int a,int b)
    {
        System.out.println("1st method add is"+(a+b));

    }
     void add(int a,int b,int c)
     {
        System.out.println("2nd method add is"+(a+b+c));
    
     }
      void add(int a,float b)
      {
         System.out.println("3rd method add is"+(a+b));
      }
      void add(float b,int a)
      {
          System.out.println("4th method add is"+(a+b));
      }
      double add(int a,double b)
      {
        //int c=(int)b;
        return a+b;

      }
      public static void main(String[] args) {
        Operation op=new Operation();
        System.out.println(op.add(10,20.50));
        op.add(10.5f, 10);
        op.add(10,10.5f);
        op.add(10,20,30);
        op.add(10,20);
      }

    
}

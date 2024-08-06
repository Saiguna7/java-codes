
class printer{
    void add(int a ){
        System.out.println("Printing int: " + a);

    }
    void add(double a ){
        System.out.println("Printing double: " + a);

    }
    void add(String a ){
        System.out.println("Printing String: " + a);

    }
}
public class methodoverloading {
    public static void main(String args[]){
      printer p=new printer();
      p.add(5);
      p.add(5.5);
      p.add("string");
    }
}

import java.util.Scanner;
public class MainClass{ 
  public static void main(String args[]){
       Scanner _key = new Scanner(System.in);
double  a;
double  b;
String  t1;
a= _key.nextDouble();
b= _key.nextDouble();
a = 1+2*3/b;
while (a<1) {
a= _key.nextDouble();
}
if (a>b) {
System.out.println(a);
} else {
System.out.println(b);
}

      _key.close();
  }
}
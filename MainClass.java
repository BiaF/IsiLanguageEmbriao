import java.util.Scanner;
public class MainClass{ 
  public static void main(String args[]){
       Scanner _key = new Scanner(System.in);
double  a;
double  b;
double  c;
double  d;
double  e;
double  f;
String  t1;
String  t2;
System.out.println("Qual � o seu nome?");
t1= _key.nextLine();
System.out.println("Digite o valor de a:");
a= _key.nextDouble();
// "Esse � um coment�rio para mostra a possibilidade de inserir um."

System.out.println("Digite o valor de b:");
b= _key.nextDouble();
if (a>b) {
System.out.println("Seu a � maior que seu b. O valor dele �:");System.out.println(a);
} else {
System.out.println("Seu b � maior que seu a. O valor dele �:");System.out.println(b);
}

System.out.println("O compilador tamb�m aceita n�meros decimais.");
System.out.println("Digite um n�mero decimal:");
a= _key.nextDouble();
System.out.println("Seu n�mero � ");
System.out.println(a);
c = (1+2)*3;
d = 1+2*3;
e = (3/3)-2*2;
f = ((5+2+3)*2)-10/2;
System.out.println("Vamos mostrar a utiliza��o de par�nteses em express�es num�ricas.");
System.out.println("(1 + 2) * 3 = ");
System.out.println(c);
System.out.println("1 + 2 * 3 = ");
System.out.println(d);
System.out.println("(3 / 3) - 2 * 2 = ");
System.out.println(e);
System.out.println("((5+2+3) * 2) - 10 / 2 = ");
System.out.println(f);
System.out.println("Vamos mostrar a execu��o da estrutura de repeti��o.");
System.out.println("Para isso, vou contar de 0 a 3 sozinho.");
a = 0;
while (a<=3) {
System.out.println(a);a = a+1;
}
System.out.println("Tamb�m � poss�vel colocar decis�es aninhadas:");
System.out.println("Digite um n�mero de 1 a 100: ");
a= _key.nextDouble();
if (a>25) {
if (a<75) {
System.out.println("Seu n�mero est� entre 25 e 75");
} else {
System.out.println("Seu n�mero � maior que 75");
}

} else {
System.out.println("Seu n�mero � menor que 25");
}

System.out.println("E repeti��es aninhadas:");
a = 0;
b = 1;
while (a<3) {
b = 1;while (b<=2) {
System.out.println(b);b = b+1;
}a = a+1;
}
// "a := t1"

// "g := 32"

      _key.close();
  }
}
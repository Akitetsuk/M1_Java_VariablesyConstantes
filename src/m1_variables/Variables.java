package m1_variables;
//VARIABLES Y CONSTANTES

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        p1();
        p2();
        p3();
        p4();
        p5();
        p6();
        p7();
        p8();
        p9();
        p10a();
        p10b();
        p10c();
        p10d();
        p10e();
        p10f();
        p10g();
        p10h();
        p10i();
        p10j();
        p10k();
        p11a();
        p11b();
        p11c();
        p11d();
        p11e();
        p12();
        p13();
        p14();
    }

    public static void p1() {
        System.out.println("Problema 1 ¿Qué resultado devuelve el siguiente código?");
        Boolean x = true;
        Boolean y = false;
        System.out.println(x || y);
        System.out.println(x && y);
    }
    public static void p2() {
        System.out.println("Problema 2 ¿Qué resultado devuelve el siguiente código?");
        int x=25;
        System.out.println(x == 7);
    }

    public static void p3() {
        System.out.println("Problema 3 ¿Qué resultado devuelve el siguiente código? ");
        int x = 25;
        int y = 77;
        System.out.println((x!=y));
    }

    public static void p4() {
        System.out.println("Problema 4 Haz un programa que calcule el resultado de la siguiente fórmula:  ( a + b - c * ( d / e )) * f  \u0001 usa las variables que necesites");
        int a=4, b=6, c=7,d=8,e=9,f=8;
        int formula = (a+b-c*(d/e))*f;
        System.out.println("el resultado de la forumla es: " + formula);
    }

    public static void p5() {
        System.out.println("Problema 5 ¿Qué sucedería en la siguiente operación? ¿Por qué?");
        float x = 23.5f;
        //int y =x;
    }
    public static void p6() {
        System.out.println("Problema 6 ¿Qué sucedería en la siguiente operación? ¿Por qué?");
        float x =23.5f;
        int y = (int)x;
    }
    public static void p7() {
        System.out.println("Problema 7 ¿Qué sucedería en la siguiente operación? ¿Por qué?");
        int x = 23;
        float y = x;
    }
    public static void p8() {
        System.out.println("Problema 8 ¿Qué sucedería en la siguiente operación? ¿Por qué?");
        int x =  23;
        float y = (float)x;
    }
    public static void p9() {
        System.out.println("Problema 9 ¿Qué tipo de dato usarías para una máxima precisión con decimales?");
        System.out.println("- Int/-Double/- Float/-Short ");
    }
    public static void p10a() {
        System.out.println("Problema 10 Para cada uno de los programas que se dan a continuación, decir que es el que se escribirá cuando sea ejecutado. ");
        int a;
        int b;
        a = 10;
        b = 15;
        a= b+3+5*b;
        b = a-b*2;
        a = a+b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void p10b(){
        System.out.println("Problema 10 Para cada uno de los programas que se dan a continuación, decir que es el que se escribirá cuando sea ejecutado. ");
        int a;
        int b;
        a=10;
        b= 11;
        a =b/4%3;
        b = 2+a*3/2+1;
        System.out.println(a);
        System.out.println(b);
    }

    public static void p10c(){
        System.out.println("Problema 10 Para cada uno de los programas que se dan a continuación, decir que es el que se escribirá cuando sea ejecutado. ");
        int a;
        int b;
        int c;
        a = 5;
        b =6;
        a = 2+b-a*2/4;
        b = a+2*b+1;
        c =a%b + b%a + a/b + b/a;
        System.out.println(c);
    }

    public static void p10d(){
        System.out.println("Problema 10 Para cada uno de los programas que se dan a continuación, decir que es el que se escribirá cuando sea ejecutado. ");
        double a;
        double b;
        a = 30.0;
        b = 10.5;
        a  = a+10.0/3 + (b-1/2.0);
        b = -b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void p10e(){
        System.out.println("Problema 10 Para cada uno de los programas que se dan a continuación, decir que es el que se escribirá cuando sea ejecutado. ");
        double a;
        double b;
        a = 30.0;
        b =10.5;
        a= a+10/3+(b-1/2);
        b = -b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void p10f(){
        System.out.println("Problema 10 Para cada uno de los programas que se dan a continuación, decir que es el que se escribirá cuando sea ejecutado. ");
        int e,f;
        e = -1 + 2*3/4%5;
        f = -(1+(2*(3/(4%5))));
        System.out.println(e);
        System.out.println(f);
    }

    public static void p10g(){
        System.out.println("Problema 10 Para cada uno de los programas que se dan a continuación, decir que es el que se escribirá cuando sea ejecutado. ");
        boolean m,n;
        m = true && false || true && !false;
        n = m && true && (false || true) && !(true || false);
        m  =!n || !m && !(m&& !n);
        n = true || m && !(false && n);
        System.out.println(m);
        System.out.println(n);
    }

    public static void p10h(){
        System.out.println("Problema 10 Para cada uno de los programas que se dan a continuación, decir que es el que se escribirá cuando sea ejecutado. ");
        int e;
        int f;
        e= -(12 +4/3*5);
        f = -(12+4/(3*5));
        e = e +10*4 - 3/2;
        f= (e+10)*(4-3)/2;
        System.out.println(e);
        System.out.println(f);
    }

    public static void p10i(){
        System.out.println("Problema 10 Para cada uno de los programas que se dan a continuación, decir que es el que se escribirá cuando sea ejecutado. ");
        boolean m,n;
        int a,b;
        a = 12+7/3;
        b = 13-7%3;
        m = a-b< b-a;
        n = a+2 >b-2;
        m = a+b != 25+4%3;
        System.out.println(m);
        System.out.println(n);
    }

    public static void p10j(){
        System.out.println("Problema 10 Para cada uno de los programas que se dan a continuación, decir que es el que se escribirá cuando sea ejecutado. ");
        char c ='a';
        int a = 12;
        boolean res;
        res = c!='c' && 'b'>=c;
        res = res == !true||a%5>= a%4;
        System.out.println(res);
    }

    public static void p10k(){
        System.out.println("Problema 10 Para cada uno de los programas que se dan a continuación, decir que es el que se escribirá cuando sea ejecutado. ");
        char cart, car2, car3;
        boolean bu;
        cart = 'b';
        car2= '3';
        car3= 'F';
        bu = (cart > car2) && (car3 != cart);
        bu = bu && !(car3 <= car2);
        System.out.println(bu);
    }

    public static void p11a() {
        System.out.println("Problema 11 Los  programas  que  se  dan  a  continuación  contienen  errores  que  el  compilador  es  capaz  de  detectar. Averigua de qué errores se tratan: ");
        int i;
        double d;
        char c;
        d = 12.0;
        i = 10+d;
        c = i;
        System.out.println(c);
    }

    public static void p11b(){
        System.out.println("Problema 11 Los  programas  que  se  dan  a  continuación  contienen  errores  que  el  compilador  es  capaz  de  detectar. Averigua de qué errores se tratan: ");
        char c;
        boolean b;
        c = 'a';
        c = c+1;
        b = !c > 'b';
        System.out.println(c);
        System.out.println(b);
    }

    public static void  p11c(){
        System.out.println("Problema 11 Los  programas  que  se  dan  a  continuación  contienen  errores  que  el  compilador  es  capaz  de  detectar. Averigua de qué errores se tratan: ");
        int i;
        char c;
        boolean b;
        c= 'a';
        b = !(c>'b');
        b =b && (i>20);
        System.out.println(b);
    }

    public static void p11d(){
        System.out.println("Problema 11 Los  programas  que  se  dan  a  continuación  contienen  errores  que  el  compilador  es  capaz  de  detectar. Averigua de qué errores se tratan: ");
        int primer, segon, tercer;
        Primer = 1;
        Segon = Primer +1;
        Tercer  =Primer + Segon;
        System.out.println(tercer);
    }

    public static void p11e(){
        System.out.println("Problema 11 Los  programas  que  se  dan  a  continuación  contienen  errores  que  el  compilador  es  capaz  de  detectar. Averigua de qué errores se tratan: ");
        Scanner reader = new Scanner(System.in);
        double num1, num2;
        int num3;
        num1 =  reader.nextDouble();
        num2 = reader.nextDouble();
        num3 = reader.nextDouble();
        num1 = num1+num2+1.0;
        num3 = num3+12;
        System.out.println(num1);
        System.out.println(num3);
    }

    public static void p12() {
        System.out.println("Problema 12 Cuando el programa sea ejecutado, ¿cuáles serán los valores finales de las variables i1, i2, d1, d2, b1 y b2? (¿que escribirá el programa?) ");
        int i1,i2;
        double d1,d2;
        char c1, c2;
        boolean b1, b2;
        i1 = 1-2 +23 / 4%3*3;
        i2 = 2*7%5/8+1*3;
        d1 = 3.0+2.5+5.0/2.0;
        d2 = i1/2+i2+2.0+1;
        c1 = 'A';
        c2 = 'Z';
        b1= c1 == c2 || c1 >'T' && c2 <= 'K';
        b2 = false || true && false != false && true;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(b1);
        System.out.println(b2);
    }

    public static void p13() {
        System.out.println("Problema 13 Cuando el programa siguiente sea ejecutado, ¿cuáles serán los valores finales de las variables prEnt, sgEnt, prDoub, sgDoub, prBoo y sgBoo? (¿qué escribirá el programa?)  ");
        int prEnt, sgEnt;
        double prDoub, sgDoub;
        boolean prBool, sgBool;
        char ch;
        prEnt = 17;
        sgEnt = prEnt%9/3;
        prEnt = sgEnt + sgEnt * prEnt/3;
        prDoub = 24 /6*2+1;
        sgDoub=(prDoub-1.0)/16;
        ch = 'A';
        prBool= ch !='A'== ch <'Z';
        sgBool= (prBool && true) || (prBool==true || !prBool);
        System.out.println(prEnt);
        System.out.println(sgEnt);
        System.out.println(prDoub);
        System.out.println(sgDoub);
        System.out.println(prBool);
        System.out.println(sgBool);
    }

    public static void p14() {
        System.out.println("¿Cuáles serán los valores de las variables i, j, d, b1 y b2 al final de la ejecución del anterior programa? (¿qué escribirá el programa al ser ejecutado?) ");
        int i,j;
        char c;
        double d;
        boolean b1, b2;
        i = 10+3/2;
        j =  i%2*4;
        c='a';
        d=10.0/j-1;
        b1 = c<'c' && i<j !=true;
        b2= !b1 || false || !true || b1==false;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("d="+d);
        System.out.println("b1="+b1);
        System.out.println("b2="+b2);
    }
}


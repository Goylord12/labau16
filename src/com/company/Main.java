package com.company;

public class Main {

    // Создать первый класс вычисляющий значение выражения a * b^c.
    //Создать второй класс с аналогичной структурой, что и у первого.
    //Создать объект первого класса.
    //Переконвертировать объект первого класса в объект второго класса.
    //Через переконвертированный объект получить значение выражения.

    public static void main(String[] args) {

        Convert<fist> hz;
        hz = (s)->System.out.println(new sting(s.a,s.b,s.c).call());
        fist c = new fist(5,2,5);
        hz.conv(c);
    }
}
class fist{
    double a;
    double b;
    double c;

    fist(double a, double b, double c){
        this.a=a;
        this.b =b;
        this.c = c;
    }

    double call(){
        return a*Math.pow(b,c);
    }
}
class sting{
    double a;
    double b;
    double c;

    sting(double a, double b, double c){
        this.a=a;
        this.b =b;
        this.c = c;
    }

    double call(){
        return a*Math.pow(b,c);
    }
}
interface Convert<T>{
    void conv(T s);
}



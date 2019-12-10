package written_examination;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class test {


    public static void main1(String[] args) {
        double a = 1.2789;
        float b = 1;
        a = a-b;
        System.out.printf(String.valueOf(a));
    }

    public static void main3(String[] args) {
        int a = 'a';
        char b = 97;
        if(a==b){
            System.out.println(a);
        }
//        System.out.printf(a==b);
    }
    public static void main2(String[] args) {
        Integer a = 128;
        Integer b = 128;
        if(a==b){
            System.out.printf("1");
        }else{
            System.out.printf("2");
        }
        //编译出错 System.out.printf(a==b);

    }

    public static void main7(String[] args) {
        A a = new A();
        B b = (B)a;
        if(a instanceof A ){
            System.out.printf("111");
        }
        //可以强转，就是继承或者实现关系   原对象不变，改变的是引用类型，所以a还是A类的对象
    }
    static interface B {

    }
    static class A implements B {

    }

    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(5);
        AtomicInteger b = new AtomicInteger(6);;
        change(a,b);
        System.out.println("a="+a+",b="+b);

        Map m = new HashMap();

    }
    //基本类型是  值传递  不会对本身的值有任何影响
    public static void change(AtomicInteger a,AtomicInteger b) {
        AtomicInteger c =a;
        a = b;
        b = c;
    }
    //用Get方法访问Post 返回的是405  反过来也是405

    public static class Person{
        public Person(){
            System.out.println("Person Birth");
        }

        public void run(){
            System.out.println("Person Run");
        }
    }
    public static class Man extends Person{
        public Man(){
            System.out.println("Man birth");
        }
        @Override
        public void run(){
            System.out.println("Man Run");
        }
    }

    public static void main6(String[] args) {
        Person person1 = new Person();
        Person person2 = new Man();
        Man man = new Man();
        person1.run();
        person2.run();
        man.run();
        //子类构造方法会默认调用父类的无参构造方法
    }

}




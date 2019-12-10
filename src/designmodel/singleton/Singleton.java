package designmodel.singleton;

import java.util.HashMap;
import java.util.Map;

public class Singleton {

    private static Singleton s ;

    private Singleton(){}

    public static  Singleton getSingleton(){
        if(s==null){
            synchronized (Singleton.class){
                if(s==null)
                    s = new Singleton();
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        Map mapapppp = new HashMap<>();
        System.out.println(s1==s2);
    }
}

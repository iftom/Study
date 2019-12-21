package designmodel.factory.simplefactory;

import com.sun.deploy.util.StringUtils;
import designmodel.factory.product.Apple;
import designmodel.factory.product.Imac;
import designmodel.factory.product.Iphone;
import designmodel.factory.product.Iwatch;

/**
 * Created By WangXiaoYu Tom
 * 2019/12/11
 * All Rights Reversed
 *
 * 简单工厂模式：
 *    对一个确定的输入参数，可以返回一个确定对象。
 *    简单工厂模式不属于GOF的23中设计模式之一。
 *    不符合开闭原则，如果要加了一种产品比如叫Iearphone,就得修改Factory的代码。
 *    适合情况简单，但是需要创建的对象多，而且这些对象相对固定不会增加的情况。
 *    如要要求一个工厂模式符合开闭原则，则要使用工厂方法模式，具体见factorymethod包下的代码。
 */
public class Factory {


    /**
     * 工厂接受的参数可以是String，也可以是完整的类名，也可以是class
     */
    public static Apple getAppleProduct(String productName) {
        if ("Iphone".equals(productName)) {
            return new Iphone();
        }
        if ("Imac".equals(productName)) {
            return new Imac();
        }
        if ("Iwatch".equals(productName)) {
            return new Iwatch();
        }
        System.out.println("21");
        return null;
    }

    public static Apple getAppleProductByClassName(String className) {
        try {
            if (null != className && !"".equals(className)) {
                return (Apple) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static Apple getAppleProduct(Class clazz) {

        try {
           if(null!=clazz){
               return (Apple)clazz.newInstance();
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

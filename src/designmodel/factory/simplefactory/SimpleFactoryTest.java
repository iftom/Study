package designmodel.factory.simplefactory;

import designmodel.factory.product.Iphone;

/**
 * Created By WangXiaoYu Tom
 * 2019/12/11
 * All Rights Reversed
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Iphone iphone = (Iphone)Factory.getAppleProduct("Iphone");
        iphone.sayName();
        Iphone iphone2 = (Iphone)Factory.getAppleProductByClassName("designmodel.factory.product.Iphone");
        iphone2.sayName();
        Iphone iphone3 = (Iphone)Factory.getAppleProduct(Iphone.class);
        iphone3.sayName();
        System.out.println();
    }
}

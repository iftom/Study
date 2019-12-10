package data_struct;

import javax.swing.JOptionPane;

/**
 * Created by wangxy on 2017/3/2.
 */
public class test {





    public static void reverseString (String str){
        StringBuffer stringBuffer = new StringBuffer (str);

        System.out.print(stringBuffer.reverse());
    }
      public static void main(String[] args) {
        String srcStr1 = "我ABC";
        String srcStr2 = "我ABC汉DEF";

        splitString(srcStr1, 4);
        splitString(srcStr2, 6);
    }

    public static void splitString(String src, int len) {
        int byteNum = 0;

        if (null == src) {
            System.out.println("The source String is null!");
            return;
        }

        byteNum = src.length();
        byte bt[] = src.getBytes(); // 将String转换成byte字节数组

        if (len > byteNum) {
            len = byteNum;
        }

        // 判断是否出现了截半，截半的话字节对于的ASC码是小于0的值
        if (bt[len] < 0) {
            String subStrx = new String(bt, 0, --len);
            System.out.println("subStrx==" + subStrx);
        } else {
            String subStrx = new String(bt, 0, len);
            System.out.println("subStrx==" + subStrx);
        }
    }

    public static void main2 (String args[]){
            String originalString;
            originalString = JOptionPane.showInputDialog("Please input a String: ");

            reverseString (originalString);
        }

}
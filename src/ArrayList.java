
/**
 * Created by wangxy on 2017/2/24.
 */
public class ArrayList {

    private Object[] number = new Object[10];

    public ArrayList(Object[] number) {
        this.number = number;
    }
    public ArrayList() {

    }

    public void add(Object o){
        this.number = getNewNumberAfterAdd(o);
    }

    /**
     * 在ArrayList的最后添加一个元素
     */
    private Object[] getNewNumberAfterAdd(Object o ){
        Object[] numberNew = new Object[number.length+1];
        for(int i=0;i<numberNew.length;i++){
            if(i<numberNew.length-1){
                numberNew[i] = number[i];
            }else{
                numberNew[i] = o;
            }
        }
        return numberNew;
    }

    /**
     * 在index位置插入元素
     * @param index
     * @param o
     */
    public void add(int index,Object o){
        //如果index等于数组长度，直接调用add(Object o)
        if(index==number.length){
            this.add(o);
            return;
        }
        Object[] numberNewOne = this.getPartOfNumber(number,0,index);
        Object[] numberNewTwo = this.getPartOfNumber(number,index,number.length-1);
        numberNewOne[index] = o;
        this.number = this.combineToNumber(numberNewOne,numberNewTwo);
    }

    /**
     * 根据index范围得到一个数组的一部分(头尾都包含)
     */
    private Object[] getPartOfNumber(Object[] number,int startIndex,int endIndex){
        if(startIndex>endIndex){
            throw new RuntimeException();
        }
        Object[] result = new Object[endIndex-startIndex+1];
        for(int i=0;i<result.length;i++){
            result[i] = number[startIndex+i];
        }
        return result;
    }

    /**
     * 将两个数组合并
     */
    public  Object[] combineToNumber(Object[] numberFirst,Object[] numberSecond){
        Object[] result = new Object[numberFirst.length+numberSecond.length];
        for(int i=0;i<numberFirst.length;i++){
            result[i] = numberFirst[i];
        }
        for(int i=0;i<numberSecond.length;i++){
            result[numberFirst.length+i] = numberSecond[i];
        }
        return result;
    }

    /**
     * 得到index位置的元素
     */
    public Object get(int index){
        return number[index];
    }

    /**
     * 移除index位置的元素
     */
    public Object remove(int index){
        if(index>=number.length||index<0){
            throw new IndexOutOfBoundsException();
        }
        Object removedObeject = this.number[index];
        Object[] numberNewOne = this.getPartOfNumber(number,0,index-1);
        Object[] numberNewTwo = this.getPartOfNumber(number,index+1,number.length-1);
        this.number = this.combineToNumber(numberNewOne,numberNewTwo);

        return removedObeject;
    }

    /**
     * 得到Arraylist的大小
     * @return
     */
    public int size(){
        return number.length;
    }

    public static void main(String[] args) {
        Object[] my = new Object[]{"10","20"};
        ArrayList a = new ArrayList(my);
        a.add("30");
        a.add(1,"100");
        a.remove(2);
        for(int i=0;i<a.size();i++){
            System.out.printf(String.valueOf(a.get(i))+"\n");
        }
    }

}

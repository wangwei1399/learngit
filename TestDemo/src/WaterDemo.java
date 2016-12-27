/**
 * Created by cherry on 2016/12/27.
 */

abstract class Water{
    public abstract void water();
}

interface Filter{

    void filter();
}

interface Buffer{

    void buffer();
}

interface Heating{

    void heating();
}

interface Sugar{

    void sugar();
}

class Water1 extends Water implements Buffer,Filter{

     public void water(){
        System.out.println("从湖中取出水");
     }
    public void buffer(){
        System.out.println("------缓冲------");
}
    public void filter(){
        System.out.println("------过滤-----");
    }
}



public class WaterDemo {

    public static void main(String[] args){

        Water1 water1=new Water1();
        water1.water();
        water1.buffer();
        water1.filter();
    }
}

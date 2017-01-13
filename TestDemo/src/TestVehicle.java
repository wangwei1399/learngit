/**
 * Created by cherry on 2016/12/27.
 */




public class TestVehicle {
    int speed;
    double size;
    public void move(){

    }
    public void setSpeed(int speed){

        System.out.println("现在的速度："+speed);

    }
    public void speedUp(){
        TestVehicle v=new TestVehicle();
        v.setSpeed(100);

    }
    public void speedDown(){
        TestVehicle v=new TestVehicle();
        v.setSpeed(50);

    }
    public static void main(String[] args){

        TestVehicle testVehicle=new TestVehicle();
        testVehicle.speed=60;
        testVehicle.size=98.7;
        System.out.println("初始速度是"+testVehicle.speed+"\n"+"车的体积是："+testVehicle.size);
        testVehicle.speedUp();
        testVehicle.speedDown();

    }
}

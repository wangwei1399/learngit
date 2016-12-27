/**
 * Created by cherry on 2016/12/23.
 */

interface Door{
    void open();
    void close();
    void alarm();
}

class Alarm implements Door{
    @Override
    public void alarm() {
        System.out.println("111");
    }

    @Override
    public void close() {
        System.out.println("222");
    }

    @Override
    public void open() {
        System.out.println("333");
    }
}



 interface Runner{

    void start();
    void  stop();
     void  run();
}

interface Eater extends Runner{

    void OpenMouth();
    void UpandDown();
    void GoIn();
}

 class people implements Eater {

     public void start() {
         System.out.println("-----start-----");

     }

     public void stop() {
         System.out.println("-----stop-----");
     }

     public void run() {
         System.out.println("-----run-----");
     }

     public void OpenMouth() {
         System.out.println("-----OpenMouth-----");

     }

     public void UpandDown() {
         System.out.println("-----UpandDown-----");

     }

     public void GoIn() {
         System.out.println("-----GoIn-----");

     }
 }
     public class TestInterface {

         public static void main(String[] args) {

             people TT = new people();
             TT.run();
             TT.OpenMouth();

             Alarm alarm=new Alarm();
             alarm.open();
             alarm.close();
             alarm.alarm();
         }
     }

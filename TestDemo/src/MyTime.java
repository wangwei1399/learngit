/**
 * Created by cherry on 2016/12/28.
 */
public class MyTime {

    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour,int minute,int second){

        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void display(){

        System.out.println("hour:"+this.hour+" minute:"+this.minute+" second:"+this.second);
    }

    public void addSecond(int sec){

     this.second=sec+this.second;

    }

    public void addMinute(int min){

    this.minute=min+this.minute;
    }

   public void addHour(int hou){

    this.hour=hou+this.hour;
    }

    public void subSecond(int sec){


    }

    public void subMinute(int min){


    }

    void subHour(int hou){

    }

    public static void main(String[] args){

        MyTime myTime=new MyTime(12,30,30);
        myTime.display();
        myTime.addHour(2);
        myTime.display();
    }

}

/**
 * Created by cherry on 2016/12/26.
 */

interface Geometry{

    public double getArea();
}

class pillar{
    Geometry bottom ;
    double high;

    public pillar(Geometry bottom,double high){
        this.bottom =bottom ;
        this.high=high;
    }

    public double Volume(){
        return bottom.getArea()*this.high;
    }

}
class Circle implements Geometry{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea() {


        return Math.PI*this.radius*this.radius;
    }
}
public class Testpillar {
    public static void main(String[] args){
       Geometry bottom;
        bottom=new Circle(2);

        pillar p=new pillar(bottom,2);

        System.out.println("圆柱体体积："+p.Volume());
    }
}

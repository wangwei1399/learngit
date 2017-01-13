/**
 * Created by cherry on 2016/12/29.
 */

public class Number {

    private int n1;
    private int n2;

    public Number(int n1,int n2){

        this.n1=n1;
        this.n2=n2;
    }

    public void addition(){



        System.out.println(this.n1+this.n2);
    }

    public void subtration(){


        System.out.println(this.n1-this.n2);
    }

    public static void main(String[] args){

        Number number=new Number(20,10);
        number.addition();
        number.subtration();
    }
}

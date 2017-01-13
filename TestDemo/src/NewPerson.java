/**
 * Created by cherry on 2017/1/12.
 */
public class NewPerson {

    private String name;
    private String age;

    public NewPerson(String name, String age){

        this.name=name;
        this.age=age;

    }

    public void display(){

        System.out.println("name:"+name+" age:"+age);
    }

    public static void main(String[] args){

        NewPerson person1=new NewPerson("lily","11");

        person1.display();
    }
}

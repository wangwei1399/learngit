/**
 * Created by cherry on 2016/12/26.
 */
 abstract class Animal {
    public abstract void cry();

}

class Cat extends Animal{

    public void cry(){
        System.out.println("猫叫-----喵喵");
    }

}

class Dog extends Animal{

    public void cry(){
        System.out.println("狗叫-----汪汪");
    }
}
public class TestAbstract {

    public static void main(String[] args){

        Cat cat=new Cat();
        cat.cry();
        Dog dog=new Dog();
        dog.cry();
    }
}

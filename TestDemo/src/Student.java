/**
 * Created by cherry on 2016/12/26.
 */
interface Person{
    public void setData(String name,String sex,String birthday);
    public String getData();
}
class Test implements Person {
    String name;
    String sex;
    String birthday;
    String Id;
    String speciality;
    public void setData(String name,String sex,String birthday){
        this.name=name;
        this.sex=sex;
        this.birthday=birthday;
        }
        public String getData(){
            System.out.println( "名字"+name+"\n"+"性别"+sex+"\n"+"生日"+birthday+"\n"+"id"+Id+"专长"+speciality);
            return "名字"+name+"\n"+"性别"+sex+"生日"+birthday+"id"+Id+"专长"+speciality;
        }
}
public class Student{
    public static void main(String[] args){
        Test test=new Test();
        test.setData("lily","女","19900205");
        test.getData();
    }
}
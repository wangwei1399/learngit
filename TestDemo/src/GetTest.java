/**
 * Created by cherry on 2017/1/12.
 */
public class GetTest {

    private String name;

    public GetTest(String name){
        this.name=name;
    }
    public void SetName(String name){

        this.name=name;
    }

    public String GetName(){
        return this.name;
    }

    public static void main(String[] args){

        GetTest getTest=new GetTest("YangYun");

        getTest.SetName("HaHa");
        getTest.GetName();
        System.out.println("name"+getTest.GetName());

    }
}

/**
 * Created by cherry on 2017/1/12.
 */
public class GetTest {

    private String name;

    public GetTest(String name){
        this.name=name;
    }
    public void SetName(String name){

        this.name=name;
    }

    public String GetName(){
        return this.name;
    }

    public static void main(String[] args){

        GetTest getTest=new GetTest("YangYun");

        getTest.SetName("HaHa");
        getTest.GetName();
        System.out.println("name"+getTest.GetName());
        System.out.println("hello");
    }
}


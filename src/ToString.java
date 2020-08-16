/**
 * Created by huawei on 2020/8/2.
 */
public class ToString {
    public static void main(String[] args){
        Person p = new Person();
        p.setAge(88);
        p.setName("zhouzhozuzh");
        System.out.print(p.toString());
    }


}
class Person{
    public Person() {

    }
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    private String name ;
    private Integer age ;

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge( Integer age ) {
        this.age = age;
    }


    public String toString(){
        return "name:"+this.name+",Age:"+this.age;
    }
}

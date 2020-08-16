
/**
 * Created by huawei on 2020/8/2.
 * 继承或者实现【二选一】
 方法的重写【意义体现：不重写，无意义】
 子类对父类中某些方法进行重新定义，在调用这些方法时就会调用子类的方法。
 父类引用指向子类对象（也可以说向上转型）【体现在格式上】

 当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误 ,如果有，执行的是子类重写后的方法，
 也就是向上转型时， 子类单独定义的方法丢失问题。(Matcher m=new HappyMother(); 子类独有的方法丢失，不能使用，编译会报错 )
 */
public class DuoTai {
    public static void main(String[] args){
//        Ye y = new Ye();
//        Ye y2 = new Fu(); //向上
//        Fu f = new Fu();
//        Zi z = new Zi();
//        Sun s = new Sun();
//        System.out.println("第一题 " + y.show(f));
//        System.out.println("第二题 " + y.show(z));
//        System.out.println("第三题 " + y.show(s));
//        System.out.println("第四题 " + y2.show(f));  //到这里挂了？？？
//        System.out.println("第五题 " + y2.show(z));
//        System.out.println("第六题 " + y2.show(s));
//        System.out.println("第七题 " + f.show(f));
//        System.out.println("第八题 " + f.show(z));
//        System.out.println("第九题 " + f.show(s));

        Matcher m = new XiongHaiZi();//向上转型

        XiongHaiZi x = (XiongHaiZi)m;//向下转型

        x.eatSuLi();//执行子类特有方法
    }
}
class Ye{
    public String show(Sun obj) {
        return ("Ye and Sun");
    }

    public String show(Ye obj) {
        return ("Ye and Ye");
    }
}
//爸爸类
class Fu extends Ye {
    public String show(Fu obj) {
        return ("Fu and Fu");
    }

    public String show(Ye obj) {
        return ("Fu and Ye");
    }
}
//儿子类
class Zi extends Fu {

}
//孙子类
class Sun extends Fu {

}
////////////////
class  Matcher{
    public void eat(){
        System.out.println("想吃烤山药？");
    }
}

class XiongHaiZi extends Matcher {
    public void eat(){
        System.out.println("妈妈，我想吃烤山药");
    }

    public void eatSuLi(){//============================子类特有的eatSuLi方法
        System.out.println("麻麻，我想吃酥梨，要吃麻瓜那么大的酥梨");
    }
}


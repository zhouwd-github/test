import sun.applet.Main;

import java.io.*;

/**
 * Created by huawei on 2020/8/5.
 */
class UserInfo implements Serializable{
    private String name ;
    private final transient String password;
    public UserInfo (String name ,String passwor){
        this.name=name;
        this.password=passwor;
    }

    public String toString(){
        return "UserInfo{"
                +"name='"+this.name
                +"',password='"+this.password
                +"'}";
    }
}
public class TransientDemo {
    public static void main(String[] args){
        UserInfo userInfo = new UserInfo("周五","zhioahd");
        System.out.println("序列化之前："+userInfo);
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("userInfo.txt"));
            outputStream.writeObject(new UserInfo("周五","zhioahd"));
//            System.out.println("序列化："+userInfo.toString());
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream input=new ObjectInputStream(new FileInputStream("userinfo.txt"));//第三步开始反序列化操作
            Object o = input.readObject();//ObjectInputStream的readObject方法会抛出ClassNotFoundException
            System.out.println("序列化之后信息："+o);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

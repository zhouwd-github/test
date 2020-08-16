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
        UserInfo userInfo = new UserInfo("����","zhioahd");
        System.out.println("���л�֮ǰ��"+userInfo);
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("userInfo.txt"));
            outputStream.writeObject(new UserInfo("����","zhioahd"));
//            System.out.println("���л���"+userInfo.toString());
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream input=new ObjectInputStream(new FileInputStream("userinfo.txt"));//��������ʼ�����л�����
            Object o = input.readObject();//ObjectInputStream��readObject�������׳�ClassNotFoundException
            System.out.println("���л�֮����Ϣ��"+o);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

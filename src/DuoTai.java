
/**
 * Created by huawei on 2020/8/2.
 * �̳л���ʵ�֡���ѡһ��
 ��������д���������֣�����д�������塿
 ����Ը�����ĳЩ�����������¶��壬�ڵ�����Щ����ʱ�ͻ��������ķ�����
 ��������ָ���������Ҳ����˵����ת�ͣ��������ڸ�ʽ�ϡ�

 ��ʹ�ö�̬��ʽ���÷���ʱ�����ȼ�鸸�����Ƿ��и÷��������û�У��������� ,����У�ִ�е���������д��ķ�����
 Ҳ��������ת��ʱ�� ���൥������ķ�����ʧ���⡣(Matcher m=new HappyMother(); ������еķ�����ʧ������ʹ�ã�����ᱨ�� )
 */
public class DuoTai {
    public static void main(String[] args){
//        Ye y = new Ye();
//        Ye y2 = new Fu(); //����
//        Fu f = new Fu();
//        Zi z = new Zi();
//        Sun s = new Sun();
//        System.out.println("��һ�� " + y.show(f));
//        System.out.println("�ڶ��� " + y.show(z));
//        System.out.println("������ " + y.show(s));
//        System.out.println("������ " + y2.show(f));  //��������ˣ�����
//        System.out.println("������ " + y2.show(z));
//        System.out.println("������ " + y2.show(s));
//        System.out.println("������ " + f.show(f));
//        System.out.println("�ڰ��� " + f.show(z));
//        System.out.println("�ھ��� " + f.show(s));

        Matcher m = new XiongHaiZi();//����ת��

        XiongHaiZi x = (XiongHaiZi)m;//����ת��

        x.eatSuLi();//ִ���������з���
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
//�ְ���
class Fu extends Ye {
    public String show(Fu obj) {
        return ("Fu and Fu");
    }

    public String show(Ye obj) {
        return ("Fu and Ye");
    }
}
//������
class Zi extends Fu {

}
//������
class Sun extends Fu {

}
////////////////
class  Matcher{
    public void eat(){
        System.out.println("��Կ�ɽҩ��");
    }
}

class XiongHaiZi extends Matcher {
    public void eat(){
        System.out.println("���裬����Կ�ɽҩ");
    }

    public void eatSuLi(){//============================�������е�eatSuLi����
        System.out.println("���飬��������棬Ҫ�������ô�������");
    }
}


import java.io.*;

/**
 * Created by huawei on 2020/8/6.
 */
public class FileOutPutStreamDemo {
    public static void main( String[] args )  {
        File file = new File("C:\\Users\\huawei\\Desktop\\�����������.txt");
//        try {
//            FileOutputStream fo = new FileOutputStream(file);
//            fo.write(97);
//            byte[] b = "chikaorou".getBytes();
//            fo.write(b);
//// д��������2��ʼ��2���ֽڡ�����2��c�������ֽڣ�Ҳ����cd��
//            fo.write(b,2,2);
//            fo.close();
//        }catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileInputStream fileIntputStream = new FileInputStream(file);
            int abc;
//            while ((abc = fileIntputStream.read()) !=-1){
//                System.out.println((char)abc);
//
//            }
            // �����ֽ����飬��Ϊװ�ֽ����ݵ�����
            byte[] b = new byte[1024];
            while ((abc = fileIntputStream.read(b)) !=-1){
                // ÿ�ζ�ȡ��,���������Ч�ֽڲ��֣�����ַ�����ӡ ,abc ÿ�ζ�ȡ����Ч�ֽڸ���
                System.out.println("�����ֽ�����:"+new String(b,0,abc));
            }
            fileIntputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        ͼƬ��ȡ��д��
        try {
            FileInputStream fileIntputStream = new FileInputStream("C:\\Users\\huawei\\Desktop\\΢��ͼƬ_20200803090751.jpg");
            FileOutputStream FileOutputStream = new FileOutputStream("20200803090751.jpg");
            int abc;
//            while ((abc = fileIntputStream.read()) !=-1){
//                System.out.println((char)abc);
//
//            }
            // �����ֽ����飬��Ϊװ�ֽ����ݵ�����
            byte[] b = new byte[1024];
            while ((abc = fileIntputStream.read(b)) !=-1){
                // ÿ�ζ�ȡ��,���������Ч�ֽڲ��֣�����ַ�����ӡ ,abc ÿ�ζ�ȡ����Ч�ֽڸ���
                FileOutputStream.write(b,0,abc);
//                System.out.println("�����ֽ�����:"+new String(b,0,abc));
            }
            FileOutputStream.close();
            fileIntputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

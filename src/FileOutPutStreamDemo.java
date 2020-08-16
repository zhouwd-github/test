import java.io.*;

/**
 * Created by huawei on 2020/8/6.
 */
public class FileOutPutStreamDemo {
    public static void main( String[] args )  {
        File file = new File("C:\\Users\\huawei\\Desktop\\宽带到期提醒.txt");
//        try {
//            FileOutputStream fo = new FileOutputStream(file);
//            fo.write(97);
//            byte[] b = "chikaorou".getBytes();
//            fo.write(b);
//// 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
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
            // 定义字节数组，作为装字节数据的容器
            byte[] b = new byte[1024];
            while ((abc = fileIntputStream.read(b)) !=-1){
                // 每次读取后,把数组的有效字节部分，变成字符串打印 ,abc 每次读取的有效字节个数
                System.out.println("定义字节数组:"+new String(b,0,abc));
            }
            fileIntputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        图片读取并写入
        try {
            FileInputStream fileIntputStream = new FileInputStream("C:\\Users\\huawei\\Desktop\\微信图片_20200803090751.jpg");
            FileOutputStream FileOutputStream = new FileOutputStream("20200803090751.jpg");
            int abc;
//            while ((abc = fileIntputStream.read()) !=-1){
//                System.out.println((char)abc);
//
//            }
            // 定义字节数组，作为装字节数据的容器
            byte[] b = new byte[1024];
            while ((abc = fileIntputStream.read(b)) !=-1){
                // 每次读取后,把数组的有效字节部分，变成字符串打印 ,abc 每次读取的有效字节个数
                FileOutputStream.write(b,0,abc);
//                System.out.println("定义字节数组:"+new String(b,0,abc));
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

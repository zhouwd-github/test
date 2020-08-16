import java.awt.*;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by huawei on 2019/9/6.
 */
public class zhengze  {
    public static void main(String[] args) {
//        for(int i=0;i<=9;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(i+"*"+j +" = "+i*j +"\t");
//            }
//            System.out.println();
//        }

        try{
            //BufferedWriter 只是对文件写入，前提需要有个文件存在
//            BufferedWriter out =new BufferedWriter(new FileWriter("C:\\Users\\huawei\\Desktop\\halloWord.txt"));
//            out.write("你好，我的世界");
//            out.close();

//            System.out.println("文件创建成功！");
            //文件读取
//            BufferedReader reader = new BufferedReader( new FileReader("C:\\Users\\huawei\\Desktop\\halloWord.txt"));
//            String str="";
//            while ((str = reader.readLine())!=null){
//                System.out.println(str);
//            }
            //文件删除
//            File file =new File("halloWord.txt");
//            if(file.delete()){
//                System.out.println(file.getName() + " 文件已被删除！");
//            }else{
//                System.out.println("文件删除失败！");
//            }
            //文件复制
            BufferedWriter writer =new BufferedWriter(new FileWriter("tt.cvs"));
            writer.write("我在copy文件内容");
            writer.close();
            InputStream in =new FileInputStream(new File("tt.cvs"));
            OutputStream out =new FileOutputStream(new File("cptt.cvs"));
            byte[] b=new byte[1024];
            int len;
            while ((len = in.read(b))>0){

                out.write(b,0,len);
            };
            in.close();
            out.close();

            BufferedReader in1 = new BufferedReader(new FileReader("cptt.cvs"));
            String str;
            while ((str = in1.readLine()) != null) {
                System.out.println(str);
            }
            in1.close();

        }catch (Exception e){
                System.out.print(e.getMessage());
        }

    }

    public static void print(int size) {
        if (size % 2 == 0) {
            size++; // 计算菱形大小
            System.out.println("菱形大小:"+size);
        }
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size / 2 + 1; j > i + 1; j--) {
                System.out.print(" "); // 输出左上角位置的空白
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // 输出菱形上半部边缘
            }
            System.out.println(); // 换行
        }
        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                System.out.print(" "); // 输出菱形左下角空白
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                System.out.print("*"); // 输出菱形下半部边缘
            }
            System.out.println(); // 换行
        }
    }
}

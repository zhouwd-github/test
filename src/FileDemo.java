import java.io.File;
import java.io.IOException;

/**
 * Created by huawei on 2020/8/5.
 */
public class FileDemo {
    public static void main( String[] args ) throws IOException {
        File file = new File("C:\\Users\\huawei\\Desktop","SHUCRM2C-DB-20200709.txt");

        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());
        File file1 = new File("src\\love.java");
        System.out.println(file1.exists());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getName());
        System.out.println(file1.length());
//        文件创建
        File f2 = new File("C:\\Users\\huawei\\Desktop\\20200805.txt");
        System.out.println(f2.exists());
        System.out.println(f2.createNewFile());
        System.out.println(f2.createNewFile());
        System.out.println(f2.exists());

        //        目录创建
        File f3 = new File("C:\\Users\\huawei\\Desktop\\20200805\\2020");
        System.out.println("f3:"+f3.exists());
        System.out.println(f3.mkdirs());
        System.out.println(f3.mkdir());
        System.out.println(f3.exists());
//        遍历文件
        File f4s = new File("C:\\Users\\huawei\\Desktop\\20200805");

        String[] names =f4s.list();
        for(String name :names){
            System.out.println("---"+name);
        }
        File[] files = f4s.listFiles();
        for(File f5 : files){
            System.out.println(f5);
            if(f5.isDirectory()){
//                Recursion(f5);
            }

        }


    }
}

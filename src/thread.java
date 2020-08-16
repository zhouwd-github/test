/**
 * Created by huawei on 2019/9/11.
 */
class Thread1 extends  Thread{

    private String threadNmae ;
    public Thread1 (String threadNmae){
        this.threadNmae =threadNmae;
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(threadNmae +"运行："+i);
            try{
                sleep((int)Math.random()*10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
public class thread {

    public static void main(String[] args) {

//        Thread1 t1 =new Thread1("A");
//        Thread1 t2 =new Thread1("B");
//        t1.start();
//        t2.start();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i < 5; i++){
                    System.out.println("熊孩子+"+i);
                }
            }
        };
        r.run();
//        new Thread(r).start();
//        for (int i = 0; i < 5 ; i++){
//            System.out.println("傻狍子:"+i);
//        }
    }
}



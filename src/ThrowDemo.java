/**
 * Created by huawei on 2020/8/2.
 */
public class ThrowDemo {
    public static void main(String[] args) throws Exception {
        //����һ������
        int[] arr = {2,4,52,2};
        //���������Ҷ�Ӧ��Ԫ��
        int index = 4;
        int element = getElement(arr, index);

        System.out.println(element);
        System.out.println("over");
    }
    /*
     * ���� �����ҵ������ж�Ӧ��Ԫ��
     */
    public static int getElement(int[] arr,int index) throws Exception {
        //�ж�  �����Ƿ�Խ��
        if(index<0 || index>arr.length-1){
             /*
             �ж�����������㣬��ִ����throw�׳��쳣����󣬷����Ѿ��޷��������㡣
             ��ʱ�ͻ������ǰ������ִ�У������쳣��֪�������ߡ���ʱ����Ҫͨ���쳣�������
              */
            throw new Exception("���ǣ��Ǳ�Խ����~~~");
        }
        int element = arr[index];
        return element;
    }
}

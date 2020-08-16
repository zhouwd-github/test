import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by huawei on 2020/8/4.
 */
public class DeclareMethod {
    private String test(int num){
        return "Êä³öÖµ£º"+num;
    }
    public static void main(String [] args) throws ClassNotFoundException, NoSuchMethodException {
        try {
            Class clazz = Class.forName("DeclareMethod");
            Method method = clazz.getDeclaredMethod("test", int.class);
            System.out.println(method.toGenericString());
            Object object = method.invoke(clazz.newInstance(),2);
            System.out.println(object);
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}


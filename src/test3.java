import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zhangkeluo on 2019/3/4.
 */
public class test3 {
    public static void main(String[] args){
        try {
            Class c = Person.class;
            System.out.println(c.getName());
            Method[] methods = c.getDeclaredMethods();
            for (Method method:methods){
                System.out.println(method);
            }
//            //直接创建对象，设置值所需的时间
//            long start1 = System.currentTimeMillis();
//            for (int i = 0; i < 100000; i++) {
//                Person p1 = new Person();
//                p1.setName("zhangkeluo1");
//                System.out.println(p1.getName());
//            }
//            long end1 = System.currentTimeMillis();
//
//            //使用反射，创建对象，设置值
//            long start2 = System.currentTimeMillis();
//            for (int i = 0; i < 100000; i++){
//                Person person =(Person) c.newInstance();
//                System.out.println(person.getName());
//                Method method = c.getMethod("setName",String.class);
//                method.invoke(person,"zhangkeluo");
//                System.out.println(person.getName());
//            }
//            long end2 = System.currentTimeMillis();
//            System.out.println("直接创建对象，设置值所需的时间：" + (end1 - start1));
//            System.out.println("使用反射，创建对象，设置值所需的时间：" + (end2 - start2));

            Field[] fields = c.getDeclaredFields();
            for (Field field : fields) {
                System.out.printf("Field：%s \n",field.getName());
                System.out.printf("Type：\n  %s\n", field.getType().getCanonicalName());
                System.out.printf("GenericType:\n  %s\n", field.getGenericType().toString());
                System.out.println(Modifier.toString(field.getModifiers()));
                System.out.printf("\n\n");
            }
            System.out.print(c.getConstructors());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

import com.kuang.pojo.User;
import com.kuang.pojo.UserT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User) context.getBean("user");
        user.show();

        // 测试别名
        User useralias = (User) context.getBean("asdfdsfdsf");
        useralias.show();


        System.out.println("==============================================");

        UserT user2 = (UserT) context.getBean("user2");
        user2.show();

        System.out.println("==============================================");

        UserT user3 = (UserT) context.getBean("u2");
        user3.show();
    }
}
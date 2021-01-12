import com.kuang.pojo.User;
import com.kuang.pojo.UserT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) context.getBean("user");
        user.showname();

        // 测试别名
        User useralias = (User) context.getBean("asdfdsfdsf");
        useralias.showname();
//        user.showschool();



        System.out.println("==============================================");

        UserT user2 = (UserT) context.getBean("user");
        user2.show();
    }
}
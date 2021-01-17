import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

        /*  输出的结果如下：
         * Student{
         *  name='Lee二狗',
         *  address=Address{address='上海市闵行区'},
         *  books=[红楼梦, 西游记, 水浒传, 三国演义],
         *  hobbys=[健身, 游泳, 听歌],
         *  card={身份证=11111111111, 银行卡=22222222222},
         *  games=[FIFA2020, 使命召唤, 战地2],
         *  wife='null',
         *  info={班级=0502, 学号=13141516, url=www.qq.com, username=leeergou}
         *  }
         */

    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user2", User.class);   /* 这里加了 User.class 显式定义后，就不用强制转换了 */
        System.out.println(user.toString());
    }





}

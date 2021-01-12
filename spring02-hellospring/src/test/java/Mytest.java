import com.kuang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {

        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
        hello.showage();




    }
}

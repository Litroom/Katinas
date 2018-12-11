package lt.itmokymai.spring;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml");

        ServiceC serviceC = (ServiceC) context.getBean("ListBean");
        System.out.println(serviceC.getResult());
        ((ConfigurableApplicationContext) context).close();


    }
}
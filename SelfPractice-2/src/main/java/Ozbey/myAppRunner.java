package Ozbey;


import Ozbey.config.ConfigApp;
import Ozbey.service.JavaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myAppRunner {




    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(ConfigApp.class);
        JavaService java= container.getBean(JavaService.class);

        java.getTeachingHours();


    }
}

package guru.springframework.didemo;

import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");

        // System.out.println(controller.hello());

        FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());
        System.out.println(fakeDataSource.getPassword());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) context.getBean(FakeJmsBroker.class);

        System.out.println(fakeJmsBroker.getUsername());

    }
}

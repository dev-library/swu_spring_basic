package kr.swu.spring_basic.di.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class DiMain {

    public static void main(String[] args) {
        // 빈 컨테이너와 통신해서 빈을 얻어오는 객체
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Singer singer = (Singer)context.getBean("singer");
        singer.sing();
    }
}

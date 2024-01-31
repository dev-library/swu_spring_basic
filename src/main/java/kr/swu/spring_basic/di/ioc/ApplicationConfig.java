package kr.swu.spring_basic.di.ioc;

import kr.swu.spring_basic.SpringBasicApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// 앞으로 볼 일은 거의 없지만 빈 컨테이너 내부의 빈을 꺼내오도록 설정하는 클래스
@Configuration
@ComponentScan(basePackageClasses = SpringBasicApplication.class)
public class ApplicationConfig {
}

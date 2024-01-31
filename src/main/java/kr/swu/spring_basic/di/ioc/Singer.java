package kr.swu.spring_basic.di.ioc;

import org.springframework.stereotype.Component;

@Component // Component 애너테이션은 아래 클래스의 객체를 bean container에 생성하라는 명령입니다.
public class Singer {
    // spring에서는 new 키워드로 개발자가 직접 객체를 생성하는 행위를 최대한 자제하게 합니다.
    public void sing(){
        // 인텔리제이에서는 sout
        System.out.println("가수가 노래를 합니다.");
    }
}

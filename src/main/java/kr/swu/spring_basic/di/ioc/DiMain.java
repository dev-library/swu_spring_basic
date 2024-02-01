package kr.swu.spring_basic.di.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class DiMain {

    public static void main(String[] args) {
        // 빈 컨테이너와 통신해서 빈을 얻어오는 객체
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // getBean의 경우 Object 리턴이므로 캐스팅을 해야함.
        //Singer singer = (Singer)context.getBean("singer");
        //singer.sing();

        // Stage 객체를 컨테이너에서 꺼내서 저장한 다음 기능을 호출해주세요.
        //Stage stage = (Stage)context.getBean("stage");
        //stage.showStage();

        BroadcastSystem broadcastSystem =
                (BroadcastSystem) context.getBean("broadcastSystem");
        broadcastSystem.broadcast();
    }
}

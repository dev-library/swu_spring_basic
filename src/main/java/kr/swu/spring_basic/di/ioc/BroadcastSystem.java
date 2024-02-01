package kr.swu.spring_basic.di.ioc;

import org.springframework.stereotype.Component;

@Component
public class BroadcastSystem {
    private Stage stage;

    public BroadcastSystem(Stage stage){
        this.stage = stage;
    }

    public void broadcast(){
        System.out.println("방송 송출용");
        stage.showStage();
    }
}

package kr.swu.spring_basic.di.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stage {

    private Singer singer;

    public Stage(Singer singer){
        this.singer = singer;
    }

    public void showStage(){
        System.out.println("무대에서");
        singer.sing();
    }
}

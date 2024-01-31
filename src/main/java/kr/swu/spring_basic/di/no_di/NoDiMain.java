package kr.swu.spring_basic.di.no_di;

public class NoDiMain {
    public static void main(String[] args) {
        Singer singer = new Singer();
        // stage 생성시 singer가 필요하다 : stage는 singer에 의존한다.
        Stage stage = new Stage(singer);
        BroadcastSystem broadcastSystem = new BroadcastSystem(stage);
        //singer.sing();
        //stage.showStage();
        broadcastSystem.broadcast();

    }
}

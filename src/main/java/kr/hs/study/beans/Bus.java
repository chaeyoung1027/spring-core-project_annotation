package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Meter {
    private static final int BASE_FARE = 2000; // 기본 요금

    @Override
    public void start() {
        System.out.println("운행을 시작합니다.");
    }

    @Override
    public int stop(int distance) {
        int fare = BASE_FARE + distance * 2;
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원 입니다.");
        return fare;
    }
}

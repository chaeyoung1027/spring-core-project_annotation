package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public void move() {
        System.out.println("강아지가 움직입니다.");
    }

    @Override
    public void eat() {
        System.out.println("강아지가 먹습니다.");
    }

    @Override
    public void bark() {
        System.out.println("강아지가 짖습니다.");
    }
}

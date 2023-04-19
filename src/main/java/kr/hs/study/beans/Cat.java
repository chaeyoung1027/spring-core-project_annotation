package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
    public void move() {
        System.out.println("고양이가 움직입니다.");
    }

    @Override
    public void eat() {
        System.out.println("고양이가 먹습니다.");
    }

    @Override
    public void bark() {
        System.out.println("고양이가 울부짖습니다.");
    }
}

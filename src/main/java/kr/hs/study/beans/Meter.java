package kr.hs.study.beans;

import org.springframework.stereotype.Component;

public interface Meter {
    public abstract void start();

    public abstract int stop(int distance);
}


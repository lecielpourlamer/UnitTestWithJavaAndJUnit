package com.unittest.iloveyouboss;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {

    private List<Scoreable> scores = new ArrayList<>();

    // add 메소드는 Scoreable 인스턴스를 인자로 받는다
    // Scoreable 객체는 간단히 int형의 score 값을 반환한다.
    public void add(Scoreable scoreable) {
        scores.add(scoreable);
    }

    public int arithmeticMean() {
        int total = scores.stream().mapToInt(Scoreable::getScore).sum();
        return total / scores.size();
    }
}

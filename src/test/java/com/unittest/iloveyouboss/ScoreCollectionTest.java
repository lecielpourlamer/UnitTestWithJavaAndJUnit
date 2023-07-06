package com.unittest.iloveyouboss;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class ScoreCollectionTest {

    @Test
    @DisplayName(value = "Answers Arithmetic Mean of Two Numbers")
    public void answersArithmeticMeanOfTwoNumbers() {
        // 스텁(stub) 실패문
        //fail("Not yet implemented");

        // 준비
        // ScoreCollection 인스턴스를 생성
        // Scoreable 구현 객체로 add() 메서드를 두번 호출
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        // 실행
        int actualResult = collection.arithmeticMean();
        System.out.println("actualResult = " + actualResult);

        // 단언
        assertThat(actualResult).isEqualTo(42);
        //assertThat(actualResult, equalTo(6));
    }
}
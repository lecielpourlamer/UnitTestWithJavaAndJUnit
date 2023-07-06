package com.unittest.iloveyouboss;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProfileTest {

    private Profile profile;
    private BooleanQuestion question;
    private Criteria criteria;

    @BeforeEach
    void create() {
        profile = new Profile("Bull Hockey, Inc.");
        question = new BooleanQuestion(1, "Got bonuses?");
        criteria = new Criteria();
    }
    @Test
    public void matchAnswersFalseWhenMustMatchCriteriaNotMet() {
        //Profile profile = new Profile("Bull Hockey, Inc.");
        //Question question = new BooleanQuestion(1, "Got bonuses?");
        //Answer profileAnswer = new Answer(question, Bool.FALSE);
        //profile.add(profileAnswer);
        profile.add(new Answer(question, Bool.FALSE));
        //Criteria criteria = new Criteria();
        //Answer criteriaAnswer = new Answer(question,Bool.TRUE);
        //Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
        criteria.add(new Criterion(new Answer(question,Bool.TRUE), Weight.MustMatch));
        boolean matches = profile.matches(criteria);

        assertFalse(matches);
    }

    @Test
    public void matchAnswersTrueForAnyDontCardCriteria() {
        //Profile profile = new Profile("Bull Hockey, Inc.");
        //Question question = new BooleanQuestion(1, "Got milk?");
        //Answer profileAnswer = new Answer(question, Bool.FALSE);
        //profile.add(profileAnswer);
        profile.add(new Answer(question, Bool.FALSE));
        //Criteria criteria = new Criteria();
        //Answer criteriaAnswer = new Answer(question,Bool.TRUE);
        //Criterion criterion = new Criterion(criteriaAnswer, Weight.DontCare);
        criteria.add(new Criterion(new Answer(question,Bool.TRUE), Weight.DontCare));
        boolean matches = profile.matches(criteria);

        assertTrue(matches);
    }
}
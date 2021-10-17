package introduction;

import static org.junit.Assert.*;
import org.junit.*;

public class ProfileTest {

    @Test
    public void matchAnsersFalseWhenMustMatchCriteriaNotMet() {
        Profile profile = new Profile("Buy Hockey, Inc.");
        Question question = new BooleanQuestion(1, "Got bonuses?");
        Answer profileAnser = new Answer(question, Bool.FALSE);
        profile.add(profileAnser);
        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(question, Bool.TRUE);
        Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
        criteria.add(criterion);

        boolean matches = profile.matches(criteria);
        assertFalse(matches);
    }
}

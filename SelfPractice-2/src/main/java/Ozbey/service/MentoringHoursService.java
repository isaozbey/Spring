package Ozbey.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Qualifier("Mentor")
@Component
public class MentoringHoursService implements ExtraSessions {
    @Override
    public int getHours() {
        return 34;
    }
}

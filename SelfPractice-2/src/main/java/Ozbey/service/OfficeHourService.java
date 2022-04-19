package Ozbey.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("OfficeHour")
@Component
public class OfficeHourService implements ExtraSessions{


    @Override
    public int getHours() {
        return 5;
    }
}

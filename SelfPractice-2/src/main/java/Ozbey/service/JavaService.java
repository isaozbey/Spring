package Ozbey.service;

import Ozbey.repository.JavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JavaService {

    private final JavaRepository javaRepository;
    private final ExtraSessions extraSessions;

    @Autowired
    public JavaService(@Qualifier("Mentor") ExtraSessions extraSessions, JavaRepository javaRepository) {
        this.extraSessions=extraSessions;
        this.javaRepository=javaRepository;
    }

    public void getTeachingHours() {

        System.out.println("Weekly Java Hours: " + (javaRepository.returnHours()+extraSessions.getHours()));

    }
}

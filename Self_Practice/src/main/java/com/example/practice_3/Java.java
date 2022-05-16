package com.example.practice_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Java {


    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    OfficeHours officeHours;

    public void getTeachHours(){
        System.out.println("Teaching hours is +++10 ======="+officeHours.getHours());
    }
}

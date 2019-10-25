package com.jdi.test.data;

import jdisite.entities.ContactInfo;

public class DefaultDataProvider {
    public static ContactInfo SIMPLE_CONTACT = new ContactInfo().set(c-> {
        c.name = "Roman"; c.lastName = "Iovlev"; c.position = "ChiefQA";
        c.passportNumber = 4321; c.passportSeria = 123456;
        c.description = "JDI - awesome UI automation tool";
    });

    public static ContactInfo FULL_CONTACT = new ContactInfo().set(c-> {
        c.name = "Roman"; c.lastName = "Full Contact"; c.position = "ChiefQA";
        c.gender = "Female"; c.religion = "Other"; c.weather = "Sun, Snow";
        c.passportNumber = 4321; c.passportSeria = 123456;
        c.description = "JDI - awesome UI automation tool";
        c.passport = true; c.acceptConditions = false;
    });
}

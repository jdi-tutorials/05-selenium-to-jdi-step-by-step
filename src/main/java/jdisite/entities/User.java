package jdisite.entities;

import com.epam.jdi.tools.DataClass;

import java.util.Objects;

import static java.lang.String.format;

public class User extends DataClass<User> {
    public String name, password;
}

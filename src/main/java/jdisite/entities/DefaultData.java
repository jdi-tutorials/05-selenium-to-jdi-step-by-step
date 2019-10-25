package jdisite.entities;

public class DefaultData {
    public static User ROMAN = new User().set(u-> {
        u.name = "Roman"; u.password = "Jdi1234";
    });
}

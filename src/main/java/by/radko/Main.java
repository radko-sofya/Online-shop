package by.radko;

import by.radko.entity.Role;
import by.radko.entity.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user = new User(38L, "hig", "tvjt", LocalDate.of(2010, 6,15), true);
        Role role = new Role(11L, "h");
        Role role1 = new Role(11L, "h");
        System.out.println(user);
        System.out.println(role.equals(role1));
    }
}
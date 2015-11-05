package com.csvParsed;

/**
 * Created by lodwr on 05.11.2015.
 */
public class User implements Comparable{
    String phone;
    String name;
    String surname;
    String city;
    public User (){}
    public User (String name, String surname, String city, String phone){
        this.name=name;
        this.surname=surname;
        this.city=city;
        this.phone=phone;
    }

    @Override
    public int compareTo(Object o) {
        User u = (User)o;
        return this.name.compareTo(u.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return phone.equals(user.phone);

    }

    @Override
    public int hashCode() {
        return phone.hashCode();
    }
}

package lab18;

import java.util.Objects;

public class User {
    
    private String firstname;
    private String lastname;
    private String age;

    public User(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = String.valueOf(age);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User lab18_2 = (User) o;
        return Objects.equals(firstname, lab18_2.firstname) && Objects.equals(lastname, lab18_2.lastname) && Objects.equals(age, lab18_2.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age);
    }
}

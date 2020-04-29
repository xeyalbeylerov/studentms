package student.demo.beans;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private String username;
    private String password;

    public Student() {
    }

    public Student(Integer id, String name, String surname, Integer age, String username, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "id=" + id + "name=" + name +" surname=" + surname +" age=" + age +" username=" + username + " password='" + password ;
    }
}

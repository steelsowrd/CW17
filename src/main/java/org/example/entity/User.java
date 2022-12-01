package org.example.entity;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;


@Entity
@Table(name = "users")
public class User extends BaseEntity {

    private String name;
    @Column(unique = true, nullable = false)
    private String userName;
    @Column(unique = true, nullable = false)
    private String number;
    private String password;
    private Long enterDate;
//    @OneToMany(mappedBy = "user")
//    private List<Tweets> tweets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getEnterDate() {
        return enterDate;
    }

    public void setEnterDate() {
        enterDate = ZonedDateTime.now().toEpochSecond();
    }

    public void setEnterDate(Long enterDate) {
        this.enterDate = enterDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id= " + getId() +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", number='" + number + '\'' +
                ", password='" + password + '\'' +
                ", enterDate=" + enterDate +
                '}';
    }
}

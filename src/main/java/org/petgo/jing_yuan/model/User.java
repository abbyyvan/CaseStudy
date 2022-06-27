package org.petgo.jing_yuan.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User")
public class User {
    public static final int EMAIL_LENGTH = 56;
    public static final int USERNAME_LEAST_CHAR = 3;
    public static final int PASSWORD_LENGTH = 12;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

    @Column(name = "email", nullable = false, length = EMAIL_LENGTH)
    private String email;

    @Column(name = "password", length = PASSWORD_LENGTH)
    private String password;

    @Size(min = USERNAME_LEAST_CHAR, message = "Username must be at least 3 characters long")
    private String username;

    // one user can have many pet applications
    // @OneToMany(targetEntity = Application.class, cascade = { CascadeType.ALL })
    // private List ApplicationList;

    @OneToOne
    private Role role;

}
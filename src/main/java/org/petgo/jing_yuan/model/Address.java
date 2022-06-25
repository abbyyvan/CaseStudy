package org.petgo.jing_yuan.model;

import lombok.*;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "address")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(exclude = "user")
@ToString(exclude = "user")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int address_id;

    @Column(name = "street", nullable = false, length = 255)
    private String street;

    @Column(name = "city", nullable = false, length = 15)
    private String city;

    @Column(name = "postcode", nullable = false, length = 8)
    private String postCode;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
    private Set<User> users = new HashSet<>(0);

}

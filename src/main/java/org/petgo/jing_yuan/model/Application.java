package org.petgo.jing_yuan.model;

import lombok.*;
import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;



@Entity
@Table(name = "application")
@Getter
@Setter
@NoArgsConstructor
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinColumn(name = "user_id")
    private User user;

    
}

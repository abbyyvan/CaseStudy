package org.petgo.jing_yuan.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "application_detail")
public class ApplicationDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    // one application per application detail
    @OneToOne
    // @JoinColumn(name = "application_id")
    private Application application;

    @OneToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}

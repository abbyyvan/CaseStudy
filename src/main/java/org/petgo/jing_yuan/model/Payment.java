package org.petgo.jing_yuan.model;

import lombok.*;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "payment")
@Getter
@Setter
@ToString(exclude = "user")
@EqualsAndHashCode(exclude = "user")
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int paymentId;

    @Column(name = "user_card_number", nullable = false, length = 16)
    private String cardNo;

    @Column(name = "user_card_expiry_date", nullable = false, length = 5)
    private Date cardExpiryDate;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}

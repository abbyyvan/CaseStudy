package org.petgo.jing_yuan.model;

import lombok.*;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(exclude = { "user", "items" })
@ToString(exclude = "user")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "orders_items", joinColumns = {
            @JoinColumn(name = "order_id", nullable = false, updatable = false) }, inverseJoinColumns = {
                    @JoinColumn(name = "item_id", nullable = false, updatable = false) })
    private Set<Item> items = new HashSet<>(0);

}
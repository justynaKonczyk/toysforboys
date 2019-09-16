package be.vdab.toysforboystest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ordered")
    private LocalDate ordered;

    @Column(name = "required")
    private LocalDate required;

    @Column(name = "shipped")
    private LocalDate shipped;

    @Column(name = "comments")
    private String comments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId")
    private Customer customer;

    @Column(name = "version")
    private Integer version;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy = "order")
    private Set<OrderDetail> orderDetails = new HashSet<>();


}

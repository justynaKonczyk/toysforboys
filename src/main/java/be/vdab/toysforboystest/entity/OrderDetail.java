package be.vdab.toysforboystest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "orderdetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {

    @EmbeddedId
    private OrderDetailId orderDetailId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productid", insertable = false, updatable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderid", insertable = false, updatable = false)
    private Order order;

    @Column(name = "ordered")
    private Integer ordered;

    @Column(name = "priceeach")
    private BigDecimal priceEach;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       OrderDetail that = (OrderDetail) o;
       return Objects.equals(orderDetailId, that.orderDetailId) &&
               Objects.equals(ordered, that.ordered) &&
               Objects.equals(priceEach, that.priceEach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDetailId, ordered, priceEach);
    }

}

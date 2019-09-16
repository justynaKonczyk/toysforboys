package be.vdab.toysforboystest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailId implements Serializable {

    @Column(name = "orderid")
    private Long orderId;

    @Column(name = "productId")
    private Long productId;

}

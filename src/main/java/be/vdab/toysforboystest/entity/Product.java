package be.vdab.toysforboystest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "scale")
    private String scale;

    @Column(name = "description")
    private String description;

    @Column(name = "inStock")
    private int inStock;

    @Column(name = "inOrder")
    private int inOrder;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productlineId")
    private ProductLine productLine;

    @Column(name = "version")
    private int version;

    public BigDecimal getPrice() {
        return price.setScale(1);
    }
}

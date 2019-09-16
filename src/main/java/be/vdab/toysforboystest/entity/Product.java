package be.vdab.toysforboystest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
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
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "scale")
    private String scale;

    @Column(name = "description")
    private String description;

    @Column(name = "instock")
    private Integer inStock;

    @Column(name = "inorder")
    private Integer inOrder;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productlineid")
    private ProductLine productLine;

    @Column(name = "version")
    private Integer version;

}

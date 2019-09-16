package be.vdab.toysforboystest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
public class Address {

    @Column(name = "streetandnumber")
    private String streetAndNumber;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postalcode")
    private String postalcode;

    protected Address(){}

}

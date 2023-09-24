package com.crud.crud.domain;


import com.crud.crud.record.RequestProduct;
import jakarta.persistence.*;
import lombok.*;

@Entity(name="product")
@Table(name="product")
@EqualsAndHashCode(of="id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private Integer price_in_cents;

    private Boolean active;

    public Product(RequestProduct RequestProduct){
        this.name = RequestProduct.name();
        this.price_in_cents = RequestProduct.price_in_cents();
    }
}

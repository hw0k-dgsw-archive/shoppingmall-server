package me.hw0k.shoppingmall.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
class ReviewKey implements Serializable {

    @Column(name = "user_id")
    Long userId;

    @Column(name = "product_id")
    Long productId;

}

package me.hw0k.shoppingmall.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserWithProductKey implements Serializable {

    @Column(name = "user_id")
    Long userId;

    @Column(name = "product_id")
    Long productId;

}

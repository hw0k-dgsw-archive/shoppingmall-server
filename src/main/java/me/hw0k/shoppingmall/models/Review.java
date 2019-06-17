package me.hw0k.shoppingmall.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @EmbeddedId
    private UserWithProductKey id;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("product_id")
    @JoinColumn(name = "product_id")
    private Product product;

    @Column
    private int star;

    @Column
    private String comment;

    @CreationTimestamp
    @JsonFormat(pattern = "YYYY-mm-dd H:mm:ss")
    private LocalDateTime created;

    @UpdateTimestamp
    @JsonFormat(pattern = "YYYY-mm-dd H:mm:ss")
    private LocalDateTime updated;

}

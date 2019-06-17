package me.hw0k.shoppingmall.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    public enum Category {
        MAN_CLOTHES("상의(남)"),
        MAN_PANTS("하의(남)"),
        WOMAN_CLOTHES("상의(여)"),
        WOMAN_PANTS("하의(여)"),
        SHOES("신발"),
        BAG("가방"),
        COSTUME("소품"),
        ETC("기타");

        @Getter
        private String info;

        Category(String info) {
            this.info = info;
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Category category;

    @Column
    private String name;

    @Column
    private int price;

    @Column
    private UUID image;

    @Column
    private String info;

    @OneToMany(mappedBy = "product")
    private Set<Review> reviews;

    @CreationTimestamp
    @JsonFormat(pattern = "YYYY-mm-dd H:mm:ss")
    private LocalDateTime created;

    @UpdateTimestamp
    @JsonFormat(pattern = "YYYY-mm-dd H:mm:ss")
    private LocalDateTime updated;

}

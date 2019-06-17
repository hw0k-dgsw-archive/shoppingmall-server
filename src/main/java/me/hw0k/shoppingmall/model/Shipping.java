package me.hw0k.shoppingmall.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @MapsId("contract_id")
    @JoinColumn(name = "contract_id")
    private List<Contract> contracts = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    private User user;

    @CreationTimestamp
    @JsonFormat(pattern = "YYYY-mm-dd H:mm:ss")
    private LocalDateTime created;

}
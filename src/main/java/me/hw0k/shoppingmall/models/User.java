package me.hw0k.shoppingmall.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String account;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String phoneNumber;

    @Column
    private String zipCode;

    @Column
    private String address;

    @Column
    private String email;

    @OneToMany(mappedBy = "user")
    private Set<Review> reviews;

    @CreationTimestamp
    @JsonFormat(pattern = "YYYY-mm-dd H:mm:ss")
    private LocalDateTime created;

    @UpdateTimestamp
    @JsonFormat(pattern = "YYYY-mm-dd H:mm:ss")
    private LocalDateTime updated;

}

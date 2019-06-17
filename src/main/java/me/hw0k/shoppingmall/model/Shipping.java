// TODO: Save for later

//package me.hw0k.shoppingmall.model;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Shipping {
//
//    @Entity
//    @Data
//    public class Contract {
//        @OneToMany
//        private Product product;
//        private int quantity;
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column
//    private List<Contract> contract;
//
//    @Column
//    private User user;
//
//    @CreationTimestamp
//    @JsonFormat(pattern = "YYYY-mm-dd H:mm:ss")
//    private LocalDateTime created;
//}
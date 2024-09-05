package com.example.trade_point.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_store")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;
    private String storeName;
    private String storeAddress;
    private String storeStatus;

}

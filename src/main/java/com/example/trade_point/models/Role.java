package com.example.trade_point.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tb_role")
@Getter
@Setter
@RequiredArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    private String roleName;
}

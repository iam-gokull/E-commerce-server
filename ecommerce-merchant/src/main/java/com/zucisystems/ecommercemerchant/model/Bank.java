package com.zucisystems.ecommercemerchant.model;

import com.zucisystems.ecommercemerchant.pojo.AccountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "banks")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bankAccountHolderName;
    private String accountNumber;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    private String sortCode;
    private String bankName;
    private String bankBranchName;
    @Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date CreatedAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date UpdatedAt;
    @OneToOne
    @JoinColumn(name = "farm_id")
    private Farm farm;

}

package com.zucisystems.ecommercemerchant.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
@Table(name = "farms")
public class Farm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "seller_id", nullable = false)
    private Seller seller;
    private String name;
    private String address;
    @Min(10) @Max(10)
    private Long contactNumber;
    private String logoUrl;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String contactPersonName;
    private String contactPersonDesignation;
    private String contactPersonContactNumber;
    @Column(unique = true)
    private String contactPersonEmail;
    @Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date CreatedAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date UpdatedAt;
    @OneToOne(mappedBy = "farm")
    private Bank bank;

}

package com.zucisystems.ecommercemerchant.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Table(name = "password_reset_tokens")
public class PasswordResetToken {

    private static final Logger LOGGER = LoggerFactory.getLogger(PasswordResetToken.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "seller_id", nullable = false)
    private Seller seller;
    private String token;
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirationTime;
    private Date calculateExpiryDate() {
        final Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(new Date().getTime());
        cal.add(Calendar.MINUTE, 60);
        Date date = new Date(cal.getTime().getTime());
        LOGGER.info("Password reset token expiry is set to " + date.toString());
        return date;
    }
    public PasswordResetToken() {
        this.token = UUID.randomUUID().toString();
        LOGGER.info("Password reset token is generated");
        this.expirationTime = calculateExpiryDate();
    }
}

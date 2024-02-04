package com.zucisystems.ecommercemerchant.payload;

import lombok.Data;

@Data
public class SellerDTO {
    private String email;
    private String password;
    private String rePassword;
}

package com.zucisystems.ecommercemerchant.service;

import com.zucisystems.ecommercemerchant.exception.UserAlreadyExistsException;
import com.zucisystems.ecommercemerchant.model.PasswordResetToken;
import com.zucisystems.ecommercemerchant.model.Seller;
import com.zucisystems.ecommercemerchant.payload.SellerDTO;
import com.zucisystems.ecommercemerchant.repository.SellerRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SellerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PasswordResetToken.class);

    private final SellerRepository sellerRepository;

    public Seller registerSeller(SellerDTO sellerDTO) {
        if (sellerRepository.existsByEmail(sellerDTO.getEmail())) {
            throw new UserAlreadyExistsException(HttpStatus.BAD_REQUEST, "Email id already exists");
        }

        return null;
    }

}

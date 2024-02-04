package com.zucisystems.ecommercemerchant.repository;

import com.zucisystems.ecommercemerchant.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

    boolean existsByEmail(String email);
}

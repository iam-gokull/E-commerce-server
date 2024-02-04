package com.zucisystems.ecommercemerchant.repository;

import com.zucisystems.ecommercemerchant.model.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmRepository extends JpaRepository<Farm, Long> {
}

package com.prajwal.purchaseorderapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prajwal.purchaseorderapi.entity.Purchaseorder;

public interface PurchaseorderRepository<orderid> extends JpaRepository<Purchaseorder, orderid> {

}

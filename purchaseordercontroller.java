package com.prajwal.purchaseorder.controller;
import java.util.List;
import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PurchaseorderController {
	private Purchaseorder purchaseorder;
	
	public PurchaseorderController(purchaseorder)
	{
		this.purchaseorder=purchaseorder;
	}
	private Logger logger = LoggerFactory.getLogger(PurchaseorderController.class);
	@GetMapping(value = "/getAllProducts")
    public ResponseEntity<List<Product>> getAllProducts() {

        List<> productList = purchaseorder.getAllProducts();

        return ResponseEntity.ok(productList);
        @PostMapping("/placeOrder")
        
	

}

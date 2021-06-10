package com.tcs.inetrn21.ms.transfersmanagement.transfersmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferResoucre {
	private TransferDao TransferService;
	@Autowired
	public  void Controller (TransferDao service) {
		TransferService = service;
	}
	@GetMapping("/transfers")
	public List<TransferEntity>findAll()
	{
		return TransferService.findAll();	
	}
	@GetMapping("/transfers/{transfer_id}")
	public TransferEntity getTransfer(@PathVariable int transfer_id)
	{
		TransferEntity theTransfer = TransferService.findById(transfer_id);
		
		if (theTransfer == null) {
			throw new TransferNotFoundExceptionClass("transfer id not found - " + transfer_id); 
		}
		
		return theTransfer;
	}
	@PostMapping("/transfers")
	public TransferEntity addtransfer(@RequestBody TransferEntity thetransfer) {
		thetransfer.setTransfer_id(0);
		TransferService.save(thetransfer);
		return thetransfer;
	}
}

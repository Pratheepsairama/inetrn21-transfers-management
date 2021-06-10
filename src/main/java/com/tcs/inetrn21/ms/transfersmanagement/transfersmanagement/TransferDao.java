package com.tcs.inetrn21.ms.transfersmanagement.transfersmanagement;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface TransferDao {
	public List<TransferEntity> findAll();
	public TransferEntity findById(int transfer_id);
	public void save (TransferEntity transferEntity);
	

}

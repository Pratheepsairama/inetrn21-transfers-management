package com.tcs.inetrn21.ms.transfersmanagement.transfersmanagement;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class TransferImplements  implements TransferDao{
	
	private TransferRepository repo;
	public TransferImplements (TransferRepository therepo)
	{
		repo=therepo;
	}
	@Override
	@Transactional
	public List<TransferEntity> findAll(){
		return repo.findAll();
	}
	@Override
	@Transactional
	public TransferEntity findById(int transfer_id)
	{
		Optional<TransferEntity> tranfserEntity=repo.findById( transfer_id);
		TransferEntity thetransferEntity=null;   
		
		if(tranfserEntity.isPresent()) {
			
			thetransferEntity=tranfserEntity.get();
		}
		
		else {
			
		}
		return thetransferEntity;
	}
	@Override
	@Transactional
	public void save(TransferEntity transferentity)
	{
		repo.save(transferentity);
	}
	

}

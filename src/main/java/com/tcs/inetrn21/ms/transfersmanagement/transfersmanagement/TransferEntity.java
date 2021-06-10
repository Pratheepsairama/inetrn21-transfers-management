package com.tcs.inetrn21.ms.transfersmanagement.transfersmanagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transfer_entity")
public class TransferEntity {
	@Id
	@GeneratedValue
	private Integer transfer_id ;
	private Integer source_account;
	private Integer target_account;
	private Integer amount;
	private String status;
	protected TransferEntity()
	{
		
	}
	public TransferEntity(Integer transfer_id, Integer source_account, Integer target_account, Integer amount,
			String status) {
		super();
		this.transfer_id = transfer_id;
		this.source_account = source_account;
		this.target_account = target_account;
		this.amount = amount;
		this.status = status;
	}
	
	public Integer getTransfer_id() {
		return transfer_id;
	}
	public void setTransfer_id(Integer transfer_id) {
		this.transfer_id = transfer_id;
	}
	public Integer getSource_account() {
		return source_account;
	}
	public void setSource_account(Integer source_account) {
		this.source_account = source_account;
	}
	public Integer getTarget_account() {
		return target_account;
	}
	public void setTarget_account(Integer target_account) {
		this.target_account = target_account;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TransferEntity [transfer_id=" + transfer_id + ", source_account=" + source_account + ", target_account="
				+ target_account + ", amount=" + amount + ", status=" + status + "]";
	}
	
}

package org.commodity.model.vo;

import java.sql.Date;

public class StoreTotal {
	private Float stmoney; 
    private String ststoreno;
	private Date stdate;
	
	public Float getSTMoney()
	{
		return this.stmoney;
	}
	
	public void setSTMoney(Float stmoney)
	{
		this.stmoney = stmoney;
	}
	
	public String getSTStoreNo()
	{
		return this.ststoreno;
	}
	
	public void setSTStoreNo(String ststoreno)
	{
		this.ststoreno = ststoreno;
	}
	
	public Date getSTDate()
	{
		return this.stdate;
	}
	
	public void setSTDate(Date stdate)
	{
		this.stdate = stdate;
	}
}

package org.commodity.model.vo;

import java.sql.Date;

public class Sell {
	private Integer sellno;
	private String ccode;
	private String sno;
	private Date selltime;
	private Float sellnum;
	private Float sellmoney;
	
	public Integer getSellNo()
	{
		return this.sellno;
	}
	
	public void setSellNo(Integer sellno)
	{
		this.sellno = sellno;
	}
	
	public String getCCode()
	{
		return this.ccode;
	}
	
	public void setCCode(String ccode)
	{
		this.ccode = ccode;
	}
	
	public String getSNo()
	{
		return this.sno;
	}
	
	public void setSNo(String sno)
	{
		this.sno = sno;
	}
	
	public Date getSellTime()
	{
		return this.selltime;
	}
	
	public void setSellTime(Date selltime)
	{
		this.selltime = selltime;
	}
	
	public Float SellNum()
	{
		return this.sellnum;
	}
	
	public void setSellNum(Float sellnum)
	{
		this.sellnum = sellnum;
	}
	
	public Float getSellMoney()
	{
		return this.sellmoney;
	}
	
	public void setSellMoney(Float sellmoney)
	{
		this.sellmoney = sellmoney;
	}

}

package org.commodity.model.vo;

import java.sql.Date;

public class CommodityTotal {
	private String ctno;
	private String ctsno;
	private Date cdate;
	private Float cmoney;
	private Float csellsum; 
    private Float cinventort;
    
	public String getCTNo()
	{
		return this.ctno;
	}
	
	public void setCTNo(String ctno)
	{
		this.ctno = ctno;
	}
	
	public String getCTSNo()
	{
		return this.ctsno;
	}
	
	public void setCTSNo(String ctsno)
	{
		this.ctsno = ctsno;
	}
	
	public Date getCDate()
	{
		return this.cdate;
	}
	
	public void setCDate(Date cdate)
	{
		this.cdate = cdate;
	}
	
	public Float getCMoney()
	{
		return this.cmoney;
	}
	
	public void setCMoney(Float cmoney)
	{
		this.cmoney = cmoney;
	}
	
	public Float getCSellSum()
	{
		return this.csellsum;
	}
	
	public void setCSellSum(Float csellsum)
	{
		this.csellsum = csellsum;
	}
	
	public Float getCInventort()
	{
		return this.cinventort;
	}
	
	public void setCInventort(Float cinventort)
	{
		this.cinventort = cinventort;
	}
}

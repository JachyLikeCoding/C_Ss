package org.commodity.model.vo;

public class Buy {
	private String ccode;
	private String supno;
	private Float bsum;
	private Float bprice;
	
	public String getCCode()
	{
		return this.ccode;
	}
	
	public void setCCode(String ccode)
	{
		this.ccode = ccode;
	}
	
	public String getSupNo()
	{
		return this.supno;
	}
	
	public void setSupNo(String supno)
	{
		this.supno = supno;
	}
	
	public Float getBSum()
	{
		return this.bsum;
	}
	
	public void setBSum(Float bsum)
	{
		this.bsum = bsum;
	}
	
	public Float getBPrice()
	{
		return this.bprice;
	}
	
	public void setBPrice(Float bprice)
	{
		this.bprice = bprice;
	}
}

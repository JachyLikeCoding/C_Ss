package org.commodity.model.vo;

public class Commodity {
	public String ccode;
	public String cname;
	public String cunit;
	public Float cprice;
	public String cproperty;
	
	public String getCCode()
	{
		return this.ccode;
	}
	
	public void setCCode(String ccode)
	{
		this.ccode = ccode;
	}
	
	public String getCName()
	{
		return this.cname;
	}
	
	public void setCName(String cname)
	{
		this.cname = cname;
	}
	
	public String getCUnit()
	{
		return this.cunit;
	}
	
	public void setCUnit(String cunit)
	{
		this.cunit = cunit;
	}
	
	
	public Float getCPrice()
	{
		return this.cprice;
	}
	
	public void setCPrice(Float cprice)
	{
		this.cprice = cprice;
	}
	
	public String getCProperty()
	{
		return this.cproperty;
	}
	
	public void setSNo(String cproperty)
	{
		this.cproperty = cproperty;
	}
}

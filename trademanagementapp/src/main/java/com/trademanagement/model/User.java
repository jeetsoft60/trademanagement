package com.trademanagement.model;

public class User {
	private long userid;
	private String name;
	private String symbol;
	private String shares;
	private double prices;

	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getShares() {
		return shares;
	}
	public void setShares(String shares) {
		this.shares = shares;
	}
	public double getPrices() {
		return prices;
	}
	public void setPrices(double prices) {
		this.prices = prices;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", prices=");
		builder.append(prices);
		builder.append(", shares=");
		builder.append(shares);
		builder.append(", symbol=");
		builder.append(symbol);
		builder.append(", userid=");
		builder.append(userid);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prices);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((shares == null) ? 0 : shares.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + (int) (userid ^ (userid >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(prices) != Double.doubleToLongBits(other.prices))
			return false;
		if (shares == null) {
			if (other.shares != null)
				return false;
		} else if (!shares.equals(other.shares))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (userid != other.userid)
			return false;
		return true;
	}

}

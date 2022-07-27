package telran.people;

public class SalesPerson extends Employee {

	private int sales;
	private int percentPay;
	private int minPercentPay = 0;
	private int maxPercentPay = 100;
	
	public int getMinPercentPay() {
		return minPercentPay;
	}

	public void setMinPercentPay(int minPercentPay) {
		this.minPercentPay = minPercentPay;
	}

	public int getMaxPercentPay() {
		return maxPercentPay;
	}

	public void setMaxPercentPay(int maxPercentPay) {
		this.maxPercentPay = maxPercentPay;
	}
	public SalesPerson(long id, int birthYear, String email, int basicSalary, int sales, int percentPay) {
		super(id, birthYear, email, basicSalary);
		setSales(sales);
		setPercentPay(percentPay);
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public void setPercentPay(int percentPay) {
		if(percentPay < 0 || percentPay > 100) {
			throw new IllegalArgumentException(String.format("%d - wrong percent pay, " + 
					"shoud be in range [%d-%d]",percentPay,minPercentPay,maxPercentPay));
					}
		
		this.percentPay = percentPay;
	}

	@Override
	public int computePay() {
		return super.computePay() + sales * percentPay / 100;
	}

	

}

package tp3;

public class Tips {
	int bill;
	int tips;
	int nbPrs;

	Tips (int bill, int tips, int nbPrs) {
		this.bill= bill;
		this.tips = tips;
		this.nbPrs = nbPrs;
	}
	public Integer getBill() {
		return bill;
	}
	public void setBill ( Integer bill) {
		this.bill =bill ;
	}
	
	public Integer getTips() {
		return tips;
	}

	public void setTips ( Integer tips) {
		this.tips =tips;
	}
	
	public Integer getNbPrs() {
		return nbPrs;
	}

	public void setNbPrs ( Integer nbPrs) {
		this.nbPrs =nbPrs;
	}
}

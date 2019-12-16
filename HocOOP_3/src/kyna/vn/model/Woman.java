package kyna.vn.model;

import java.util.Date;

public class Woman extends Person {

	private boolean wearingMakup;
	
	public boolean isWearingMakup() {
		return wearingMakup;
	}

	public void setWearingMakup(boolean wearingMakup) {
		this.wearingMakup = wearingMakup;
	}

	@Override
	public void setDateOfBirth(Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAgeAsDays() {
		// TODO Auto-generated method stub
		return 0;
	}

}

package kyna.vn.model;

import java.util.Date;

public class Man extends Person {
	private boolean watchingFootball;

	public boolean isWatchingFootball() {
		return watchingFootball;
	}

	public void setWatchingFootball(boolean watchingFootball) {
		this.watchingFootball = watchingFootball;
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

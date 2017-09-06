package pojo.arrays;

import java.util.ArrayList;

import pojo.Upline;

public class Uplines {

	ArrayList<Upline> uplines;

	
	public Uplines() {
		super();
	}

	public ArrayList<Upline> getUpline() {
		return uplines;
	}

	public void setUpline(ArrayList<Upline> uplines) {
		this.uplines = uplines;
	}

	@Override
	public String toString() {
		return "Uplines [upline=" + uplines + "]";
	}
	
	
}

package pojo.arrays;

import java.util.ArrayList;

import pojo.Downline;

public class Downlines {

	private ArrayList<Downline> downlines;
	
	public Downlines() {
		super();
	}

	public ArrayList<Downline> getDownline() {
		return downlines;
	}

	public void setDownline(ArrayList<Downline> downline) {
		this.downlines = downline;
	}

	@Override
	public String toString() {
		return "Downlines [downlines=" + downlines + "]";
	}
	
	
	
}

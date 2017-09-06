package pojo.arrays;

import java.util.ArrayList;

import pojo.Upline;

public class Uplines {

	ArrayList<Upline> upline;

	
	public Uplines() {
		super();
	}

	public ArrayList<Upline> getUpline() {
		return upline;
	}

	public void setUpline(ArrayList<Upline> upline) {
		this.upline = upline;
	}

	@Override
	public String toString() {
		return "Uplines [upline=" + upline + "]";
	}
	
	
}

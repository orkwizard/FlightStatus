package pojo.arrays;

import java.io.Serializable;
import java.util.ArrayList;

import pojo.FID;

public class FIDS implements Serializable{
	private ArrayList<FID> fidsData;

	public FIDS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<FID> getFidsData() {
		return fidsData;
	}

	public void setFidsData(ArrayList<FID> fidsData) {
		this.fidsData = fidsData;
	}

	@Override
	public String toString() {
		return "FIDS [fidsData=" + fidsData + "]";
	}
	
}

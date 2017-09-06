package pojo;

import pojo.arrays.Airlines;
import pojo.arrays.Airports;
import pojo.arrays.Equipments;
import request.Apendix;
import request.RQ;

import request.RQDate;
import request.RQHourDay;
import request.RQIN;
import request.RQNumHours;
import request.RQUTC;

public class Request {
	RQ airport;
	RQ carrier;
	RQDate date;
	
	RQIN hourOfDay; //RQ = Request IN = Interpred
	RQIN numHours;
	RQIN utc;
	
	String codeType;
	
	RQIN maxFlights;
	String extendedOptions;
	String url;
	Apendix apendix;
	Equipments equipments;
	
	
}

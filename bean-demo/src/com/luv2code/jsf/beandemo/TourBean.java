package com.luv2code.jsf.beandemo;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TourBean {

	private String kindOfTour;
	
	public TourBean() {
		
	}
		
	public String getKindOfTour() {
		return kindOfTour;
	}

	public void setKindOfTour(String kindOfTour) {
		this.kindOfTour = kindOfTour;
	}

	public String startTheTour() {
		if (kindOfTour != null && kindOfTour.equals("city")) {
			return "city_tour";
		}
		else {
			return "country_tour";
		}
	}
}

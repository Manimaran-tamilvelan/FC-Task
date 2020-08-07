package com.fullcreative.javaoops;

public class Knowledge {

	private String sub;
	private String concept;
	//encapsulation - bean class
	public void setter(String sub, String concept) {
		this.sub = sub;
		this.concept = concept;
	}

	public Object getter() {
		//System.out.println(sub + "-" + concept);
		return sub+"-"+concept;
	}

}

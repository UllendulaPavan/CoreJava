package com.programDay30_may;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HospitalService {
	
	ArrayList< Hospital> ALH =new ArrayList<Hospital>();
	static int code=100;
	

	public Integer addHospital(Hospital YASHODA) {
		YASHODA.setHospitalCode(code);
		ALH.add(YASHODA);
		return code++;
	}
	
	public Map<Integer,String> getHospitals(){
		Map<Integer,String> map=new HashMap<Integer,String>();
		for (Hospital hosp : ALH) {
			map.put(hosp.getHospitalCode(), hosp.getHospitalName());
		}
		return map;
	}
	
	public Hospital getHospitalDetails(int code) {
		for (Hospital hospital : ALH) {
			if(code==hospital.getHospitalCode()) {
				return hospital;
			}
		}
		return null;
	}
	

}

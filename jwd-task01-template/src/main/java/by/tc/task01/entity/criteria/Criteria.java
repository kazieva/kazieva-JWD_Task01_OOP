package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private Map<E, Object> criteria = new HashMap<E, Object>();
	private String applianceType;

	public Criteria() {
		this.criteria = new HashMap<E, Object>();
		this.applianceType = null;
	}
	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
	public Map<E, Object> getCriteria(){
		return criteria;
	}

	public String getApplianceType() {
		return applianceType;
	}

	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
	}

}

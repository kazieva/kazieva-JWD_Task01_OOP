package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.FileNotFoundException;

public interface ApplianceService {	
	
	<E> Appliance find(Criteria<E> criteria) throws FileNotFoundException;
	
}

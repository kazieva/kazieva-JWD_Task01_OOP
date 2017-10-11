package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.*;
import java.util.Map;
import java.util.Set;
public class Validator {
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		String type = criteria.getApplianceType();
		boolean validity;
		if(type.equals("Oven")){
			validity=ovenValidator(criteria.getCriteria());
		}
		else{
			if(type.equals("Laptop")){
				validity=laptopValidator((criteria.getCriteria()));
			}
			else{
				if(type.equals("Refrigerator")){
					validity=refrigeratorValidator((criteria.getCriteria()));
				}
				else{
					if(type.equals("VacuumCleaner")){
						validity=vacuumCleanerValidator((criteria.getCriteria()));
					}
					else{
						if(type.equals("TabletPC")){
							validity=tabletPCValidator((criteria.getCriteria()));
						}
						else {
							if (type.equals("Speakers")) {
								validity=speakersValidator((criteria.getCriteria()));
							}
							else{
								validity=false;
							}
						}
					}
				}
			}
		}
		return validity;
	}
	public static <E> boolean ovenValidator(Map<E, Object> criteria){
		boolean flag=true;
		Set<Map.Entry<E, Object>> setCriteria = criteria.entrySet();
		for (Map.Entry<E, Object> userCriteria : setCriteria) {
			if (userCriteria.getKey().equals(Oven.POWER_CONSUMPTION)){
				if(!(userCriteria.getValue() instanceof Number)){
					flag = false;
					break;
				}
			}
			else {
				if (userCriteria.getKey().equals(Oven.WEIGHT)){
					if(!(userCriteria.getValue() instanceof Number)){
						flag = false;
						break;
					}
				}
				else {
					if (userCriteria.getKey().equals(Oven.CAPACITY)){
						if(!(userCriteria.getValue() instanceof Number)){
							flag = false;
							break;
						}
					}
				}
				if (userCriteria.getKey().equals(Oven.DEPTH)){
					if(!(userCriteria.getValue() instanceof Number)){
						flag = false;
						break;
					}
				}
				else {
					if (userCriteria.getKey().equals(Oven.HEIGHT)){
						if(!(userCriteria.getValue() instanceof Number)){
							flag = false;
							break;
						}
					}
					else {
						if (userCriteria.getKey().equals(Oven.WIDTH)){
							if(!(userCriteria.getValue() instanceof Number)){
								flag = false;
								break;
							}
						}
					}
				}
			}
		}
		if(flag){
			return true;
		}
		else {
			System.out.println("Validation error");
			return false;
		}

	}
	public static <E> boolean laptopValidator(Map<E, Object> criteria){
		boolean flag=true;
		Set<Map.Entry<E, Object>> setCriteria = criteria.entrySet();
		for (Map.Entry<E, Object> userCriteria : setCriteria) {
			if (userCriteria.getKey().equals(Laptop.BATTERY_CAPACITY)){
				if(!(userCriteria.getValue() instanceof Number)){
					flag = false;
					break;
				}
			}
			else {
				if (userCriteria.getKey().equals(Laptop.OS)){
					if(!(userCriteria.getValue() instanceof String)){
						flag = false;
						break;
						}
					}
				else {
					if (userCriteria.getKey().equals(Laptop.MEMORY_ROM)){
						if(!(userCriteria.getValue() instanceof Number)){
							flag = false;
							break;
							}
						}
					}
					if (userCriteria.getKey().equals(Laptop.SYSTEM_MEMORY)){
						if(!(userCriteria.getValue() instanceof Number)){
							flag = false;
							break;
						}
					}
					else {
						if (userCriteria.getKey().equals(Laptop.CPU)){
							if(!(userCriteria.getValue() instanceof Number)){
								flag = false;
								break;
							}
						}
						else {
							if (userCriteria.getKey().equals(Laptop.DISPLAY_INCHS)){
								if(!(userCriteria.getValue() instanceof Number)){
									flag = false;
									break;
								}
							}
						}
					}
				}

		}
		if(flag){
			return true;
		}
		else {
			System.out.println("Validation error");
			return false;
		}

	}
	public static <E> boolean refrigeratorValidator(Map<E, Object> criteria){
		boolean flag=true;
		Set<Map.Entry<E, Object>> setCriteria = criteria.entrySet();
		for (Map.Entry<E, Object> userCriteria : setCriteria) {
			if (userCriteria.getKey().equals(Refrigerator.POWER_CONSUMPTION)){
				if(!(userCriteria.getValue() instanceof Number)){
					flag = false;
					break;
				}
			}
			else {
				if (userCriteria.getKey().equals(Refrigerator.WEIGHT)){
					if(!(userCriteria.getValue() instanceof Number)){
						flag = false;
						break;
					}
				}
				else {
					if (userCriteria.getKey().equals(Refrigerator.FREEZER_CAPACITY)){
						if(!(userCriteria.getValue() instanceof Number)){
							flag = false;
							break;
						}
					}
				}
				if (userCriteria.getKey().equals(Refrigerator.OVERALL_CAPACITY)){
					if(!(userCriteria.getValue() instanceof Number)){
						flag = false;
						break;
					}
				}
				else {
					if (userCriteria.getKey().equals(Refrigerator.HEIGHT)){
						if(!(userCriteria.getValue() instanceof Number)){
							flag = false;
							break;
						}
					}
					else {
						if (userCriteria.getKey().equals(Refrigerator.WIDTH)){
							if(!(userCriteria.getValue() instanceof Number)){
								flag = false;
								break;
							}
						}
					}
				}
			}
		}
		if(flag){
			return true;
		}
		else {
			System.out.println("Validation error");
			return false;
		}
	}
	public static <E> boolean vacuumCleanerValidator(Map<E, Object> criteria){
		boolean flag=true;
		Set<Map.Entry<E, Object>> setCriteria = criteria.entrySet();
		for (Map.Entry<E, Object> userCriteria : setCriteria) {
			if (userCriteria.getKey().equals(VacuumCleaner.POWER_CONSUMPTION)){
				if(!(userCriteria.getValue() instanceof Number)){
					flag = false;
					break;
				}
			}
			else {
				if (userCriteria.getKey().equals(VacuumCleaner.FILTER_TYPE)){
					if(!(userCriteria.getValue() instanceof String)){
						flag = false;
						break;
					}
				}
				else {
					if (userCriteria.getKey().equals(VacuumCleaner.BAG_TYPE)){
						if(!(userCriteria.getValue() instanceof String)){
							flag = false;
							break;
						}
					}
				}
				if (userCriteria.getKey().equals(VacuumCleaner.WAND_TYPE)){
					if(!(userCriteria.getValue() instanceof String)){
						flag = false;
						break;
					}
				}
				else {
					if (userCriteria.getKey().equals(VacuumCleaner.MOTOR_SPEED_REGULATION)){
						if(!(userCriteria.getValue() instanceof Number)){
							flag = false;
							break;
						}
					}
					else {
						if (userCriteria.getKey().equals(VacuumCleaner.CLEANING_WIDTH)){
							if(!(userCriteria.getValue() instanceof Number)){
								flag = false;
								break;
							}
						}
					}
				}
			}
		}
		if(flag){
			return true;
		}
		else {
			System.out.println("Validation error");
			return false;
		}
	}
	public static <E> boolean tabletPCValidator(Map<E, Object> criteria){
		boolean flag=true;
		Set<Map.Entry<E, Object>> setCriteria = criteria.entrySet();
		for (Map.Entry<E, Object> userCriteria : setCriteria) {
			if (userCriteria.getKey().equals(TabletPC.BATTERY_CAPACITY)){
				if(!(userCriteria.getValue() instanceof Number)){
					flag = false;
					break;
				}
			}
			else {
				if (userCriteria.getKey().equals(TabletPC.DISPLAY_INCHES)){
					if(!(userCriteria.getValue() instanceof Number)){
						flag = false;
						break;
					}
				}
				else {
					if (userCriteria.getKey().equals(TabletPC.MEMORY_ROM)){
						if(!(userCriteria.getValue() instanceof Number)){
							flag = false;
							break;
						}
					}
				}
				if (userCriteria.getKey().equals(TabletPC.FLASH_MEMORY_CAPACITY)){
					if(!(userCriteria.getValue() instanceof Number)){
						flag = false;
						break;
					}
				}
				else {
					if (userCriteria.getKey().equals(TabletPC.COLOR)) {
						if (!(userCriteria.getValue() instanceof String)) {
							flag = false;
							break;
						}
					}
				}
			}
		}
		if(flag){
			return true;
		}
		else {
			System.out.println("Validation error");
			return false;
		}
	}
	public static <E> boolean speakersValidator(Map<E, Object> criteria){
		boolean flag=true;
		Set<Map.Entry<E, Object>> setCriteria = criteria.entrySet();
		for (Map.Entry<E, Object> userCriteria : setCriteria) {
			if (userCriteria.getKey().equals(Speakers.POWER_CONSUMPTION)){
				if(!(userCriteria.getValue() instanceof Number)){
					flag = false;
					break;
				}
			}
			else {
				if (userCriteria.getKey().equals(Speakers.NUMBER_OF_SPEAKERS)){
					if(!(userCriteria.getValue() instanceof Number)){
						flag = false;
						break;
					}
				}
				else {
					if (userCriteria.getKey().equals(Speakers.FREQUENCY_RANGE)){
						if(!(userCriteria.getValue() instanceof String)){
							flag = false;
							break;
						}
					}
				}
				if (userCriteria.getKey().equals(Speakers.CORD_LENGTH)){
					if(!(userCriteria.getValue() instanceof Number)){
						flag = false;
						break;
					}
				}
			}
		}
		if(flag){
			return true;
		}
		else {
			System.out.println("Validation error");
			return false;
		}
	}
}

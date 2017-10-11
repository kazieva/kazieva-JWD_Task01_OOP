package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static by.tc.task01.dao.impl.Creator.ApplianceCreator.creator;

public class ApplianceDAOImpl implements ApplianceDAO {
	@Override
	public <E> Appliance find(Criteria<E> criteria) throws FileNotFoundException {
		Map<E, Object> criteriaMap = new HashMap<E, Object>();
		criteriaMap = criteria.getCriteria();
		Set<Map.Entry<E, Object>> setCriteria = criteriaMap.entrySet();

		String path = "jwd-task01-template/src/main/resources/appliances_db.txt";
		File file = new File(path);
		Scanner scanner = new Scanner(file);
		boolean flag = true;
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.contains(criteria.getApplianceType())) {
				for (Map.Entry<E, Object> userCriteria : setCriteria) {
					if ((line.contains(userCriteria.getKey() + "=" + userCriteria.getValue() + ",")) || (line.contains(userCriteria.getKey() + "=" + userCriteria.getValue() + ";"))) {
						flag=true;
					} else {
						flag = false;
						break;
					}
				}
				if (flag) {
					List initializationList = new ArrayList<String>();
					initializationList=parseLine(line);
					Appliance appliance = creator(initializationList, criteria.getApplianceType());
					return appliance;
				}
			}
		}
		scanner.close();
		if (!flag) {
			return null;
		}
		return null;
	}
	public static List<String> parseLine(String result){
		String[] member = result.split("[^0-9a-zA-Z-?_?.?]+");
		List<String > initializationList = new ArrayList<String>();
		for(int i=2;i<=member.length;i+=2){
			initializationList.add(member[i]);
		}
		return initializationList;
	}
}
package com.limbo.learning.pattern.filterPattern;

import java.util.ArrayList;
import java.util.List;


/**
 * 规则-Female
 *
 * @author LF.LIMBO
 * @version 2019/08/19
 */
public class CriteriaFemale implements Criteria {

    /**
     * 满足要求
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGrader().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}

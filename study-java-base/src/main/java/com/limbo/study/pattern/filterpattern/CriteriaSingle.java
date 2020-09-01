package com.limbo.study.pattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 规则-Single
 *
 * @author LF.LIMBO
 * @version 2019/08/19
 */
public class CriteriaSingle implements Criteria {

    /**
     * 满足要求
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}

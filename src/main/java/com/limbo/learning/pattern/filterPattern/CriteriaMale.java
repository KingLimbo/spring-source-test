package com.limbo.learning.pattern.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 规则-Male
 *
 * @author LF.LIMBO
 * @version 2019/08/19
 */
public class CriteriaMale implements Criteria {

    /**
     * 满足要求
     *
     * @param persons
     * @return
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGrader().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}

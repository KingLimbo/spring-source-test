package com.limbo.learning.pattern.filterPattern;

import java.util.List;

/**
 * 规则，准则
 *
 * @author LF.LIMBO
 * @version 2019/08/19
 */
public interface Criteria {

    /**
     * 满足要求
     *
     * @param persons
     * @return
     */
    public List<Person> meetCriteria(List<Person> persons);
}

package com.limbo.study.pattern.filterpattern;

/**
 * 人类
 *
 * @author LF.LIMBO
 * @version 2019/08/19
 */
public class Person {
    private String name;
    private String grader;
    private String maritalStatus;

    public Person(String name,String grader,String maritalStatus){
        this.name = name;
        this.grader = grader;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrader() {
        return grader;
    }

    public void setGrader(String grader) {
        this.grader = grader;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}

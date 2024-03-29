/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.web.search;

import com.inkubator.webcore.util.SearchParameter;

/**
 *
 * @author Deni Husni FR
 */
public class HolidaySearchParameter extends SearchParameter {

    private String religionName;
    private String holidayName;
    private Boolean isEveryYear;
    private Boolean isCollective;

    public String getReligionName() {
        if (getKeyParam() != null) {
            if (getKeyParam().equalsIgnoreCase("religionName")) {
                religionName = getParameter();
            }
        }

        return religionName;
    }

    public void setReligionName(String religionName) {
        this.religionName = religionName;
    }

    public String getHolidayName() {
        if (getKeyParam() != null) {
            if (getKeyParam().equalsIgnoreCase("holidayName")) {
                holidayName = getParameter();
            }

        }

        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public Boolean isIsEveryYear() {
        return isEveryYear;
    }

    public void setIsEveryYear(Boolean isEveryYear) {
        this.isEveryYear = isEveryYear;
    }

    public Boolean isIsCollective() {
        return isCollective;
    }

    public void setIsCollective(Boolean isCollective) {
        this.isCollective = isCollective;
    }

}

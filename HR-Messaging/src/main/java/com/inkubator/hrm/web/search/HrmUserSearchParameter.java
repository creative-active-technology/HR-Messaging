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
public class HrmUserSearchParameter extends SearchParameter {

    private String userName;
    private String realName;
    private String roleName;

    public String getUserName() {
        if (getKeyParam() != null) {
            if (getKeyParam().equalsIgnoreCase("userId")) {
                userName = getParameter();
            }
        }
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        if (getKeyParam() != null) {
            if (getKeyParam().equalsIgnoreCase("realName")) {
                realName = getParameter();
            }
        }
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRoleName() {
         if (getKeyParam() != null) {
            if (getKeyParam().equalsIgnoreCase("roleName")) {
                roleName = getParameter();
            }
        }
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    
}

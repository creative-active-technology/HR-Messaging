package com.inkubator.hrm.entity;
// Generated May 9, 2014 9:50:44 AM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HrmUserRoleId generated by hbm2java
 */
@Embeddable
public class HrmUserRoleId  implements java.io.Serializable {


     private long userId;
     private long roleId;

    public HrmUserRoleId() {
    }

    public HrmUserRoleId(long userId, long roleId) {
       this.userId = userId;
       this.roleId = roleId;
    }
   


    @Column(name="user_id", nullable=false)
    public long getUserId() {
        return this.userId;
    }
    
    public void setUserId(long userId) {
        this.userId = userId;
    }


    @Column(name="role_id", nullable=false)
    public long getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof HrmUserRoleId) ) return false;
		 HrmUserRoleId castOther = ( HrmUserRoleId ) other; 
         
		 return (this.getUserId()==castOther.getUserId())
 && (this.getRoleId()==castOther.getRoleId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getUserId();
         result = 37 * result + (int) this.getRoleId();
         return result;
   }   


}


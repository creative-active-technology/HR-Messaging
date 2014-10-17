package com.inkubator.hrm.entity;
// Generated Oct 14, 2014 10:35:26 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * JabatanProfesiId generated by hbm2java
 */
@Embeddable
public class JabatanProfesiId  implements java.io.Serializable {


     private long jabatanId;
     private long profesiId;

    public JabatanProfesiId() {
    }

    public JabatanProfesiId(long jabatanId, long profesiId) {
       this.jabatanId = jabatanId;
       this.profesiId = profesiId;
    }
   


    @Column(name="jabatan_id", nullable=false)
    public long getJabatanId() {
        return this.jabatanId;
    }
    
    public void setJabatanId(long jabatanId) {
        this.jabatanId = jabatanId;
    }


    @Column(name="profesi_id", nullable=false)
    public long getProfesiId() {
        return this.profesiId;
    }
    
    public void setProfesiId(long profesiId) {
        this.profesiId = profesiId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof JabatanProfesiId) ) return false;
		 JabatanProfesiId castOther = ( JabatanProfesiId ) other; 
         
		 return (this.getJabatanId()==castOther.getJabatanId())
 && (this.getProfesiId()==castOther.getProfesiId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getJabatanId();
         result = 37 * result + (int) this.getProfesiId();
         return result;
   }   


}



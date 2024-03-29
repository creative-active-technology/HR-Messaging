package com.inkubator.hrm.entity;
// Generated Jun 16, 2014 8:44:01 PM by Hibernate Tools 3.6.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * HrmMenuRole generated by hbm2java
 */
@Entity
@Table(name = "hrm_menu_role", catalog = "hrm"
)
public class HrmMenuRole implements java.io.Serializable {

    private HrmMenuRoleId id;
    private HrmMenu hrmMenu;
    private HrmRole hrmRole;
    private String description;

    public HrmMenuRole() {
    }

    public HrmMenuRole(HrmMenuRoleId id, HrmMenu hrmMenu, HrmRole hrmRole) {
        this.id = id;
        this.hrmMenu = hrmMenu;
        this.hrmRole = hrmRole;
    }

    public HrmMenuRole(HrmMenuRoleId id, HrmMenu hrmMenu, HrmRole hrmRole, String description) {
        this.id = id;
        this.hrmMenu = hrmMenu;
        this.hrmRole = hrmRole;
        this.description = description;
    }

    @EmbeddedId

    @AttributeOverrides({
        @AttributeOverride(name = "roleId", column = @Column(name = "role_id", nullable = false)),
        @AttributeOverride(name = "menuId", column = @Column(name = "menu_id", nullable = false))})
    public HrmMenuRoleId getId() {
        return this.id;
    }

    public void setId(HrmMenuRoleId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", nullable = false, insertable = false, updatable = false)
    public HrmMenu getHrmMenu() {
        return this.hrmMenu;
    }

    public void setHrmMenu(HrmMenu hrmMenu) {
        this.hrmMenu = hrmMenu;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false, insertable = false, updatable = false)
    public HrmRole getHrmRole() {
        return this.hrmRole;
    }

    public void setHrmRole(HrmRole hrmRole) {
        this.hrmRole = hrmRole;
    }

    @Column(name = "description", length = 45)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

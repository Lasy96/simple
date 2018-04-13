package tk.mybatis.simple.model.rest.param;

import tk.mybatis.simple.model.entity.User;

/**
 * Created by hxh
 * 2018/3/30.
 *
 * @author Administrator
 */
public class UserParam extends User {
    /**
     * 权限id
     */
    private int authorityId;
    /**
     * 角色id
     */
    private int roleId;

    /**
     * 权限名
     */
    private String authorityName;


    public int getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(int authorityId) {
        this.authorityId = authorityId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }
}

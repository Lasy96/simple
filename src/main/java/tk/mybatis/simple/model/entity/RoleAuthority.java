package tk.mybatis.simple.model.entity;

/**
 * @author yuanhua
 * @date 2018/4/16 9:24
 */
public class RoleAuthority {
    /**
     * 角色权限关联id
     */
    private Integer id;

    /**
     * 权限id
     */
    private Integer authorityId;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 获取角色权限关联id
     *
     * @return id - 角色权限关联id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置角色权限关联id
     *
     * @param id 角色权限关联id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取权限id
     *
     * @return authority_id - 权限id
     */
    public Integer getAuthorityId() {
        return authorityId;
    }

    /**
     * 设置权限id
     *
     * @param authorityId 权限id
     */
    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
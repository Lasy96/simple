package tk.mybatis.simple.model.entity;

/**
 * @author yuanhua
 * @date 2018/4/16 9:24
 */
public class UserRole {
    /**
     * 用户角色关联id
     */
    private Integer id;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 获取用户角色关联id
     *
     * @return id - 用户角色关联id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户角色关联id
     *
     * @param id 用户角色关联id
     */
    public void setId(Integer id) {
        this.id = id;
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

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
package tk.mybatis.simple.model.entity;

/**
 * @author yuanhua
 * @date 2018/4/13 13:58
 */
public class Authority {
    /**
     * 权限id
     */
    private Integer id;

    /**
     * 权限名
     */
    private String name;

    /**
     * 权限url
     */
    private String url;

    /**
     * 获取权限id
     *
     * @return id - 权限id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置权限id
     *
     * @param id 权限id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取权限名
     *
     * @return name - 权限名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置权限名
     *
     * @param name 权限名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取权限url
     *
     * @return url - 权限url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置权限url
     *
     * @param url 权限url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}
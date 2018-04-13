package tk.mybatis.simple.model.entity;

/**
 * @author yuanhua
 * @date 2018/4/13 14:03
 */
public class Country {
    /**
     */
    private Integer id;

    /**
     * 国家名称
     */
    private String countryName;

    /**
     * 国家代码
     */
    private String countryCode;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取国家名称
     *
     * @return country_name - 国家名称
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置国家名称
     *
     * @param countryName 国家名称
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    /**
     * 获取国家代码
     *
     * @return country_code - 国家代码
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置国家代码
     *
     * @param countryCode 国家代码
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }
}
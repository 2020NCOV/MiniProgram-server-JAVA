package miniprogram.server.beans;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "com_district_level")
public class ComDistrictLevel {
    @Id
    private Integer id;

    /**
     * 级别名称
     */
    private String name;

    /**
     * 级别序号（数值大的在前，不应重复）
     */
    private Integer level;

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
     * 获取级别名称
     *
     * @return name - 级别名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置级别名称
     *
     * @param name 级别名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取级别序号（数值大的在前，不应重复）
     *
     * @return level - 级别序号（数值大的在前，不应重复）
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置级别序号（数值大的在前，不应重复）
     *
     * @param level 级别序号（数值大的在前，不应重复）
     */
    public void setLevel(Integer level) {
        this.level = level;
    }
}
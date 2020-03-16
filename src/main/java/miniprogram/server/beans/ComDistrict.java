package miniprogram.server.beans;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "com_district")
public class ComDistrict {
    /**
     * 	行政区划标识id
     */
    @Id
    private Integer id;

    /**
     * 行政区划名称
     */
    private String name;

    /**
     * 行政区划字典值（不重复）
     */
    private Integer value;

    /**
     * 行政区划级别（关联行政区划级别id）
     */
    @Column(name = "level_id")
    private Integer levelId;

    /**
     * 父级行政区划id（最顶级为0）
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 排序号（数值大的在前）
     */
    private Integer seq;

    @Column(name = "short_name")
    private String shortName;

    /**
     * 获取	行政区划标识id
     *
     * @return id - 	行政区划标识id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置	行政区划标识id
     *
     * @param id 	行政区划标识id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取行政区划名称
     *
     * @return name - 行政区划名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置行政区划名称
     *
     * @param name 行政区划名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取行政区划字典值（不重复）
     *
     * @return value - 行政区划字典值（不重复）
     */
    public Integer getValue() {
        return value;
    }

    /**
     * 设置行政区划字典值（不重复）
     *
     * @param value 行政区划字典值（不重复）
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 获取行政区划级别（关联行政区划级别id）
     *
     * @return level_id - 行政区划级别（关联行政区划级别id）
     */
    public Integer getLevelId() {
        return levelId;
    }

    /**
     * 设置行政区划级别（关联行政区划级别id）
     *
     * @param levelId 行政区划级别（关联行政区划级别id）
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    /**
     * 获取父级行政区划id（最顶级为0）
     *
     * @return parent_id - 父级行政区划id（最顶级为0）
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父级行政区划id（最顶级为0）
     *
     * @param parentId 父级行政区划id（最顶级为0）
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取排序号（数值大的在前）
     *
     * @return seq - 排序号（数值大的在前）
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置排序号（数值大的在前）
     *
     * @param seq 排序号（数值大的在前）
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * @return short_name
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * @param shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
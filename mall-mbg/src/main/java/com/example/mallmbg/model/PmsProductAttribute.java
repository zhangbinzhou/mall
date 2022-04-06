package com.example.mallmbg.model;

import java.io.Serializable;

public class PmsProductAttribute implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.product_attribute_category_id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private Long productAttributeCategoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.name
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.select_type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private Integer selectType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.input_type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private Integer inputType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.input_list
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private String inputList;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.sort
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.filter_type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private Integer filterType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.search_type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private Integer searchType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.related_status
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private Integer relatedStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.hand_add_status
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private Integer handAddStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_product_attribute.type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.id
     *
     * @return the value of pms_product_attribute.id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.id
     *
     * @param id the value for pms_product_attribute.id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.product_attribute_category_id
     *
     * @return the value of pms_product_attribute.product_attribute_category_id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.product_attribute_category_id
     *
     * @param productAttributeCategoryId the value for pms_product_attribute.product_attribute_category_id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.name
     *
     * @return the value of pms_product_attribute.name
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.name
     *
     * @param name the value for pms_product_attribute.name
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.select_type
     *
     * @return the value of pms_product_attribute.select_type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public Integer getSelectType() {
        return selectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.select_type
     *
     * @param selectType the value for pms_product_attribute.select_type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setSelectType(Integer selectType) {
        this.selectType = selectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.input_type
     *
     * @return the value of pms_product_attribute.input_type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public Integer getInputType() {
        return inputType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.input_type
     *
     * @param inputType the value for pms_product_attribute.input_type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.input_list
     *
     * @return the value of pms_product_attribute.input_list
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public String getInputList() {
        return inputList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.input_list
     *
     * @param inputList the value for pms_product_attribute.input_list
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setInputList(String inputList) {
        this.inputList = inputList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.sort
     *
     * @return the value of pms_product_attribute.sort
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.sort
     *
     * @param sort the value for pms_product_attribute.sort
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.filter_type
     *
     * @return the value of pms_product_attribute.filter_type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public Integer getFilterType() {
        return filterType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.filter_type
     *
     * @param filterType the value for pms_product_attribute.filter_type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.search_type
     *
     * @return the value of pms_product_attribute.search_type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public Integer getSearchType() {
        return searchType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.search_type
     *
     * @param searchType the value for pms_product_attribute.search_type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.related_status
     *
     * @return the value of pms_product_attribute.related_status
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public Integer getRelatedStatus() {
        return relatedStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.related_status
     *
     * @param relatedStatus the value for pms_product_attribute.related_status
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setRelatedStatus(Integer relatedStatus) {
        this.relatedStatus = relatedStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.hand_add_status
     *
     * @return the value of pms_product_attribute.hand_add_status
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public Integer getHandAddStatus() {
        return handAddStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.hand_add_status
     *
     * @param handAddStatus the value for pms_product_attribute.hand_add_status
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setHandAddStatus(Integer handAddStatus) {
        this.handAddStatus = handAddStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_product_attribute.type
     *
     * @return the value of pms_product_attribute.type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_product_attribute.type
     *
     * @param type the value for pms_product_attribute.type
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_attribute
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productAttributeCategoryId=").append(productAttributeCategoryId);
        sb.append(", name=").append(name);
        sb.append(", selectType=").append(selectType);
        sb.append(", inputType=").append(inputType);
        sb.append(", inputList=").append(inputList);
        sb.append(", sort=").append(sort);
        sb.append(", filterType=").append(filterType);
        sb.append(", searchType=").append(searchType);
        sb.append(", relatedStatus=").append(relatedStatus);
        sb.append(", handAddStatus=").append(handAddStatus);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
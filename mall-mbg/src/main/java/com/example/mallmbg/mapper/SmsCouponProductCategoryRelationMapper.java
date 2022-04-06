package com.example.mallmbg.mapper;

import com.example.mallmbg.model.SmsCouponProductCategoryRelation;
import com.example.mallmbg.model.SmsCouponProductCategoryRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponProductCategoryRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    long countByExample(SmsCouponProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByExample(SmsCouponProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insert(SmsCouponProductCategoryRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insertSelective(SmsCouponProductCategoryRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    List<SmsCouponProductCategoryRelation> selectByExample(SmsCouponProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    SmsCouponProductCategoryRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExampleSelective(@Param("record") SmsCouponProductCategoryRelation record, @Param("example") SmsCouponProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExample(@Param("record") SmsCouponProductCategoryRelation record, @Param("example") SmsCouponProductCategoryRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKeySelective(SmsCouponProductCategoryRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_coupon_product_category_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKey(SmsCouponProductCategoryRelation record);
}
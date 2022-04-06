package com.example.mallmbg.mapper;

import com.example.mallmbg.model.UmsAdminRoleRelation;
import com.example.mallmbg.model.UmsAdminRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminRoleRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    long countByExample(UmsAdminRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByExample(UmsAdminRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insert(UmsAdminRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insertSelective(UmsAdminRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    List<UmsAdminRoleRelation> selectByExample(UmsAdminRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExampleSelective(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExample(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_admin_role_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKey(UmsAdminRoleRelation record);
}
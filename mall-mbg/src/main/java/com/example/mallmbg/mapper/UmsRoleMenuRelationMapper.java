package com.example.mallmbg.mapper;

import com.example.mallmbg.model.UmsRoleMenuRelation;
import com.example.mallmbg.model.UmsRoleMenuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsRoleMenuRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    long countByExample(UmsRoleMenuRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByExample(UmsRoleMenuRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insert(UmsRoleMenuRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insertSelective(UmsRoleMenuRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    List<UmsRoleMenuRelation> selectByExample(UmsRoleMenuRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    UmsRoleMenuRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExampleSelective(@Param("record") UmsRoleMenuRelation record, @Param("example") UmsRoleMenuRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExample(@Param("record") UmsRoleMenuRelation record, @Param("example") UmsRoleMenuRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKeySelective(UmsRoleMenuRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_role_menu_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKey(UmsRoleMenuRelation record);
}
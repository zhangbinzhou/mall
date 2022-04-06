package com.example.mallmbg.mapper;

import com.example.mallmbg.model.UmsMemberMemberTagRelation;
import com.example.mallmbg.model.UmsMemberMemberTagRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberMemberTagRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    long countByExample(UmsMemberMemberTagRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByExample(UmsMemberMemberTagRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insert(UmsMemberMemberTagRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insertSelective(UmsMemberMemberTagRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    List<UmsMemberMemberTagRelation> selectByExample(UmsMemberMemberTagRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    UmsMemberMemberTagRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExampleSelective(@Param("record") UmsMemberMemberTagRelation record, @Param("example") UmsMemberMemberTagRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExample(@Param("record") UmsMemberMemberTagRelation record, @Param("example") UmsMemberMemberTagRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKey(UmsMemberMemberTagRelation record);
}
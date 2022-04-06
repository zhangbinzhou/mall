package com.example.mallmbg.mapper;

import com.example.mallmbg.model.PmsComment;
import com.example.mallmbg.model.PmsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    long countByExample(PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByExample(PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insert(PmsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insertSelective(PmsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    List<PmsComment> selectByExampleWithBLOBs(PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    List<PmsComment> selectByExample(PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    PmsComment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExampleSelective(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExample(@Param("record") PmsComment record, @Param("example") PmsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKeySelective(PmsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(PmsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_comment
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKey(PmsComment record);
}
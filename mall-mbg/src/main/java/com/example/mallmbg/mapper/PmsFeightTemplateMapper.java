package com.example.mallmbg.mapper;

import com.example.mallmbg.model.PmsFeightTemplate;
import com.example.mallmbg.model.PmsFeightTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsFeightTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    long countByExample(PmsFeightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByExample(PmsFeightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insert(PmsFeightTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insertSelective(PmsFeightTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    List<PmsFeightTemplate> selectByExample(PmsFeightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    PmsFeightTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExampleSelective(@Param("record") PmsFeightTemplate record, @Param("example") PmsFeightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExample(@Param("record") PmsFeightTemplate record, @Param("example") PmsFeightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKeySelective(PmsFeightTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_feight_template
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKey(PmsFeightTemplate record);
}
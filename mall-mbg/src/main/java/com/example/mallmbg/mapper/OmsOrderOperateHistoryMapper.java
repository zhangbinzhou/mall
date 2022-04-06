package com.example.mallmbg.mapper;

import com.example.mallmbg.model.OmsOrderOperateHistory;
import com.example.mallmbg.model.OmsOrderOperateHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOrderOperateHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    long countByExample(OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByExample(OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insert(OmsOrderOperateHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int insertSelective(OmsOrderOperateHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    List<OmsOrderOperateHistory> selectByExample(OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExampleSelective(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByExample(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    int updateByPrimaryKey(OmsOrderOperateHistory record);
}
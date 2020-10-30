package com.zzyportals.dao;

import com.zzyportals.dataobject.ChineseMedicineDO;
import com.zzyportals.dataobject.ChineseMedicineDOKey;
import com.zzyportals.dataobject.ChineseMedicineDOWithBLOBs;

public interface ChineseMedicineDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_chinese_medicine
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int deleteByPrimaryKey(ChineseMedicineDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_chinese_medicine
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insert(ChineseMedicineDOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_chinese_medicine
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insertSelective(ChineseMedicineDOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_chinese_medicine
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    ChineseMedicineDOWithBLOBs selectByPrimaryKey(ChineseMedicineDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_chinese_medicine
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKeySelective(ChineseMedicineDOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_chinese_medicine
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(ChineseMedicineDOWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_culpro_chinese_medicine
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKey(ChineseMedicineDO record);
}
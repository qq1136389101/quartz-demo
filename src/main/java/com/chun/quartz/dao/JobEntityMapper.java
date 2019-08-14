package com.chun.quartz.dao;

import com.chun.quartz.model.JobEntity;
import java.util.List;

public interface JobEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_entity
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_entity
     *
     * @mbg.generated
     */
    int insert(JobEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_entity
     *
     * @mbg.generated
     */
    JobEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_entity
     *
     * @mbg.generated
     */
    List<JobEntity> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_entity
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(JobEntity record);
}
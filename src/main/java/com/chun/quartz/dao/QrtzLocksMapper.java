package com.chun.quartz.dao;

import com.chun.quartz.model.QrtzLocks;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzLocksMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_locks
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("lockName") String lockName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_locks
     *
     * @mbg.generated
     */
    int insert(QrtzLocks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_locks
     *
     * @mbg.generated
     */
    List<QrtzLocks> selectAll();
}
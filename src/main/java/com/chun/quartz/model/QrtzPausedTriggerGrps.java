package com.chun.quartz.model;

import java.io.Serializable;

public class QrtzPausedTriggerGrps implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_paused_trigger_grps.SCHED_NAME
     *
     * @mbg.generated
     */
    private String schedName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_paused_trigger_grps.TRIGGER_GROUP
     *
     * @mbg.generated
     */
    private String triggerGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table qrtz_paused_trigger_grps
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_paused_trigger_grps.SCHED_NAME
     *
     * @return the value of qrtz_paused_trigger_grps.SCHED_NAME
     *
     * @mbg.generated
     */
    public String getSchedName() {
        return schedName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_paused_trigger_grps.SCHED_NAME
     *
     * @param schedName the value for qrtz_paused_trigger_grps.SCHED_NAME
     *
     * @mbg.generated
     */
    public void setSchedName(String schedName) {
        this.schedName = schedName == null ? null : schedName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_paused_trigger_grps.TRIGGER_GROUP
     *
     * @return the value of qrtz_paused_trigger_grps.TRIGGER_GROUP
     *
     * @mbg.generated
     */
    public String getTriggerGroup() {
        return triggerGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_paused_trigger_grps.TRIGGER_GROUP
     *
     * @param triggerGroup the value for qrtz_paused_trigger_grps.TRIGGER_GROUP
     *
     * @mbg.generated
     */
    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup == null ? null : triggerGroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_paused_trigger_grps
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schedName=").append(schedName);
        sb.append(", triggerGroup=").append(triggerGroup);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
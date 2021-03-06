package com.chun.quartz.model;

import java.io.Serializable;

public class JobEntity implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_entity.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_entity.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_entity.group
     *
     * @mbg.generated
     */
    private String group;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_entity.cron
     *
     * @mbg.generated
     */
    private String cron;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_entity.parameter
     *
     * @mbg.generated
     */
    private String parameter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_entity.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_entity.vm_param
     *
     * @mbg.generated
     */
    private String vmParam;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_entity.jar_path
     *
     * @mbg.generated
     */
    private String jarPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job_entity.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table job_entity
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_entity.id
     *
     * @return the value of job_entity.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_entity.id
     *
     * @param id the value for job_entity.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_entity.name
     *
     * @return the value of job_entity.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_entity.name
     *
     * @param name the value for job_entity.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_entity.group
     *
     * @return the value of job_entity.group
     *
     * @mbg.generated
     */
    public String getGroup() {
        return group;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_entity.group
     *
     * @param group the value for job_entity.group
     *
     * @mbg.generated
     */
    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_entity.cron
     *
     * @return the value of job_entity.cron
     *
     * @mbg.generated
     */
    public String getCron() {
        return cron;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_entity.cron
     *
     * @param cron the value for job_entity.cron
     *
     * @mbg.generated
     */
    public void setCron(String cron) {
        this.cron = cron == null ? null : cron.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_entity.parameter
     *
     * @return the value of job_entity.parameter
     *
     * @mbg.generated
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_entity.parameter
     *
     * @param parameter the value for job_entity.parameter
     *
     * @mbg.generated
     */
    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_entity.description
     *
     * @return the value of job_entity.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_entity.description
     *
     * @param description the value for job_entity.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_entity.vm_param
     *
     * @return the value of job_entity.vm_param
     *
     * @mbg.generated
     */
    public String getVmParam() {
        return vmParam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_entity.vm_param
     *
     * @param vmParam the value for job_entity.vm_param
     *
     * @mbg.generated
     */
    public void setVmParam(String vmParam) {
        this.vmParam = vmParam == null ? null : vmParam.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_entity.jar_path
     *
     * @return the value of job_entity.jar_path
     *
     * @mbg.generated
     */
    public String getJarPath() {
        return jarPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_entity.jar_path
     *
     * @param jarPath the value for job_entity.jar_path
     *
     * @mbg.generated
     */
    public void setJarPath(String jarPath) {
        this.jarPath = jarPath == null ? null : jarPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job_entity.status
     *
     * @return the value of job_entity.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job_entity.status
     *
     * @param status the value for job_entity.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_entity
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", group=").append(group);
        sb.append(", cron=").append(cron);
        sb.append(", parameter=").append(parameter);
        sb.append(", description=").append(description);
        sb.append(", vmParam=").append(vmParam);
        sb.append(", jarPath=").append(jarPath);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
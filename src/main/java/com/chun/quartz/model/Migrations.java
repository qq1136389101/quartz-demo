package com.chun.quartz.model;

import java.io.Serializable;

public class Migrations implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column migrations.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column migrations.migration
     *
     * @mbg.generated
     */
    private String migration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column migrations.batch
     *
     * @mbg.generated
     */
    private Integer batch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table migrations
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column migrations.id
     *
     * @return the value of migrations.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column migrations.id
     *
     * @param id the value for migrations.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column migrations.migration
     *
     * @return the value of migrations.migration
     *
     * @mbg.generated
     */
    public String getMigration() {
        return migration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column migrations.migration
     *
     * @param migration the value for migrations.migration
     *
     * @mbg.generated
     */
    public void setMigration(String migration) {
        this.migration = migration == null ? null : migration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column migrations.batch
     *
     * @return the value of migrations.batch
     *
     * @mbg.generated
     */
    public Integer getBatch() {
        return batch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column migrations.batch
     *
     * @param batch the value for migrations.batch
     *
     * @mbg.generated
     */
    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table migrations
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
        sb.append(", migration=").append(migration);
        sb.append(", batch=").append(batch);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
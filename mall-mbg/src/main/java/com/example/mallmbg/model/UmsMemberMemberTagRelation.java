package com.example.mallmbg.model;

import java.io.Serializable;

public class UmsMemberMemberTagRelation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_member_tag_relation.id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_member_tag_relation.member_id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private Long memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ums_member_member_tag_relation.tag_id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private Long tagId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_member_tag_relation.id
     *
     * @return the value of ums_member_member_tag_relation.id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_member_tag_relation.id
     *
     * @param id the value for ums_member_member_tag_relation.id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_member_tag_relation.member_id
     *
     * @return the value of ums_member_member_tag_relation.member_id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_member_tag_relation.member_id
     *
     * @param memberId the value for ums_member_member_tag_relation.member_id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ums_member_member_tag_relation.tag_id
     *
     * @return the value of ums_member_member_tag_relation.tag_id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ums_member_member_tag_relation.tag_id
     *
     * @param tagId the value for ums_member_member_tag_relation.tag_id
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_member_tag_relation
     *
     * @mbg.generated Wed Feb 23 16:48:48 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", tagId=").append(tagId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.miiarms.mock.dao.po;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author miiarms
 * @since 2021-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sc_bc_user_type")
public class ScBcUserType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ID")
    private BigDecimal id;

    /**
     * 用户类型名称
     */
    @TableField("SC_BC_USER_TYPE")
    private String scBcUserType;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 乐观锁版本
     */
    @TableField("OPTIMISTIC_LOCK_VERSION")
    private Integer optimisticLockVersion;

    /**
     * 数据来源
     */
    @TableField("DATA_FROM")
    private String dataFrom;

    /**
     * 创建人ID
     */
    @TableField("CREATOR_ID")
    private String creatorId;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 修改人ID
     */
    @TableField("UPDATOR_ID")
    private String updatorId;

    /**
     * 更新时间
     */
    @TableField("UPDATED_TIME")
    private Date updatedTime;

    /**
     * 省编码
     */
    @TableField("PROVINCE_CODE")
    private String provinceCode;

    /**
     * 局编码
     */
    @TableField("BUREAU_CODE")
    private String bureauCode;


}

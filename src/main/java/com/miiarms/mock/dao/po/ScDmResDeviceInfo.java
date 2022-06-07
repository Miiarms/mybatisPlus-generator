package com.miiarms.mock.dao.po;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 设备信息表
 * </p>
 *
 * @author miiarms
 * @since 2021-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sc_dm_res_device_info")
public class ScDmResDeviceInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ID")
    private String id;

    /**
     * 序列号
     */
    @TableField("SORT_CODE")
    private String sortCode;

    /**
     * 设备名称
     */
    @TableField("DEVICE_NAME")
    private String deviceName;

    /**
     * 设备型号
     */
    @TableField("DEVICE_MODEL")
    private String deviceModel;

    /**
     * 设备品牌
     */
    @TableField("DEVICE_BRAND")
    private String deviceBrand;

    /**
     * 设备分类，1=人脸机，2=消费机
     */
    @TableField("DEVICE_TYPE")
    private Integer deviceType;

    /**
     * IP地址
     */
    @TableField("IP_ADDRESS")
    private String ipAddress;

    /**
     * 端口号
     */
    @TableField("PORT_CODE")
    private String portCode;

    /**
     * 设备管理员账号
     */
    @TableField("ADMIN_ACCOUNT")
    private String adminAccount;

    /**
     * 设备管理员账号密码
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * 状态，1=启用，2=停用
     */
    @TableField("STATUS")
    private Integer status;

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

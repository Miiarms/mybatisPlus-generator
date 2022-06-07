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
 * 人员信息表（包括南网所有正式员工、外派员工，园区企业员工）
 * </p>
 *
 * @author miiarms
 * @since 2021-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sc_bc_use_employee")
public class ScBcUseEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ID")
    private String id;

    /**
     * JADP用户ID
     */
    @TableField("USER_ID")
    private String userId;

    /**
     * 登录账号(JADP)
     */
    @TableField("LOGIN_ACCOUNT")
    private String loginAccount;

    /**
     * 用户姓名
     */
    @TableField("EMPLOYEE_NAME")
    private String employeeName;

    /**
     * 密文密码(JADP)
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * 用户类型，关联用户类型表ID
     */
    @TableField("USER_TYPE")
    private Integer userType;

    /**
     * 所属机构ID
     */
    @TableField("ORG_ID")
    private String orgId;

    /**
     * 性别,1-男,2-女
     */
    @TableField("SEX")
    private Integer sex;

    /**
     * 手机号码
     */
    @TableField("MOBILE")
    private String mobile;

    /**
     * 身份证号
     */
    @TableField("ID_CARD")
    private String idCard;

    /**
     * 电子邮箱
     */
    @TableField("EMAIL")
    private String email;

    /**
     * 生效日期
     */
    @TableField("EFFECT_DATE")
    private Date effectDate;

    /**
     * 失效日期
     */
    @TableField("EXPIRY_DATE")
    private Date expiryDate;

    /**
     * 人脸存在的bucket 库，1=南网员工中心，2=自建
     */
    @TableField("STORE_BUCKET")
    private Integer storeBucket;

    /**
     * 人脸存在oss的唯一id
     */
    @TableField("FACE_ID")
    private String faceId;

    /**
     * 是否有外购资格 1=有，2=没有，默认有
     */
    @TableField("HAS_OUT_BUY")
    private Integer hasOutBuy;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 状态，1-正常，2-锁定，3-注销
     */
    @TableField("STATUS")
    private Integer status;

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

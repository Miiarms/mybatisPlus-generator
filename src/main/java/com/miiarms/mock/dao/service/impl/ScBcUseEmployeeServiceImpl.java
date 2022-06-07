package com.miiarms.mock.dao.service.impl;

import com.miiarms.mock.dao.po.ScBcUseEmployee;
import com.miiarms.mock.dao.mapper.ScBcUseEmployeeMapper;
import com.miiarms.mock.dao.service.IScBcUseEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 人员信息表（包括南网所有正式员工、外派员工，园区企业员工） 服务实现类
 * </p>
 *
 * @author miiarms
 * @since 2021-07-20
 */
@Service
public class ScBcUseEmployeeServiceImpl extends ServiceImpl<ScBcUseEmployeeMapper, ScBcUseEmployee> implements IScBcUseEmployeeService {

}

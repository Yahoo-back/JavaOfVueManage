package com.hyy.ifm.service;

import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.QudaoParam;
import com.hyy.ifm.dto.UserManageParam;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 用户Service
 * Created by macro on 2019/08/29.
 */
public interface UserService {

    /**
     * 查询所有渠道员工
     */
    List<Map<String,Object>> qryUserListByType(UserManageParam qudao, Integer pageSize, Integer pageNum);

    /**
     * 保存
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    CommonResult saveUserQudao(QudaoParam slQdao);
}

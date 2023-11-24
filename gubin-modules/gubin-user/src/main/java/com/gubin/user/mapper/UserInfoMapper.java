package com.gubin.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gubin.user.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author GuBin
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}

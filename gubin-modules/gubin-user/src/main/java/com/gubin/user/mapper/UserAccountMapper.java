package com.gubin.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gubin.user.domain.UserAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author GuBin
 */
@Mapper
public interface UserAccountMapper extends BaseMapper<UserAccount> {

    Boolean updateUserAccount(@Param("userId") Integer userId,@Param("changeAmount") BigDecimal changeAmount);

}

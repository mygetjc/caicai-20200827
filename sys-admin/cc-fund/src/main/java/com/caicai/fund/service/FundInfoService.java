package com.caicai.fund.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.caicai.fund.entity.po.FundInfo;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author jc
 * @since 2020-08-24
 */
public interface FundInfoService extends IService<FundInfo> {

    boolean add(FundInfo fundInfo);
}

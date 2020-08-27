package com.caicai.fund.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caicai.fund.dao.FundInfoDao;
import com.caicai.fund.entity.po.FundInfo;
import com.caicai.fund.service.FundInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jc
 * @since 2020-08-24
 */
@Service
public class FundInfoServiceImpl extends ServiceImpl<FundInfoDao, FundInfo> implements FundInfoService {

    @Override
    public boolean add(FundInfo fundInfo) {
        return false;
    }
}

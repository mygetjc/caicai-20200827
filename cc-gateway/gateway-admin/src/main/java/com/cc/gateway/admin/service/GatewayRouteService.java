package com.cc.gateway.admin.service;

import com.cc.gateway.admin.entity.param.GatewayRouteQueryParam;
import com.cc.gateway.admin.entity.po.GatewayRoute;
import com.cc.gateway.admin.entity.vo.GatewayRouteVo;

import java.util.List;

/**
 * @author 江成
 * @version 1.0.0
 * @date 2020/8/31 09:35
 */
public interface GatewayRouteService {

    /**
     * 获取网关路由
     *
     * @param id
     * @return
     */
    GatewayRoute get(String id);

    /**
     * 新增网关路由
     *
     * @param gatewayRoute
     * @return
     */
    boolean add(GatewayRoute gatewayRoute);

    /**
     * 查询网关路由
     *
     * @return
     */
    List<GatewayRouteVo> query(GatewayRouteQueryParam gatewayRouteQueryParam);

    /**
     * 更新网关路由信息
     *
     * @param gatewayRoute
     */
    boolean update(GatewayRoute gatewayRoute);

    /**
     * 根据id删除网关路由
     *
     * @param id
     */
    boolean delete(String id);

    /**
     * 重新加载网关路由配置到redis
     *
     * @return 成功返回true
     */
    boolean overload();
}

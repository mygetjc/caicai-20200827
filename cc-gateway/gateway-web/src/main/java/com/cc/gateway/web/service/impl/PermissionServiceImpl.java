package com.cc.gateway.web.service.impl;

import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;
import com.cc.auth.client.service.AuthService;
import com.cc.gateway.web.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author 江成
 * @version 1.0.0
 * @date 2020/8/31 10:48
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    /**
     * 由authentication-client模块提供签权的feign客户端
     */
    @Autowired
    private AuthService authService;

    @Override
    @Cached(name = "gateway_auth::", key = "#authentication+#method+#url",
            cacheType = CacheType.LOCAL, expire = 10, timeUnit = TimeUnit.SECONDS, localLimit = 10000)
    public boolean permission(String authentication, String url, String method) {
        return authService.hasPermission(authentication, url, method);
    }
}

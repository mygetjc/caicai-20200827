package com.cc.gateway.web.service;

/**
 * @author 江成
 * @version 1.0.0
 * @date 2020/8/31 10:47
 */
public interface PermissionService {
    boolean permission(String authentication, String url, String method);
}

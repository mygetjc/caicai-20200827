package com.cc.gateway.web.service;

import org.springframework.cloud.gateway.route.RouteDefinition;

import java.util.Collection;

/**
 * @author 江成
 * @version 1.0.0
 * @date 2020/8/31 10:44
 */
public interface RouteService {
    Collection<RouteDefinition> getRouteDefinitions();

    boolean save(RouteDefinition routeDefinition);

    boolean delete(String routeId);
}

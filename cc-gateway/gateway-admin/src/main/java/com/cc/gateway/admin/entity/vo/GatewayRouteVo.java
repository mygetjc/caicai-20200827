package com.cc.gateway.admin.entity.vo;


import com.cc.gateway.admin.entity.po.FilterDefinition;
import com.cc.gateway.admin.entity.po.GatewayRoute;
import com.cc.gateway.admin.entity.po.PredicateDefinition;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Slf4j
public class GatewayRouteVo {
    private String id;
    private String routeId;
    private String description;
    private String status;
    private String uri;
    private Integer orders;
    private String createdBy;
    private Date createdTime;
    private String updatedBy;
    private Date updatedTime;
    private List<FilterDefinition> filters = new ArrayList<>();
    private List<PredicateDefinition> predicates = new ArrayList<>();

    public GatewayRouteVo(String id, String routeId, String description, String status, String uri, Integer orders, String createdBy, Date createdTime, String updatedBy, Date updatedTime, List<FilterDefinition> filters, List<PredicateDefinition> predicates) {
        this.id = id;
        this.routeId = routeId;
        this.description = description;
        this.status = status;
        this.uri = uri;
        this.orders = orders;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.filters = filters;
        this.predicates = predicates;
    }

    public GatewayRouteVo(GatewayRoute gatewayRoute) {
        this.id = gatewayRoute.getId();
        this.routeId = routeId;
        this.description = description;
        this.status = status;
        this.uri = uri;
        this.orders = orders;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.filters = filters;
        this.predicates = predicates;    }
}

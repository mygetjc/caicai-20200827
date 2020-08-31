package com.cc.gateway.admin.Controller;


import com.cc.core.entity.Result;
import com.cc.gateway.admin.entity.vo.GatewayRouteVo;
import com.cc.gateway.admin.entity.param.GatewayRouteQueryParam;
import com.cc.gateway.admin.service.GatewayRouteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jacky
 */
@RestController
@RequestMapping("/gateway/routes")
@Api("gateway routes")
@Slf4j
public class GatewayRouteController {

    @Resource
    private GatewayRouteService gatewayRoutService;

//    @ApiOperation(value = "新增网关路由", notes = "新增一个网关路由")
//    @ApiImplicitParam(name = "gatewayRoutForm", value = "新增网关路由form表单", required = true, dataType = "GatewayRouteForm")
//    @PostMapping
//    public Result add(@Valid @RequestBody GatewayRouteForm gatewayRoutForm) {
//        log.info("name:", gatewayRoutForm);
//        GatewayRoute gatewayRout = gatewayRoutForm.toPo(GatewayRoute.class);
//        return Result.success(gatewayRoutService.add(gatewayRout));
//    }

    @ApiOperation(value = "删除网关路由", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(paramType = "path", name = "id", value = "网关路由ID", required = true, dataType = "long")
    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable String id) {
        return Result.success(gatewayRoutService.delete(id));
    }

//    @ApiOperation(value = "修改网关路由", notes = "修改指定网关路由信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "id", value = "网关路由ID", required = true, dataType = "long"),
//            @ApiImplicitParam(name = "gatewayRoutForm", value = "网关路由实体", required = true, dataType = "GatewayRouteForm")
//    })
//    @PutMapping(value = "/{id}")
//    public Result update(@PathVariable String id, @Valid @RequestBody GatewayRouteForm gatewayRoutForm) {
//        GatewayRoute gatewayRout = gatewayRoutForm.toPo(GatewayRoute.class);
//        gatewayRout.setId(id);
//        return Result.success(gatewayRoutService.update(gatewayRout));
//    }

    @ApiOperation(value = "获取网关路由", notes = "根据id获取指定网关路由信息")
    @ApiImplicitParam(paramType = "path", name = "id", value = "网关路由ID", required = true, dataType = "long")
    @GetMapping(value = "/{id}")
    public Result get(@PathVariable String id) {
        log.info("get with id:{}", id);
        return Result.success(new GatewayRouteVo(gatewayRoutService.get(id)));
    }

    @ApiOperation(value = "根据uri获取网关路由", notes = "根据uri获取网关路由信息，简单查询")
    @ApiImplicitParam(paramType = "query", name = "name", value = "网关路由路径", required = true, dataType = "string")
    @ApiResponses(
            @ApiResponse(code = 200, message = "处理成功", response = Result.class)
    )
    @GetMapping
    public Result getByUri(@RequestParam String uri) {
        return Result.success(gatewayRoutService.query(new GatewayRouteQueryParam(uri)).stream().findFirst());
    }

//    @ApiOperation(value = "搜索网关路由", notes = "根据条件查询网关路由信息")
//    @ApiImplicitParam(name = "gatewayRoutQueryForm", value = "网关路由查询参数", required = true, dataType = "GatewayRouteQueryForm")
//    @ApiResponses(
//            @ApiResponse(code = 200, message = "处理成功", response = Result.class)
//    )
//    @PostMapping(value = "/conditions")
//    public Result search(@Valid @RequestBody GatewayRouteQueryForm gatewayRouteQueryForm) {
//        return Result.success(gatewayRoutService.query(gatewayRouteQueryForm.toParam(GatewayRouteQueryParam.class)));
//    }

    @ApiOperation(value = "重载网关路由", notes = "将所以网关的路由全部重载到redis中")
    @ApiResponses(
            @ApiResponse(code = 200, message = "处理成功", response = Result.class)
    )
    @PostMapping(value = "/overload")
    public Result overload() {
        return Result.success(gatewayRoutService.overload());
    }


}
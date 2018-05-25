package com.yhl.rest;

import com.yhl.model.entity.User;
import com.yhl.service.UserServiceI;
import io.swagger.annotations.*;
import org.restful.api.filter.authority.AuthType;
import org.restful.api.filter.authority.Authority;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author 袁华
 * @date 2018/5/25 16:08
 */
@Path("/user")
@Api(value = "数据分析接口", hidden = true)
@ApiImplicitParams({@ApiImplicitParam(name = "ACCESS_TOKEN", value = "接口调用凭证", dataType = "string", required = true, paramType = "query")})
@ApiResponses({@ApiResponse(code = 600, message = "登录状态失效"), @ApiResponse(code = 401, message = "权限不足")})
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserApi {
    @Autowired
    private UserServiceI service;

    @GET
    @Path("/getId/{id}")
    @ApiOperation(value = "根据id查询用户信息")
    @Authority({AuthType.所有权限})
    public User getPayByDay(@PathParam("id") Integer id) {
        return service.getId(id);
    }
}

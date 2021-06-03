package com.zheqiushui.dockerworld.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Api(tags = "Statistic Info query service")
@RestController
@RequestMapping("/statisticInfoQuery")
public class StatisticInfoQueryService {

    @ApiOperation("Get Database Statistic")
    @ApiImplicitParams(
            {
                  @ApiImplicitParam(name = "dbName", value = "dbName")
            }
    )
    @RequestMapping(value = "/getDataBaseStatistic", method = RequestMethod.GET)
    public String getDataBaseStatistic() {

        return "this is test";
    }
}

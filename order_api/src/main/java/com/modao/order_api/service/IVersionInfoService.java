package com.modao.order_api.service;

import com.modao.order_api.model.VersionInfo;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 版本信息接口定义规范
 */
public interface IVersionInfoService {
    //提供方法:  1.增加某个系统下的某个版本号  2.查看某个系统下是否有某个版本号  3.修改某个版本内容  4.删除某个版本

    /**
     * 新增一条版本数据
     * @param versionInfo 版本数据
     */
    public void addVersionInfo(@RequestParam VersionInfo versionInfo);

    /**
     * 根据版本id得到版本数据(单个)
     * @param versionId 版本id
     * @return 单个版本数据
     */
    public VersionInfo getVersionInfo(@RequestParam("versionId") String versionId);

    /**
     * 根据版本id in查询得到多个版本数据
     * @param versionIds 版本id集合
     * @return 多个版本数据list
     */
    public List<VersionInfo> getVersionInfoList(@RequestParam("versionIds") String versionIds);
}

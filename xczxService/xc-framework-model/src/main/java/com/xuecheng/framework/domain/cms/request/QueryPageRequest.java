package com.xuecheng.framework.domain.cms.request;

import lombok.Data;

/**
 * Created by Mr Li
 * 2019/6/14 8:03
 */
@Data
public class QueryPageRequest {
    //接收页面查询的查询条件
    //站点id
    private String siteId;
    //页面Id
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模板Id
    private String templateId;
    //......
}

package com.example.playandroid.api;

/**
 * @author created by 陆向阳 on 2019/3/21
 */
public class BaseMethod {

    /**
     * 获取公众号列表
     * GET
     * @param 公众号ID:拼接在url中,eg:405
     * @param 公众号页码:拼接在url中,eg:1
     * @example https://wanandroid.com/wxarticle/chapters/json
     */
    public static final String PUBLIC_ADDRESS_LIST_GET = "wxarticle/chapters/json";
    /**
     * 查看某个公众号历史数据
     * GET
     * @param k:字符串,eg:Java
     * @param 公众号ID:拼接在url中,eg:405
     * @param 公众号页码:拼接在url中,eg:1
     * @example https://wanandroid.com/wxarticle/list/408/1/json
     */
    public static final String PUBLIC_ADDRESS_HISTORY_DATA_GET = "wxarticle/list";
    /**
     * 在某个公众号中搜索历史文章
     * GET
     * @param k : 字符串，eg:Java
     * @param 公众号 ID：拼接在 url 中，eg:405
     * @param 公众号页码：拼接在url 中，eg:1
     * @example https://wanandroid.com/wxarticle/list/405/1/json?k=Java
     */
    public static final String PUBLIC_ADDRESS_SEARCH_ARTICLE_GET = "wxarticle/list";
    /**
     * 最新项目tab (首页的第二个tab)
     * 按时间分页展示所有项目。
     * GET
     * @param 页码，拼接在连接中，从0开始。
     * @example https://wanandroid.com/article/listproject/0/json
     */
    public static final String THE_NEWEST_TAB = "article/listproject";
    /**
     * 首页文章列表
     * GET
     * @param 页码，拼接在连接中，从0开始。
     * @example https://www.wanandroid.com/article/list/0/json
     */
    public static final String ARTICLE_LIST = "article/list";
    /**
     * 首页banner
     * GET
     * @example https://www.wanandroid.com/banner/json
     */
    public static final String BANNER = "banner/json";
    /**
     * 常用网站
     * GET
     * @example https://www.wanandroid.com/friend/json
     */
    public static final String COMMON_USE_WEBSITE = "friend/json";
    /**
     * 体系数据
     * GET
     * @example https://www.wanandroid.com/tree/json
     */
    public static final String SYSTEM_DATA = "tree/json";
    /**
     * 知识体系下的文章
     * GET
     * @param cid 分类的id，上述二级目录的id
     * @param 页码：拼接在链接上，从0开始。
     * @example https://www.wanandroid.com/article/list/0/json?cid=60
     */
    public static final String KNOWLEDGE_HIERARCHY = "article/list/json";
    /**
     * 导航数据
     * GET
     * @example https://www.wanandroid.com/navi/json
     */
    public static final String NAVIGATION_DATA = "navi/json";
    /**
     * 项目分类
     * GET
     * @example https://www.wanandroid.com/project/tree/json
     */
    public static final String PROGRAM_CLASSIFY = "project/tree/json";
    /**
     * 项目列表数据
     * GET
     * @param cid 分类的id，上面项目分类接口
     * @param 页码：拼接在链接中，从1开始。
     * @example https://www.wanandroid.com/project/list/1/json?cid=294
     */
    public static final String PROGRAM_LIST_DATA = "project/list/json";
    /**
     * 登录
     * POST
     * @param username
     * @param password
     * @example https://www.wanandroid.com/user/login
     */
    public static final String LOGIN = "user/login";
    /**
     * 注册
     * POST
     * @param username
     * @param password
     * @param repassword
     * @example https://www.wanandroid.com/user/register
     */
    public static final String REGISTER = "user/register";
    /**
     * 退出
     * GET
     * @example https://www.wanandroid.com/user/logout/json
     */
    public static final String LOGIN_OUT = "user/logout/json";
    /**
     * 收藏文章列表
     * GET
     * @param 页码：拼接在链接中，从0开始。
     * @example https://www.wanandroid.com/lg/collect/list/0/json
     */
    public static final String COLLECT_ARTICLE_LIST = "lg/collect/list/";
    /**
     * 收藏站内文章
     * POST
     * @param 文章id，拼接在链接中。
     * @example https://www.wanandroid.com/lg/collect/1165/json
     */
    public static final String COLLECT_INSIDE_ARTICLE = "lg/collect/";
    /**
     * 收藏站外文章
     * POST
     * @param title
     * @param author
     * @param link
     * @example https://www.wanandroid.com/lg/collect/add/json
     */
    public static final String COLLECT_OUTER_ARTILCE = "lg/collect/add/json";
    //取消收藏
    //取消收藏一共有两个地方可以触发：
    /**
     * 文章列表
     * POST
     * @param id:拼接在链接上
     * @example https://www.wanandroid.com/lg/uncollect_originId/2333/json
     */
    public static final String CANCEL_COLLECT_ARTICLE_LIST = "lg/uncollect_originId";
    /**
     * 我的收藏页面（该页面包含自己录入的内容）
     * POST
     * @param id:拼接在链接上
     * @param originId:列表页下发，无则为-1
     * @example https://www.wanandroid.com/lg/uncollect/2805/json
     */
    public static final String CANCEL_COLLECT_MY_COLLECT_PAGE = "lg/uncollect";
    /**
     * 收藏网站列表
     * GET
     * @example https://www.wanandroid.com/lg/collect/usertools/json
     */
    public static final String COLLECT_WEBSITE_LIST = "lg/collect/usertools/json";
    /**
     * 收藏网址
     * POST
     * @param name
     * @param link
     * @example https://www.wanandroid.com/lg/collect/addtool/json
     */
    public static final String COLLECT_WEBSITE = "lg/collect/addtool/json";
    /**
     * 编辑收藏网站
     * POST
     * @param id
     * @param name
     * @param link
     * @example https://www.wanandroid.com/lg/collect/updatetool/json
     */
    public static final String EDIT_COLLECT_WEBSITE = "lg/collect/updatetool/json";
    /**
     * 删除收藏网站
     * POST
     * @param id
     * @example https://www.wanandroid.com/lg/collect/deletetool/json
     */
    public static final String DELETE_COLLECT_WEBSITE = "lg/collect/deletetool/json";
    /**
     * 搜索
     * POST
     * @param 页码：拼接在链接上，从0开始。
     * @param k ： 搜索关键词
     * @example https://www.wanandroid.com/article/query/0/json
     */
    public static final String SEARCH = "article/query";
    /**
     * 新增一条Todo
     * POST
     * @param title: 新增标题
     * @param content: 新增详情
     * @param date: 2018-08-01
     * @param type: 0
     * @example https://www.wanandroid.com/lg/todo/add/json
     */
    public static final String ADD_TODO = "lg/todo/add/json";
    /**
     * 更新一条Todo内容
     * POST
     * @param id: 拼接在链接上，为唯一标识
     * @param title: 更新标题
     * @param content: 新增详情
     * @param date: 2018-08-01
     * @param status: 0 // 0为未完成，1为完成
     * @param type: 0
     * @example https://www.wanandroid.com/lg/todo/update/83/json
     */
    public static final String UPDATA_TODO = "lg/todo/update";
    /**
     * 删除一条Todo
     * POST
     * @example https://www.wanandroid.com/lg/todo/delete/83/json
     */
    public static final String DELETE_TODO = "lg/todo/delete";
    /**
     * 未完成 Todo 列表
     * POST
     * @param 类型：类型拼接在链接上，目前支持0,1,2,3
     * @param 页码: 拼接在链接上，从1开始；c
     * @example https://www.wanandroid.com/lg/todo/listnotdo/0/json/1
     * @example https://www.wanandroid.com/lg/todo/listnotdo/类型/json/页码
     */
    public static final String NO_COMPELETE_TODO_LIST = "lg/todo/listnotdo";
    /**
     * 已完成 Todo 列表
     * POST
     * @param 类型：类型拼接在链接上，目前支持0,1,2,3
     * @param 页码: 拼接在链接上，从1开始；
     * @example https://www.wanandroid.com/lg/todo/listdone/0/json/1
     * @example https://www.wanandroid.com/lg/todo/listdone/类型/json/页码
     */
    public static final String COMPLETE_TODO_LIST = "lg/todo/listdone";
}

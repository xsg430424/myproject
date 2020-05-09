package com.jinjue.common.utils;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Optional;

/**
 * 用户上下文
 */
public class UserContextHolder {

    private ThreadLocal<Map<String, Object>> threadLocalUser;


    private UserContextHolder() {
        this.threadLocalUser = new ThreadLocal<>();
    }

    /**
     * 创建实例
     *
     * @return
     */
    public static UserContextHolder getInstance() {
        return SingletonHolder.sInstance;
    }

    /**
     * 静态内部类单例模式
     * 单例初使化
     */
    private static class SingletonHolder {
        private static final UserContextHolder sInstance = new UserContextHolder();
    }

    /**
     * 用户上下文中放入信息
     *
     * @param map
     */
    public void setContext(Map<String, Object> map) {
        threadLocalUser.set(Optional.ofNullable(map).orElse(Maps.newHashMap()));
    }

    /**
     * 获取上下文中的信息
     *
     * @return
     */
    public Map<String, Object> getContext() {
        return threadLocalUser.get();
    }

    /**
     * 获取上下文中的用户名
     *
     * @return
     */
    public String getUsername() {
        //return Optional.ofNullable(threadLocal.get()).orElse(Maps.newHashMap()).get("user_name");
        return (String) Optional.ofNullable(threadLocalUser.get()).orElse(Maps.newHashMap()).getOrDefault("username","default_name");
    }

    /**
     * 获取系统ID
     *
     * @return
     */
    public Integer getUsId() {
        return (Integer) Optional.ofNullable(threadLocalUser.get()).orElse(Maps.newHashMap()).getOrDefault("systemCode","1");
    }
    /**
     * 获取上下文中的用户名
     * @return
     */
    public String getUserId() {
        return String.valueOf(Optional.ofNullable(threadLocalUser.get()).orElse(Maps.newHashMap()).getOrDefault("userId","1"));
    }
    
     /**
     　　* @description: 
     　　* @param 获取用户角色
     　　* @return 
     　　* @author 张开顺
     　　* @date 2019/3/14 17:51 
     　　*/
    public Integer getUserRoleId() {
        return (Integer)Optional.ofNullable(threadLocalUser.get()).orElse(Maps.newHashMap()).getOrDefault("roleId",1);
    }
    
     /**
     　　* @description: 
     　　* @param 获取用户所在公司id
     　　* @return 
     　　* @author 张开顺
     　　* @date 2019/3/19 14:07 
     　　*/
    public Integer getUserUcId() {
        return (Integer)Optional.ofNullable(threadLocalUser.get()).orElse(Maps.newHashMap()).getOrDefault("ucId",1);
    }
     /**
     　　* @description: 
     　　* @param 获取用户部门id
     　　* @return 
     　　* @author 张开顺
     　　* @date 2019/3/18 10:10 
     　　*/
    public Integer getUserDepartmentId() {
        return (Integer)Optional.ofNullable(threadLocalUser.get()).orElse(Maps.newHashMap()).getOrDefault("departmentId",1);
    }

     /**
     　　* @description:
     　　* @param 获取用户职位id
     　　* @return
     　　* @author 张开顺
     　　* @date 2019/3/18 10:11
     　　*/
    public Integer getUserPositionId() {
        return (Integer)Optional.ofNullable(threadLocalUser.get()).orElse(Maps.newHashMap()).getOrDefault("positionId",1);
    }

    /**
     * 清空上下文
     */
    public void clear() {
        threadLocalUser.remove();
    }

}

package com.sfc.es.service;

import com.sfc.common.util.page.PageInfo;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.ScheduleParam;
import com.sfc.es.entity.param.ScheduleSearchParam;
import com.sfc.es.entity.po.Schedule;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface ScheduleService {
    PageInfo<Schedule> findPageInfo(ScheduleSearchParam param, Page page);
    List<Schedule> findAll();
    List<Schedule> find(ScheduleSearchParam param);
    Schedule findById(Integer id);
    Schedule insert(ScheduleParam param);
    Schedule update(ScheduleParam param);
    int deleteById(Integer id);
    void deleteBatch(Integer[] ids);
}
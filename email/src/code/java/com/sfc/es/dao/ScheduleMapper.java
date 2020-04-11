package com.sfc.es.dao;

import com.sfc.es.entity.po.Schedule;
import java.util.List;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface ScheduleMapper {
    List<Schedule> findPageInfo(Schedule schedule);
    Schedule findById(Integer id);
    int insert(Schedule schedule);
    int insertBatch(List<Schedule> list);
    int update(Schedule schedule);
    int delete(Schedule schedule);
}
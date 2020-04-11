package com.sfc.es.service.impl;

import com.github.pagehelper.PageHelper;
import com.sfc.common.core.util.UserContextHolder;
import com.sfc.common.util.page.PageInfo;
import com.sfc.es.dao.ScheduleMapper;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.ScheduleParam;
import com.sfc.es.entity.param.ScheduleSearchParam;
import com.sfc.es.entity.po.Schedule;
import com.sfc.es.service.ScheduleService;
import com.sfc.es.util.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Service
@Slf4j
public class ScheduleServiceImpl implements ScheduleService {
	@Autowired
	private ScheduleMapper scheduleMapper;

	@Override
	public PageInfo<Schedule> findPageInfo(ScheduleSearchParam param, Page page) {
		Schedule schedule = BeanUtil.copyObject(param, Schedule.class);
		schedule.setStatus(1);
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		return new PageInfo<>(scheduleMapper.findPageInfo(schedule));
	}

	@Override
	public List<Schedule> findAll() {
		List<Schedule> list = scheduleMapper.findPageInfo(new Schedule());
		return list;
	}

	@Override
	public List<Schedule> find(ScheduleSearchParam param) {
		Schedule schedule = BeanUtil.copyObject(param, Schedule.class);
		List<Schedule> list = scheduleMapper.findPageInfo(schedule);
		return list;
	}

	@Override
	public Schedule findById(Integer id) {
		return scheduleMapper.findById(id);
	}

	@Override
	public Schedule insert(ScheduleParam param){
		Schedule schedule = BeanUtil.copyObject(param, Schedule.class);
		schedule.setCreateBy(UserContextHolder.getInstance().getUserId());
		schedule.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = scheduleMapper.insert(schedule);
        if(count == 0){
            return null;
        }
        return schedule;
	}

    @Override
	public Schedule update(ScheduleParam param) {
		Schedule schedule = BeanUtil.copyObject(param, Schedule.class);
		schedule.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = scheduleMapper.update(schedule);
		if(count == 0){
            return null;
        }
        return schedule;
	}

    @Override
    public int deleteById(Integer id) {
    	Schedule schedule=new Schedule();
		schedule.setId(id);
		schedule.setUpdateBy(UserContextHolder.getInstance().getUserId());
    	return scheduleMapper.delete(schedule);
    }

	@Transactional
	@Override
	public void deleteBatch(Integer[] ids) {
		for (Integer id : ids) {
			deleteById(id);
		}
	}

}

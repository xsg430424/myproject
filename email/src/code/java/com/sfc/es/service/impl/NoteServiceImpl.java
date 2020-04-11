package com.sfc.es.service.impl;

import com.github.pagehelper.PageHelper;
import com.sfc.common.core.util.UserContextHolder;
import com.sfc.common.util.page.PageInfo;
import com.sfc.es.dao.NoteMapper;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.NoteParam;
import com.sfc.es.entity.param.NoteSearchParam;
import com.sfc.es.entity.po.Note;
import com.sfc.es.service.NoteService;
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
public class NoteServiceImpl implements NoteService {
	@Autowired
	private NoteMapper noteMapper;

	@Override
	public PageInfo<Note> findPageInfo(NoteSearchParam param, Page page) {
		Note note = BeanUtil.copyObject(param, Note.class);
		note.setStatus(1);
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		return new PageInfo<>(noteMapper.findPageInfo(note));
	}

	@Override
	public List<Note> findAll() {
		List<Note> list = noteMapper.findPageInfo(new Note());
		return list;
	}

	@Override
	public List<Note> find(NoteSearchParam param) {
		Note note = BeanUtil.copyObject(param, Note.class);
		List<Note> list = noteMapper.findPageInfo(note);
		return list;
	}

	@Override
	public Note findById(Integer id) {
		return noteMapper.findById(id);
	}

	@Override
	public Note insert(NoteParam param){
		Note note = BeanUtil.copyObject(param, Note.class);
		note.setCreateBy(UserContextHolder.getInstance().getUserId());
		note.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = noteMapper.insert(note);
        if(count == 0){
            return null;
        }
        return note;
	}

    @Override
	public Note update(NoteParam param) {
		Note note = BeanUtil.copyObject(param, Note.class);
		note.setUpdateBy(UserContextHolder.getInstance().getUserId());
		int count = noteMapper.update(note);
		if(count == 0){
            return null;
        }
        return note;
	}

    @Override
    public int deleteById(Integer id) {
    	Note note=new Note();
		note.setId(id);
		note.setUpdateBy(UserContextHolder.getInstance().getUserId());
    	return noteMapper.delete(note);
    }

	@Transactional
	@Override
	public void deleteBatch(Integer[] ids) {
		for (Integer id : ids) {
			deleteById(id);
		}
	}

}

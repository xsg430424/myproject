package com.sfc.es.service;

import com.sfc.common.util.page.PageInfo;
import com.sfc.es.entity.common.Page;
import com.sfc.es.entity.param.NoteParam;
import com.sfc.es.entity.param.NoteSearchParam;
import com.sfc.es.entity.po.Note;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface NoteService {
    PageInfo<Note> findPageInfo(NoteSearchParam param, Page page);
    List<Note> findAll();
    List<Note> find(NoteSearchParam param);
    Note findById(Integer id);
    Note insert(NoteParam param);
    Note update(NoteParam param);
    int deleteById(Integer id);
    void deleteBatch(Integer[] ids);
}
package com.sfc.es.dao;

import com.sfc.es.entity.po.Note;
import java.util.List;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
public interface NoteMapper {
    List<Note> findPageInfo(Note note);
    Note findById(Integer id);
    int insert(Note note);
    int insertBatch(List<Note> list);
    int update(Note note);
    int delete(Note note);
}
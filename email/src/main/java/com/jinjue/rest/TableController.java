package com.sfc.es.rest;

import com.sfc.es.dao.TableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @des TODO
 * @date 2019/9/1 11:18
 * @auther xiaoshuigeng
 */
@RestController
@RequestMapping("/table")
public class TableController {
    @Autowired
    private TableDao tableDao;

    @RequestMapping("/list")
    public String list(String id) {
        System.out.println(tableDao.listTable());
        return "";
    }
    @RequestMapping("/columns")
    public String info(String tableName) {
        System.out.println(tableDao.listTableColumn(tableName));
        return "";
    }
}

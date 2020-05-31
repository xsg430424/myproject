package com.jinjue.demo.excel;


import com.jinjue.demo.excel.pojo.UserRightExportVo;
import com.jinjue.demo.excel.util.ExcelUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Service
//@Slf4j
public class UserPositionService {
    public void exportRights2CsvByUpId() {
        List<UserRightExportVo> userRightExportVos =new ArrayList<>();
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("userRightExportVos", userRightExportVos);
        ExcelUtil.export("excel/tempUserRight.xlsx", "tempUserRight" + ".xlsx", dataMap);
    }
}

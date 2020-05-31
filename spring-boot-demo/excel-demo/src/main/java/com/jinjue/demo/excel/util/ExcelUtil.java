package com.jinjue.demo.excel.util;

import net.sf.jxls.transformer.XLSTransformer;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/** web项目下导出 */
public class ExcelUtil {
  private String basePath = "excel";

  /**
   * excel导出
   *
   * @param tempPath
   * @param destFileName
   * @param beans
   */
  public static void export(String tempPath, String destFileName, Map<String, Object> beans) {
    HttpServletResponse response = ContextUtil.getResponse();
    InputStream inputStream = ExcelUtil.class.getClassLoader().getResourceAsStream(tempPath);
    XLSTransformer transformer = new XLSTransformer();
    OutputStream out = null;
    // 设置响应

    try {
      response.setHeader(
          "Content-Disposition",
          "attachment;filename=" + new String(destFileName.getBytes("UTF-8"), "ISO-8859-1"));
      response.setContentType("application/vnd.ms-excel");
      Workbook workbook = transformer.transformXLS(inputStream, beans);
      out = response.getOutputStream();
      // 将内容写入输出流并把缓存的内容全部发出去
      workbook.write(out);
      out.flush();
    } catch (InvalidFormatException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (inputStream != null) {
        try {
          inputStream.close();
        } catch (IOException e) {
        }
      }
      if (out != null) {
        try {
          out.close();
        } catch (IOException e) {
        }
      }
    }
  }
}

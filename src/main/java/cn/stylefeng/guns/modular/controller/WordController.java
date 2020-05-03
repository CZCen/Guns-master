package cn.stylefeng.guns.modular.controller;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cwz
 * @date 2020/5/2
 */
@RestController
public class WordController {

    @RequestMapping("exportWord")
    public void expWord(HttpServletRequest request, HttpServletResponse response) throws Exception {
       /* Calendar calendar = Calendar.getInstance();// 取当前日期。
//        String imagePath = WordUtil.class.getResource("/images").getPath()+"/image2.jpg";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("text", "我想大声告诉你，你一直在我世界里。");
//        map.put("userList", users);
//        map.put("image",this.getImageBase(imagePath));
        map.put("name", "我想大声告诉你");
        map.put("title", "你一直在我世界里");
        try {
            WordUtil.exportMillCertificateWord(request, response, map, "方案", "template/template.ftl");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

        String tmpFile = "D:/x.doc";
        String expFile = "D:/result.docx";
        Map<String, String> datas = new HashMap<String, String>();
        datas.put("title", "标题部份");
        datas.put("name", "你的名字");
        datas.put("content", "这里是内容，测试使用POI导出到Word的内容！");
        datas.put("author", "知识林");
        datas.put("url", "http://www.zslin.com");

        build(new File(tmpFile), datas, expFile);
    }
    private void build(File tmpFile, Map<String, String> contentMap, String exportFile) throws Exception {
        String name = tmpFile.getName();
        int dot = name.lastIndexOf('.');
        if (name.substring(dot).equalsIgnoreCase("docx")) {

        }

        FileInputStream tempFileInputStream = new FileInputStream(tmpFile);
        HWPFDocument document = new HWPFDocument(tempFileInputStream);
        // 读取文本内容
        Range bodyRange = document.getRange();
        // 替换内容
        for (Map.Entry<String, String> entry : contentMap.entrySet()) {
            bodyRange.replaceText("${" + entry.getKey() + "}", entry.getValue());
        }

        //导出到文件
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        document.write(byteArrayOutputStream);
        OutputStream outputStream = new FileOutputStream(exportFile);
        outputStream.write(byteArrayOutputStream.toByteArray());
        outputStream.close();
    }
    private void buildDocx(File tmpFile, Map<String, String> contentMap, String exportFile) throws Exception {
        XWPFDocument document = new XWPFDocument();
        List<IBodyElement> bodyElements = document.getBodyElements();

    }
}

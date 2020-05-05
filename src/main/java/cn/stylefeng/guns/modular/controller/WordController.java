package cn.stylefeng.guns.modular.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.poifs.filesystem.FileMagic;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cwz
 * @date 2020/5/2
 */
@RestController
@Slf4j
public class WordController {

    @RequestMapping("exportWord")
    public void expWord(int type) throws Exception {
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

        File file;

        String tmpFile = "D:/x.doc";
        String expFile;
        if (type==0) {
            file = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX+"template/workTicket.doc");
            file = new File("d:/workTicket.doc");
                    expFile = "D:/工作票.doc";
        }else {
            file = ResourceUtils.getFile("classpath:template/操作票.doc");
            expFile = "D:/操作票.doc";

        }
        Map<String, String> datas = new HashMap<>();
        // query data
        // put data

        build(file, datas, expFile);
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
    private static String readDoc (String filePath, InputStream is) throws IOException {
        String text= "";
        is = FileMagic.prepareToCheckMagic(is);
        try {
            if (FileMagic.valueOf(is) == FileMagic.OLE2) {
                WordExtractor ex = new WordExtractor(is);
                text = ex.getText();
                ex.close();
            } else if(FileMagic.valueOf(is) == FileMagic.OOXML) {
                XWPFDocument doc = new XWPFDocument(is);
                XWPFWordExtractor extractor = new XWPFWordExtractor(doc);
                text = extractor.getText();
                extractor.close();
            }
        } catch (Exception e) {
            log.error("for file " + filePath, e);
        } finally {
            if (is != null) {
                is.close();
            }
        }
        return text;
    }
}

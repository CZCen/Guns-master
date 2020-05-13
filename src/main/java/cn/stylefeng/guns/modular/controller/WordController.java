package cn.stylefeng.guns.modular.controller;

import cn.stylefeng.guns.modular.dao.Word1Dao;
import cn.stylefeng.guns.modular.dao.WordDao;
import cn.stylefeng.guns.modular.entity.Word;
import cn.stylefeng.guns.modular.entity.Word1;
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

import javax.annotation.Resource;
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
    @Resource
    WordDao wordao;

    @Resource
    Word1Dao word1Dao;

    @RequestMapping("/word")
    public String word(Long mgrId,String typeName) throws Exception {
        File file = null;
        String expFile;
        if (typeName.equals("工作票")) {
            file = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX+"template/工作票.doc");
//            file = new File("c:/工作票.doc");
            expFile = "e:/工作票.doc";
            Map<String, String> datas = new HashMap<>();
            // query data
            Word word = new Word();
            word.setId(mgrId);
//            word.setTypeName(typeName);
//            List<Word> words = word.selectAll();
            List<Word> words = wordao.queryAll(word);
            // put data
            Word word1 = words.get(0);
            datas.put("workContent", word1.getWorkcontent());
            datas.put("mgrNo", word1.getMgrno());
            datas.put("workPlan", word1.getWorkplan() );
            datas.put("mgrName", word1.getMgrname());
            datas.put("countPeople", String.valueOf(word1.getCountpeople()));
            build(file, datas , expFile);
            return expFile;
        }else {
//            file = ResourceUtils.getFile("classpath:template/操作票.doc");
            file = new File("c:/操作票.doc");
            expFile = "e:/操作票.doc";
            Map<String, String> datas = new HashMap<>();
            // query data
            Word1 word1 = new Word1();
            word1.setId(mgrId);
//            word1.setTypeName(typeName);
//            List<Word1> word1s = word1.selectAll();
            List<Word1> word1s = word1Dao.queryAll(word1);
            // put data
            Word1 word2 = word1s.get(0);
            datas.put("workContent", word2.getWorkcontent());
            datas.put("mgrNo", word2.getMgrno());
            datas.put("workPlan", word2.getWorkplan() );
            datas.put("mgrName", word2.getMgrname());
            datas.put("countPeople", String.valueOf(word2.getCountpeople()));
            build(file, datas, expFile);

            return expFile;
        }


    }

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

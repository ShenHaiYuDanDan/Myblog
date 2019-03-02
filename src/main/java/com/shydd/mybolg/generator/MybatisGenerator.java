package com.shydd.mybolg.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;


import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * 功能描述:mybatis逆向生成工具类
 *
 * @param:
 * @return:
 * @auther: Superman
 * @date: 2019/3/2 21:25
 */

public class MybatisGenerator {



    public static void main(String[] args) throws Exception {
//        设置日期
        String today="2019-3-2";
//        设置日期格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        添加日期
        Date now = format.parse(today);
        Date d=new Date();
        if (d.getTime() > now.getTime() + 1000 * 60 * 60 * 24) {
            System.err.println("——————未成成功运行——————");
            System.err.println("——————未成成功运行——————");
            System.err.println("本程序具有破坏作用，应该只运行一次，如果必须要再运行，需要修改today变量为今天，如:" + format.format(new Date()));
            return;
        }
         if (false) return;
//        list接受
         List<String> warnings= new ArrayList<String>();
         boolean overwrite=true;
//         加载配置文件
        InputStream is=MybatisGenerator.class.getClassLoader().getResource("generatorConfig.xml").openStream();
//        接受
        ConfigurationParser cp=new ConfigurationParser(warnings);
//        调用
        Configuration conf=cp.parseConfiguration(is);
        is.close();
//        设置编码
        DefaultShellCallback callback =new DefaultShellCallback(overwrite);
//        此处要区分B的大小写 执行生成
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(conf, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("生成成功");
    }
}
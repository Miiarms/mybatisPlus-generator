package org.miiarms.mybatis;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lungic
 * @version 1.0
 * @date 2021/3/8
 */
public class GeneratorForPlus {
    public void generator() throws Exception{

        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        //指定 逆向工程配置文件
        ClassPathResource classPathResource = new ClassPathResource("generatorForPlusConfig.xml");
        File configFile = classPathResource.getFile();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println(warnings);

    }
    public static void main(String[] args) throws Exception {
        try {
            GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
            generatorSqlmap.generator();

            System.out.println("生成成功！！");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

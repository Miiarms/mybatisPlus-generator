package org.miiarms.mybatis;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.core.io.ClassPathResource;

public class GeneratorSqlmap {

	public void generator() throws Exception{

		List<String> warnings = new ArrayList<>();
		boolean overwrite = true;
		//指定 逆向工程配置文件
		ClassPathResource classPathResource = new ClassPathResource("generatorConfig.xml");
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

package org.miiarms.mybatis.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.internal.DefaultCommentGenerator;


public class PlusAnnotationGenerator extends DefaultCommentGenerator {

    private boolean suppressAllComments;
    
    public PlusAnnotationGenerator() {
        super();
        suppressAllComments = false;
    }


    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
    	
    	List<IntrospectedColumn> list = introspectedTable.getPrimaryKeyColumns();
    	
        if (suppressAllComments) {
            return;
        }
        if(introspectedColumn.getRemarks() != null) {
        	StringBuilder sb = new StringBuilder();
        	field.addJavaDocLine("/**");
        	sb.append(" * ");
        	sb.append(introspectedColumn.getRemarks());
        	field.addJavaDocLine(sb.toString().replace("\n", " "));
        	field.addJavaDocLine(" */");
        }
        //增加mybaits-plus注解
        if(list.contains(introspectedColumn)) {
        	field.addJavaDocLine(String.format("@TableId( \"%s\")", introspectedColumn.getActualColumnName()));
        }else {
        	field.addJavaDocLine(String.format("@TableField( \"%s\")", introspectedColumn.getActualColumnName()));
        }
    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {

    }

    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {

    }

    public void addGetterComment(Method method, IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {

    }

    public void addSetterComment(Method method, IntrospectedTable introspectedTable,
                                 IntrospectedColumn introspectedColumn) {

    }

    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {

    }

    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
    }

    
}

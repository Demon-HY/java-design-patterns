package com.demon.builder.example1;

/**
 * 为创建文档的各个部件指定抽象接口
 *
 * Created by Demon-HY on 2018/1/16 0016.
 */
public interface HtmlBuilder {

	void buildHead();

	void buildBody();

	Html buildHtml();
}

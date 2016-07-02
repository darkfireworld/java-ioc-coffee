package org.coffee.ioc.core.processor;
/**
 * <pre>
 * 如果某个Class实现该接口, 并且注册到Config中,则在
 * BeanFactory 初始化/析构 Bean的时候,对容器内每个Bean都使用
 * 该接口方法进行配置
 * </pre>
 * */
public interface Processor {
	/**
	 * 在调用Bean的init方法之前, 
	 * 如果返回null, 则不再被接下来的Processor处理,
	 * 否则代替当前的Bean对象
	 * @param instance Bean对象
	 * */
	Object beforeInit(Object instance);
	/**
	 * 在调用Bean的init方法之后,
	 * 如果返回null, 则不再被接下来的Processor处理
	 * 否则代替当前的Bean对象
	 * @param instance Bean对象
	 * */
	Object afterInit(Object instance);
	/**
	 * 在调用Bean的destroy方法之前
	 * @param instance Bean对象
	 * */
	void destroy(Object instance);
}

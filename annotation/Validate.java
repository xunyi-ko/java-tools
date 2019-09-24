package com.ypkj.boss.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: Name
 * @author zy
 * @date 2019年9月5日
 * @Description 校验标记
 * @version 1.0.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Validate {

	String name() default "";
	
	int min() default 0;
	
	int max() default Integer.MAX_VALUE;
	
	boolean notNull() default false;
	
	/**
	 * 固定电话或移动电话
	 * @return
	 */
	boolean phone() default false;
	
	/**
	 * 固定电话
	 * @return
	 */
	boolean telephone() default false;
	
	/**
	 * 移动电话
	 * @return
	 */
	boolean mobilephone() default false;
	
	boolean email() default false;
}

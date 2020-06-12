package com.example.zhangzhic.zzc.config;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NotNull {
    String value() default "对象不能为空";
}

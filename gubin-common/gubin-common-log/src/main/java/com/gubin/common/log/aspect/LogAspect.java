package com.gubin.common.log.aspect;


import com.alibaba.fastjson.JSONObject;
import com.gubin.common.log.annotation.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 操作日志记录处理
 *
 * @author ruoyi
 */
@Aspect
@Component
@RefreshScope
public class LogAspect {

    @Value("${log.enable}")
    private boolean logEnable;

    private static final Logger log = LoggerFactory.getLogger(LogAspect.class);

    // 配置织入点
    @Pointcut("@annotation(com.gubin.common.log.annotation.Log)")
    public void logPointCut() {
    }

    @Around("logPointCut()")
    public Object execParamLogAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        // 如果停用日志打印，则直接执行原有代码逻辑，跳过打印日志
        if (!logEnable) {
            return joinPoint.proceed();
        }
        // 如果启用日志分析，则获取方法上的注解信息，并打印方法入参出参
        Method method = this.getMethod(joinPoint);
        Log logProfiler = method.getAnnotation(Log.class);
        // 获取注解上的 key+name
        String key = logProfiler.key();
        String name = logProfiler.name();
        String str = key + "-" + name;
        Object[] args = joinPoint.getArgs();
        // 打印入参
        this.printParam(str, args);
        // 执行原有方法逻辑
        Object result = joinPoint.proceed();
        // 打印出参
        this.printResult(str, result);
        return result;
    }

    private Method getMethod(JoinPoint jp) throws Exception {
        MethodSignature methodSignature = (MethodSignature) jp.getSignature();
        Method method = methodSignature.getMethod();
        return jp.getTarget().getClass().getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    /**
     * 打印入参
     *
     * @param key  方法名称
     * @param args 参数
     */
    private void printParam(String key, Object[] args) {
        if (log.isInfoEnabled()) {
            log.info("{}方法入参为：{}", key, JSONObject.toJSONString(args));
        }
    }

    /**
     * 打印出参
     *
     * @param key    方法名称
     * @param result 方法返回值
     */
    private void printResult(String key, Object result) {
        if (log.isInfoEnabled()) {
            log.info("{}方法出参为：{}", key, JSONObject.toJSONString(result));
        }
    }
}

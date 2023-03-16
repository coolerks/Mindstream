package top.integer.blog.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import top.integer.blog.utils.IpUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class RequestLogInterceptor {
    @Around("within(top.integer.blog..controller..*)")
    public Object doLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        Object proceed = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        log.info("请求路径：{}，IP：{}，接收参数：{}，处理结果：{}", request.getServletPath(), IpUtil.getIpAddress(request), Arrays.toString(proceedingJoinPoint.getArgs()), proceed);
        return proceed;
    }
}

package top.integer.blog.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import top.integer.blog.dto.CommentDto;
import top.integer.blog.utils.IpUtil;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/my")
public class MyController {

    @PostMapping("/test")
    public CommentDto test(@RequestBody CommentDto commentDto) {
//        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
//        HttpServletRequest request = servletRequestAttributes.getRequest();
//        System.out.println("servletRequestAttributes.getRequest().getHeader(\"content-type\") = " + request.getHeader("content-type"));
//        System.out.println("servletRequestAttributes.getRequest().getContextPath() = " + request.getContextPath());
//        System.out.println("request.getPathInfo() = " + request.getPathInfo());
//        System.out.println("request.getServletPath() = " + request.getServletPath());
//        System.out.println("request.getPathTranslated() = " + request.getPathTranslated());
//        String ipAddress = IpUtil.getIpAddress(request);
//        System.out.println("ipAddress = " + ipAddress);
        return commentDto;
    }
}

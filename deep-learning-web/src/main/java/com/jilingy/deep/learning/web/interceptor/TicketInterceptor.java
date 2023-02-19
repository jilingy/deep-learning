//package com.jilingy.deep.learning.web.interceptor;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//
//
///**
// * @Description: ticket拦截
// * @Author: liudeyou
// * @Data: 2020/12/16 10:47
// */
//@Component
//public class TicketInterceptor implements HandlerInterceptor {
//    private static final Logger logger= LoggerFactory.getLogger(TicketInterceptor.class);
//
//    //调用前拦截
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//	    //业务逻辑,以登录为例
//        //调用方法前，判断/查找登陆凭证，将用户存储到hostHolder中。
//        logger.debug("preHandle:"+handler.toString());
//        return true;
//    }
//
//    //Controller之后，return返回html之前执行
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//	    //业务逻辑
//        //用户已登录，就同时向前端返回当前登录用户，前端就可以根据用户是否已登陆，进行相应的判断，显示对应的功能
//        logger.debug("postHandle:"+handler.toString());
//    }
//
//    //返回html之后之执行
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//	    //业务逻辑
//        //调用结束，清除用户信息
//        logger.debug("afterCompletion:"+handler.toString());
//    }
//
//}

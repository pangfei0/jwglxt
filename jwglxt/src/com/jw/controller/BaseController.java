package com.jw.controller;


import com.jw.common.ServerInfo;
import com.jw.editor.DateEditor;
import com.jw.editor.DoubleEditor;
import com.jw.editor.IntegerEditor;
import com.jw.editor.LongEditor;
import com.jw.identity.Validator;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

/**
 * Created by 53801 on 2015/8/18-0:35.
 */
public abstract class BaseController {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpSession session;


    private Logger logger  = Logger.getLogger(BaseController.class);


    @InitBinder
    protected void initBinder(HttpServletRequest request,
                              ServletRequestDataBinder binder) throws Exception {

        binder.registerCustomEditor(Integer.class, new IntegerEditor());
        binder.registerCustomEditor(Long.class, new LongEditor());
        binder.registerCustomEditor(Double.class, new DoubleEditor());
        binder.registerCustomEditor(Date.class, new DateEditor());
    }

    protected ModelAndView messageDone(String message,String result,Map<String,?> model) {
        this.MDCPUT(session.getAttribute("username"));
        ModelAndView mav = new ModelAndView("common/messageDone",model);
        mav.addObject("Result", result);
        mav.addObject("Message", message.replaceAll("[\\t\\n\\r]", "<br/>"));
        return mav;
    }

    protected ModelAndView ajaxDone(int statusCode, String message, String result,Map<String,?> model) {
        this.MDCPUT(session.getAttribute("username"));
        ModelAndView mav = new ModelAndView("common/ajaxDone",model);
        mav.addObject("statusCode", statusCode);
        mav.addObject("Message", message.replaceAll("[\\t\\n\\r]", "<br/>"));
        mav.addObject("Result", result);
        return mav;
    }
    protected ModelAndView uploadDone(String err, String msg) {
        ModelAndView mav = new ModelAndView("uploadDone");
        mav.addObject("err", err);
        mav.addObject("msg", msg);
        return mav;
    }

    protected ModelAndView messageDoneSuccess(String message,Map<String,?> model) {
        return messageDone(message, "Success", model);
    }

    protected ModelAndView messageDoneError(String message,Map<String,?> model) {
        return messageDone(message, "Error", model);
    }

    protected ModelAndView ajaxDoneSuccess(String message,Map<String,?> model) {
        return ajaxDone(200, message, "Success", model);
    }

    protected ModelAndView ajaxDoneError(String message,Map<String,?> model) {
        return ajaxDone(300, message, "Error", model);
    }


    @ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception e, HttpServletRequest request,HttpSession session) {
        String msg = e.getClass().toString() + ":" + e.getMessage() + ",<br>Session:" + Validator.getInstance().init(session).validate();
        e.printStackTrace();
        logger.error(msg);
        request.setAttribute("exception", e);

        if (ServerInfo.isAjax(request) || request.getParameter("ajax") != null) {
            return ajaxDoneError(e.getMessage(),null);
        }

        ModelAndView mav = new ModelAndView("common/messageDone");
        mav.addObject("statusCode", 300);
        mav.addObject("Message", msg);
        mav.addObject("Result", "Error");
        return mav;
    }

    private void MDCPUT(Object username){
        MDC.put("optusername", null==username?"null":username);
    }
}

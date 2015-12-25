package com.jw.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/*import com.jw.bean.Status;
import com.movie.service.IStatusService;*/

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangpu on 2015/8/15.
 */
public class StatusConstraint {


/*
    private IStatusService statusService;
    private static StatusConstraint s;
    private static List<Status> list;

    public void setStatusService(IStatusService statusService) {
        this.statusService = statusService;
    }


    @PostConstruct
    public void postConstruct() {
        //PostConstruct
        s = this;
        s.statusService = this.statusService;
        System.out.println("PostConstruct");
    }
    public  void init(){
        if (null == list) {
            //init
            list = s.statusService.getScrollData(null, 1, Integer.MAX_VALUE).getList();
            System.out.println("status list init");
        }
    }
    public static List<Status> GetStatusesByParams(String stable, String scolumn) {
        List<Status> result = new ArrayList<Status>();

        for (Status s : (List<Status>)list) {
            if (s.getStable().equals(stable) && s.getScolumn().equals(scolumn))
                result.add(s);
        }
        return result;
    }
    *//**
     * @param stable
     * @param scolumn
     * @return
     * @throws JsonProcessingException
     *//*
    public static String GetStatusesByParamsAsString(String stable, String scolumn) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        String Json = mapper.writeValueAsString(GetStatusesByParams(stable, scolumn));
        return Json;
    }


    public static final String DEFAULT_PASSWORD = "000000";
    //用户
    public static final int USER_ENABLE = 0;
    public static final int USER_DISABLE = 1;

    //房间
    public static final int ROOM_ENABLE = 0;
    public static final int ROOM_DISABLE = 1;

    //订单
    public static final int ORDER_NEW = 0;
    public static final int ORDER_RECEIVE = 1;
    public static final int ORDER_WAITPAY = 2;
    public static final int ORDER_PAYED = 3;
    public static final int ORDER_EXECUTE = 4;
    public static final int ORDER_FROZEN = 5;
    public static final int ORDER_FINISH = 6;
    public static final int ORDER_CANCEL = 7;
    public static final int ORDER_EXCEPTION = 8;

    //订单来源
    public static final int SOURCE_CONSOLE = 0;
    public static final int SOURCE_WEIXIN = 1;
    public static final int SOURCE_APP = 2;
    public static final int SOURCE_HALLSELF = 3;
    public static final int SOURCE_PAD = 4;

    //消费方式
    public static final int CONSUME_MOVIE = 0;
    public static final int CONSUME_HOUR = 1;

    //网络状况
    public static final int NET_CONNECT = 0;
    public static final int NET_DISCONNECT = 1;
    public static final int NET_ABNORMAL = 2;
    public static final int NET_UNKNOWN = 3;

    //盒子播放状态
    public static final int BOX_PALY = 0;
    public static final int BOX_PAUSE = 1;
    public static final int BOX_STOP = 2;
    public static final int BOX_FF = 3;
    public static final int BOX_FB = 4;

    //活动
    public static final int ACTIVITY_ENABLE = 0;
    public static final int ACTIVITY_DISABLE = 1;

    //折扣
    public static final int DISCOUNT_ENABLE = 0;
    public static final int DISCOUNT_DISABLE = 1;

    //付款方式
    public static final int PAY_ENABLE = 0;
    public static final int PAY_DISABLE = 1;

    //播放盒子
    public static final int BOX_ENABLE = 0;
    public static final int BOX_DISABLE = 1;

*/

}

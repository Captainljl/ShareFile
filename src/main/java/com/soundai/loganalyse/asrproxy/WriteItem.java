package com.soundai.loganalyse.asrproxy;

import lombok.Data;

/**
 * @author: liujialei
 * @create: 2019-10-25 10:53
 **/
@Data
public class WriteItem {
    private String time;
    private String dialogId;
    private String language;
    private String result;
    private String format;
}

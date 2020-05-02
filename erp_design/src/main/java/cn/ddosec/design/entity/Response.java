package cn.ddosec.design.entity;

import lombok.Data;

/**
 * @author joker_dj
 * @create 2020-04-30日 14:46
 */
@Data
public class Response {
    private boolean success;//操作是否成功
    private String message;//相应信息

    public Response(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}

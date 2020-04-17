package com.rbac.design.entity;

import lombok.Data;

import java.io.Serializable;

/**数据回显
 * @author joker_dj
 * @create 2020-04-17日 10:50
 */
@Data
public class Response implements Serializable {
    private boolean success;//操作是否成功
    private String message;//相应信息

    public Response(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}

package cn.ddossec.common;

import lombok.Data;

/**数据回显
 * @author 谷辉
 * @create 2020-04-20日 11:03
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

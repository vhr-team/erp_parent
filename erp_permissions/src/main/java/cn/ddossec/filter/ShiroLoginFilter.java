package cn.ddossec.filter;

import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class ShiroLoginFilter extends FormAuthenticationFilter {
    /**
     * 当用户访问未登陆资源时，会走的方法。
     * 返回true代表已登陆，不用处理
     * 返回false代表未登陆。提示前端
     */
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        Map<String, Object> resultData = new HashMap<>();
        resultData.put("code", -1);
        resultData.put("msg", "登录认证失效，请重新登录!");
        PrintWriter out = response.getWriter();
        //使用fastjson的对象转化方法
        out.write(JSONObject.toJSON(resultData).toString());
        return false;
    }
}

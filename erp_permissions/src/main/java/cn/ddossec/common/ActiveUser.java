package cn.ddossec.common;

import cn.ddossec.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveUser implements Serializable {

    private User user;
    private List<String> roles;
    private List<String> permissions;

}

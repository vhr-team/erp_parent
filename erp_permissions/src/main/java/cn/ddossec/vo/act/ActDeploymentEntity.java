package cn.ddossec.vo.act;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ActDeploymentEntity implements Serializable {
	private String id;
	private String name;
	private String category;
	private Date deploymentTime;
}

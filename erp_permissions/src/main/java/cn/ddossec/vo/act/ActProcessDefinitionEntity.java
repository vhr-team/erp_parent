package cn.ddossec.vo.act;

import lombok.*;

/**
 * 流程定义的转化类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ActProcessDefinitionEntity {
	private String id;
	private String name;
	private String key;
	private Integer version;
	private String deploymentId;
	private String resourceName;
	private String diagramResourceName;
}

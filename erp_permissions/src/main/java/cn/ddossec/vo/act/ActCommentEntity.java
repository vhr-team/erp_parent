package cn.ddossec.vo.act;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ActCommentEntity {

	private String userId;
	private Date time;
	private String message;
	private String fullMessage;
}

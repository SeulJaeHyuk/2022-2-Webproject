package cs.dit.domain;

import java.util.Date;

import lombok.Data;

@Data
public class NoticeBoardVO {
	
	private long bno;;
	private String title, content, writer;;
	private Date regdate, updatedate;
}

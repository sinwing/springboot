package sample.dto;
import lombok.Data;

@Data
public class BoardDto {
	private int boardIdx;
	private String title;
	private String contents;
	private int hitCnt;
	private String creatorId;
	private String createDatetime;
	private String updatorId;
	private String updateDatetime;
	
}

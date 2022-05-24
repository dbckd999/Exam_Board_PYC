package study.board.Test.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BoardDTO {
	private int b_no;
	private String b_id;
	private String b_pw;
	private String b_title;
	private String b_content;
	private Timestamp b_written_date;
}
package com.spring.myweb.freeboard.dto.response;

import com.spring.myweb.freeboard.entity.FreeBoard;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;




@Getter @ToString @EqualsAndHashCode
public class FreeDetailResponseDTO {

	private int bno;
	private String title;
	private String writer;
	private String content;
	private String date;
		
	public FreeDetailResponseDTO(FreeBoard board) {
		this.bno = board.getBno();
		this.title = board.getTitle();
		this.writer = board.getWriter();
		this.content = board.getContent();
		if(board.getUpdateDate() == null) {
			this.date = FreeListResponseDTO.makePrettierDateStrirng(board.getRegDate());
		}else {
			this.date 
			= FreeListResponseDTO.makePrettierDateStrirng(board.getUpdateDate()) + " (수정됨)";
		}
	}
	
}

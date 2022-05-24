package study.board.Test.service;

import java.util.List;

import study.board.Test.model.BoardDTO;

public interface BoardService {
	public List<BoardDTO> boardList();
	public BoardDTO aContent(int b_no);
	public int boardInsert(BoardDTO dto);
	public int aContentUpdate(BoardDTO dto);
	public int aContentDelete(int b_no);
}

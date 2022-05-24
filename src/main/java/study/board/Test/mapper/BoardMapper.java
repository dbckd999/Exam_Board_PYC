package study.board.Test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import study.board.Test.model.BoardDTO;

@Mapper
public interface BoardMapper {
	public List<BoardDTO> boardList();
	public BoardDTO aContent(int b_no);
	public int boardInsert(BoardDTO dto);
	public int aContentUpdate(BoardDTO dto);
	public int aContentDelete(int b_no);
}
package study.board.Test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.board.Test.mapper.BoardMapper;
import study.board.Test.model.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardMapper mapper;
	
	@Override
	public List<BoardDTO> boardList() {
		return mapper.boardList();
	}

	@Override
	public BoardDTO aContent(int b_no) {
		return mapper.aContent(b_no);
	}

	@Override
	public int boardInsert(BoardDTO dto) {
		return mapper.boardInsert(dto);
	}

	@Override
	public int aContentUpdate(BoardDTO dto) {
		return mapper.aContentUpdate(dto);
	}

	@Override
	public int aContentDelete(int b_no) {
		return mapper.aContentDelete(b_no);
	}
}
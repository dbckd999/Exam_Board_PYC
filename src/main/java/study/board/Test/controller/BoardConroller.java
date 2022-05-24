package study.board.Test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import study.board.Test.model.BoardDTO;
import study.board.Test.service.BoardService;

@Controller
public class BoardConroller {
	
	@Autowired
	BoardService service;
	
	//전체 보이기
	@GetMapping("/")
	public String boardList(Model model) {
		model.addAttribute("list", service.boardList());
		return "index";
	}
	
	//보드 하나 보이기
	@GetMapping("/aContent")
	public String aContent(int b_no, Model model) {
		model.addAttribute("dto", service.aContent(b_no));
		return "aContent";
	}
	
	//게시물 삽입페이지 이동
	@GetMapping("/boardInsert")
	public String toBoardInsert() {
		return "boardInsert";
	}
	
	//게시물 삽입
	@PostMapping("/boardInsert")
	public String boardInsert(BoardDTO dto) {
		System.out.println("boardInsert" + dto);
		service.boardInsert(dto);
		return "redirect:/";
	}
	
	//게시물 수정 페이지 이동
	@GetMapping("/aContentUpdate")
	public String toAContentUpdate(int b_no, Model model) {
		System.out.println("toAContentUpdate" + b_no);
		model.addAttribute("dto", service.aContent(b_no));
		return "aContentUpdate";
	}
	
	@PostMapping("/aContentUpdate")
	public String aContentUpdate(BoardDTO dto) {
		System.out.println("aContentUpdate" + dto);
		service.aContentUpdate(dto);
		return "redirect:/";
	}
	
	@GetMapping("/aContentDelete")
	public String aContentDelete(int b_no) {
		service.aContentDelete(b_no);
		return "redirect:/";
	}
	
}

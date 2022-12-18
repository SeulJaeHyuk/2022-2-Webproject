package cs.dit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cs.dit.domain.BoardVO;
import cs.dit.domain.FreeBoardVO;
import cs.dit.domain.NoticeBoardVO;
import cs.dit.service.FreeBoardService;
import cs.dit.service.NoticeBoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@RequiredArgsConstructor
public class NoticeController {

	private final NoticeBoardService nservice;
	
	@GetMapping("/notice")
	public void list4(Model model) {
		log.info("Controller NoticeBoard getList Test : ............");
		model.addAttribute("list4", nservice.getList());
	}
	
	@GetMapping("/notice2")
	public void list6(Model model) {
		log.info("Controller NoticeBoard getList Test : ............");
		model.addAttribute("list6", nservice.getList());
	}
	
	@GetMapping("/NoticegetOne")
	public void getOne(@RequestParam("bno") Long bno, Model model) {
		log.info("get.................");
		model.addAttribute("board", nservice.get(bno));
	}
	
	@GetMapping("/Noticeregister")  //register.jsp 파일과 매칭되어 화면에 출력
	public void register() {
	}
	
	@PostMapping("/Noticeregister")
	public String register(NoticeBoardVO board, RedirectAttributes rttr) {
		log.info("register : " + board);
		
		int count = nservice.register(board);
		
		if(count==1)
			rttr.addFlashAttribute("result", "registered"); //한번만 사용하는 값을 보냄
		
		return "redirect:/board/notice";
	}
	
	@PostMapping("/Noticemodify")
	public String modify(NoticeBoardVO board, RedirectAttributes rttr) {
		log.info("modify : " + board);
		
		int count = nservice.modify(board);
		
		if(count==1)
			rttr.addFlashAttribute("result", "modified");
		
		return "redirect:/board/free";
	}
	
	@PostMapping("/Noticemodify2")
	public String modify2(NoticeBoardVO board, RedirectAttributes rttr) {
		log.info("modify : " + board);
		
		int count = nservice.modify(board);
		
		if(count==1)
			rttr.addFlashAttribute("result", "modified");
		
		return "redirect:/board/free";
	}
	
	@GetMapping({"/Noticeget", "/Noticemodify"})
	public void get(@RequestParam("bno") Long bno, Model model) {
		log.info("/get");
		
		model.addAttribute("board", nservice.get(bno));
	}
	
	@PostMapping("/Noticeremove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		log.info("Freeremove : " + bno);
		
		int count = nservice.remove(bno);
		
		if(count==1)
			rttr.addFlashAttribute("result","removed");
		
		return "redirect:/board/notice";
	}
}

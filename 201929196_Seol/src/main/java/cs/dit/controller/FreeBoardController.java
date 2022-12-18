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
import cs.dit.service.FreeBoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@RequiredArgsConstructor
public class FreeBoardController {

	private final FreeBoardService fservice;
	
	@GetMapping("/free")
	public void list3(Model model) {
		log.info("Controller FreeBoard getList Test : ............");
		model.addAttribute("list3", fservice.getList());
	}
	
	@GetMapping("/free2")
	public void list7(Model model) {
		log.info("Controller FreeBoard getList Test : ............");
		model.addAttribute("list7", fservice.getList());
	}
	
	@GetMapping("/FreegetOne")
	public void getOne(@RequestParam("bno") Long bno, Model model) {
		log.info("get.................");
		model.addAttribute("board", fservice.get(bno));
	}
	
	@GetMapping("/Freeregister")  //register.jsp 파일과 매칭되어 화면에 출력
	public void register() {
	}
	
	@PostMapping("/Freeregister")
	public String register(FreeBoardVO board, RedirectAttributes rttr) {
		log.info("register : " + board);
		
		int count = fservice.register(board);
		
		if(count==1)
			rttr.addFlashAttribute("result", "registered"); //한번만 사용하는 값을 보냄
		
		return "redirect:/board/free";
	}
	
	@PostMapping("/Freemodify")
	public String modify(FreeBoardVO board, RedirectAttributes rttr) {
		log.info("modify : " + board);
		
		int count = fservice.modify(board);
		
		if(count==1)
			rttr.addFlashAttribute("result", "modified");
		
		return "redirect:/board/free";
	}
	
	@PostMapping("/Freemodify2")
	public String modify2(FreeBoardVO board, RedirectAttributes rttr) {
		log.info("modify : " + board);
		
		int count = fservice.modify(board);
		
		if(count==1)
			rttr.addFlashAttribute("result", "modified");
		
		return "redirect:/board/free";
	}
	
	@GetMapping({"/Freeget", "/Freemodify"})
	public void get(@RequestParam("bno") Long bno, Model model) {
		log.info("/get");
		
		model.addAttribute("board", fservice.get(bno));
	}
	
	@PostMapping("/freeremove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		log.info("Freeremove : " + bno);
		
		int count = fservice.remove(bno);
		
		if(count==1)
			rttr.addFlashAttribute("result","removed");
		
		return "redirect:/board/free";
	}
}

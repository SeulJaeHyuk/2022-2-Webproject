package cs.dit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cs.dit.domain.BoardVO;
import cs.dit.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService service;

	@GetMapping("/list")
	public void getlist(Model model) {
		log.info("Controller getlist : ............");
		model.addAttribute("list", service.getList());
	}
	
	@GetMapping("/list2")
	public void list2(Model model) {
		log.info("Controller getlist : ............");
		model.addAttribute("list", service.getList());
	}
	
	@GetMapping("/register")  //register.jsp 파일과 매칭되어 화면에 출력
	public void register() {
	}
	
	@GetMapping("/login")  
	public void login() {
	}
	
	@GetMapping("/main")  
	public void main() {
	}
	
	@GetMapping("/main2")  
	public void main2() {
	}
	
	@GetMapping("/main3")  
	public void main3() {
	}
	
	@GetMapping("/signup")  
	public void signup() {
	}
	
	@GetMapping("/register2")  
	public void register2() {
	}
	
	@GetMapping("/modify2")  
	public void modify2() {
	}
	
	
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		log.info("register : " + board);
		
		int count = service.register(board);
		
		if(count==1)
			rttr.addFlashAttribute("result", "registered"); //한번만 사용하는 값을 보냄
		
		return "redirect:/board/list";
	}
	
	
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("bno") Long bno, Model model) {
		log.info("/get");
		
		model.addAttribute("board", service.get(bno));
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {
		log.info("modify : " + board);
		
		int count = service.modify(board);
		
		if(count==1)
			rttr.addFlashAttribute("result", "modified");
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/modify2")
	public String modify2(BoardVO board, RedirectAttributes rttr) {
		log.info("modify2 : " + board);
		
		int count = service.modify(board);
		
		if(count==1)
			rttr.addFlashAttribute("result", "modified");
		
		return "redirect:/board/list2";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		log.info("remove : " + bno);
		
		int count = service.remove(bno);
		
		if(count==1)
			rttr.addFlashAttribute("result","removed");
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/getOne")
	public void getOne(@RequestParam("bno") Long bno, Model model) {
		log.info("get.................");
		model.addAttribute("board", service.get(bno));
	}
	
	@GetMapping("/getOne2")
	public void getOne2(@RequestParam("bno") Long bno, Model model) {
		log.info("get.................");
		model.addAttribute("board", service.get(bno));
	}
}

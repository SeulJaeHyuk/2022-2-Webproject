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
import cs.dit.domain.MemberBoardVO;
import cs.dit.service.FreeBoardService;
import cs.dit.service.MemberBoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@RequiredArgsConstructor
public class MemberBoardController {

	private final MemberBoardService mservice;
	
	@GetMapping("/member")
	public void list5(Model model) {
		log.info("Controller MemberBoard getList Test : ............");
		model.addAttribute("list5", mservice.getList());
	}

}

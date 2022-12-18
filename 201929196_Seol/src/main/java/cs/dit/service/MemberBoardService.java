package cs.dit.service;

import java.util.List;

import cs.dit.domain.FreeBoardVO;
import cs.dit.domain.MemberBoardVO;
import cs.dit.domain.NoticeBoardVO;

public interface MemberBoardService {
	
	public List<MemberBoardVO> getList();
	public MemberBoardVO get(Long bno);
	public int register(MemberBoardVO board);
	public int modify(MemberBoardVO board);
	public int remove(Long bno);
}

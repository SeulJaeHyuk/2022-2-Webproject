package cs.dit.service;

import java.util.List;

import cs.dit.domain.FreeBoardVO;

public interface FreeBoardService {
	
	public List<FreeBoardVO> getList();
	public FreeBoardVO get(Long bno);
	public int register(FreeBoardVO board);
	public int modify(FreeBoardVO board);
	public int remove(Long bno);
}

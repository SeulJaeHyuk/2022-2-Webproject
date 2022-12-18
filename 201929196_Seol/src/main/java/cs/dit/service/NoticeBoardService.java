package cs.dit.service;

import java.util.List;

import cs.dit.domain.FreeBoardVO;
import cs.dit.domain.NoticeBoardVO;

public interface NoticeBoardService {
	
	public List<NoticeBoardVO> getList();
	public NoticeBoardVO get(Long bno);
	public int register(NoticeBoardVO board);
	public int modify(NoticeBoardVO board);
	public int remove(Long bno);
}

package cs.dit.mapper;

import java.util.List;

import cs.dit.domain.FreeBoardVO;
import cs.dit.domain.NoticeBoardVO;

public interface NoticeBoardMapper {
	
	public List<NoticeBoardVO>getList();
	public int insert(NoticeBoardVO board);
	public NoticeBoardVO selectOne(Long bno);
	public int delete(Long bno);
	public int update(NoticeBoardVO board);
	public NoticeBoardVO read(Long bno);
}

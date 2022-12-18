package cs.dit.mapper;

import java.util.List;

import cs.dit.domain.FreeBoardVO;

public interface FreeBoardMapper {
	
	public List<FreeBoardVO>getList();
	public int insert(FreeBoardVO board);
	public FreeBoardVO selectOne(Long bno);
	public int delete(Long bno);
	public int update(FreeBoardVO board);
	public FreeBoardVO read(Long bno);
}

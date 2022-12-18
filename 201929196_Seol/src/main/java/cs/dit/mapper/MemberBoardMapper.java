package cs.dit.mapper;

import java.util.List;

import cs.dit.domain.FreeBoardVO;
import cs.dit.domain.MemberBoardVO;

public interface MemberBoardMapper {
	
	public List<MemberBoardVO>getList();
	public int insert(MemberBoardVO board);
	public MemberBoardVO selectOne(Long bno);
	public int delete(Long bno);
	public int update(MemberBoardVO board);
	public MemberBoardVO read(Long bno);
}

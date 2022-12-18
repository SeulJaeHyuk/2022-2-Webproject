package cs.dit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs.dit.domain.FreeBoardVO;
import cs.dit.domain.MemberBoardVO;
import cs.dit.domain.NoticeBoardVO;
import cs.dit.mapper.FreeBoardMapper;
import cs.dit.mapper.MemberBoardMapper;
import cs.dit.mapper.NoticeBoardMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@Service
@RequiredArgsConstructor
public class MemberBoardServieImpl implements MemberBoardService {

	private final MemberBoardMapper mapper;


	@Override
	public List<MemberBoardVO> getList() {
		log.info("getList -------------------");
		return mapper.getList();
	}

	@Override
	public int register(MemberBoardVO board) {
		return mapper.insert(board);
	}

	@Override
	public MemberBoardVO get(Long bno) {
		return mapper.read(bno);
	}

	@Override
	public int modify(MemberBoardVO board) {
		return mapper.update(board);
	}

	@Override
	public int remove(Long bno) {
		return mapper.delete(bno);
	}

}

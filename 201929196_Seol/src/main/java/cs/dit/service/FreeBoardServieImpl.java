package cs.dit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs.dit.domain.FreeBoardVO;
import cs.dit.mapper.FreeBoardMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@Service
@RequiredArgsConstructor
public class FreeBoardServieImpl implements FreeBoardService {

	private final FreeBoardMapper mapper;


	@Override
	public List<FreeBoardVO> getList() {
		log.info("getList -------------------");
		return mapper.getList();
	}

	@Override
	public int register(FreeBoardVO board) {
		return mapper.insert(board);
	}

	@Override
	public FreeBoardVO get(Long bno) {
		return mapper.read(bno);
	}

	@Override
	public int modify(FreeBoardVO board) {
		return mapper.update(board);
	}

	@Override
	public int remove(Long bno) {
		return mapper.delete(bno);
	}

}

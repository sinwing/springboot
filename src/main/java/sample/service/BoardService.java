package sample.service;

import java.util.List;

import sample.dto.BoardDto;

public interface BoardService {
	List<BoardDto> selectBoardList() throws Exception;
}

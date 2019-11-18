package sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import sample.dto.BoardDto;

@Mapper
public interface BoardMapper {
	List<BoardDto> selectBoardList() throws Exception;
}

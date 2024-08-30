package com.jpaTest.Dto;

import com.jpaTest.Entity.Board;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class BoardDto
{
    private int id;

    @NotBlank(message="작성자는 필수 입력란 입니다.")
    private String writer;

    @Size(min=4, max=200, message = "4자 이상 200자 이하로 작성하세요")
    private String title;

    @NotEmpty(message = "내용은 필수 입력란 입니다.")
    private String content;

    private static ModelMapper modelMapper = new ModelMapper();
    // BoardDto 객체 데이터 -> Board 객체에 저장
    public Board createBoard()
    {
        return modelMapper.map(this, Board.class);
    }
    // Board(Entity) -> BoardDto(DTO) 에 저장
    public static BoardDto of(Board board)
    {
        return modelMapper.map(board, BoardDto.class);
    }


    // BoardDto -> Board
//    public Board createBoard()
//    {
//        Board board = new Board();
//        board.setTitle(this.title);
//        board.setWriter(this.writer);
//        board.setContent(this.content);
//
//        return board;

}

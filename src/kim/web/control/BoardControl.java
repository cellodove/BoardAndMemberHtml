package kim.web.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kim.web.model.BoardDTO;

@WebServlet("/kimm")
public class BoardControl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");

		String id = req.getParameter("id");
		System.out.println(id);

		String passwd = req.getParameter("passwd");
		System.out.println(passwd);

		String subject = req.getParameter("subject");
		System.out.println(subject);

		String content = req.getParameter("content");
		System.out.println(content);

		BoardDTO boardDTO = new BoardDTO();

		boardDTO.setId(id);
		boardDTO.setPasswd(passwd);
		boardDTO.setSubject(subject);
		boardDTO.setContent(content);

		System.out.println(boardDTO.getId());
		System.out.println(boardDTO.getPasswd());
		System.out.println(boardDTO.getSubject());
		System.out.println(boardDTO.getContent());

	}
}

package kim.web.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kim.web.model.MemberDTO;

@WebServlet("/kim")
public class MemberControl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		System.out.println(name);
		
		String id = req.getParameter("id");
		System.out.println(id);

		String passwd = req.getParameter("passwd");
		System.out.println(passwd);
		
		int age = Integer.parseInt(req.getParameter("age"));
		System.out.println(age);

		String email = req.getParameter("email");
		System.out.println(email);
		
		
		
		MemberDTO memberDTO = new MemberDTO();

		memberDTO.setName(name);
		memberDTO.setName(id);
		memberDTO.setName(passwd);
		memberDTO.setAge(age);
		memberDTO.setName(email);

		System.out.println(memberDTO.getName());
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPasswd());
		System.out.println(memberDTO.getAge());
		System.out.println(memberDTO.getEmail());

	}
}

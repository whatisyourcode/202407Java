package _mvc0814;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MoveTest
 */
@WebServlet("/move")
public class MoveTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MoveTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = null;
		
		// URL에서 프로젝트 이름 뒷 부분의 문자열 걷어내기
		String uri = request.getRequestURI();		// /_mvc0814/a
		String conPath = request.getContextPath();  // /_mvc0814
		String com = uri.substring(conPath.length()); // /a
		

		// 주어진 URL에 따라 지정된 동작 수행 
		if(com.equals("/a") || com.equals("/")) {
			view = "a.jsp";
		}else if(com.equals("/b")) {
			response.sendRedirect("b.jsp");
			view = "redirect:b.jsp";
		}
		
		if(view.startsWith("redirect:")) {
			response.sendRedirect(view.substring(9));
		} else {
			request.getRequestDispatcher(view).forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

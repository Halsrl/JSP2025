package member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/mcontrol")
public class MemberController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}

	private static final long serialVersionUID = 1L;
	
	MemberDAO dao;
}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
	    String action = req.getParameter("action");
	    String view = "";
	    if(action == null) {
	    	getServeletContext().getRequestDisapatcher("/mcontrol?action=list").forward(req, resp);
	    	
	    }else {
	    	switch(action) {
	    	case "list": view = list(req,resp); break;
	    	case "insert": view = insert(req,resp); break;
	    	}
	    	getServletContext().getRequestDispatcher(view).forward(req,  resp);
	    }
	    }
	    public string list(HttpServletRequest req, JttpServletResponse resp) {
	    	req,setAttribute("memberlist", dao.getALL());
	    	return "/memberinfo.jsp";
	    }
	    public string lnsert(HttpServletRequest req, JttpServletResponse resp) {
	    	return "";
	    	
	    }
	    public string
	    }
	}

	
       
    
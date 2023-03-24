package practice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.RegisterBean;

@WebServlet("/register")
public class FirstServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {
		//リクエストの文字コード指定
		req.setCharacterEncoding("utf-8");

		//入力情報の取得
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String[] langs = req.getParameterValues("lang");
		res.setContentType("text/html;charset=utf-8");

		//Beanの作成
		RegisterBean rb = new RegisterBean();
		rb.setName(name);
		rb.setAge(age);
		rb.setLangus(langs);

		//Beanをリクエストに格納
		req.setAttribute("rb", rb);

		//register4.jspへフォワード
		RequestDispatcher rd = req.getRequestDispatcher("/register4.jsp");
		rd.forward(req, res);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {
		doPost(req, res);
	}
}

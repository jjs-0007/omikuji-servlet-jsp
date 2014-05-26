package jp.co.java_seminar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class omikujiservlet
 */
@WebServlet("/Omikujiservlet")
public class Omikujiservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Omikujiservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String[] array = {
                "大吉" + "<br>ついてます！",
                "中吉" + "<br>まあまあです",
                "小吉" + "<br>特に言うこともない",
                "凶" + "<br>残念",
                "大凶" + "<br>・・・" };
        double rand = Math.random();
        int number = (int) (rand * array.length);

        request.setAttribute("omikuji", array[number]);
        RequestDispatcher dipatcher = request
                .getRequestDispatcher("/WEB-INF/jsp/omikuji.jsp");
        dipatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

}

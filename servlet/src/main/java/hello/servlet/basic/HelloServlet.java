package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// name, urlPatterns는 유일값이어야 함 (겹치면 안됨) 
@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {     //servlet method는 httpservlet을 상속받아야 함


//    ctrl + o
//    servlet 호출되면 해당 service method가 실행 됨
//    http 요청이 오면 was, servlet container가 request, response 객체를 만들어서 서버에 던져줌. ( param )
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

//        servlet에서 param 편하게 읽도록 지원해줌
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello " + username);        //response
        response.getWriter().write(" 한글" );        //response


//        tomcat server가 data-length,date 등 다 자동으로 만들어서 응답을 보내줌

    }
}

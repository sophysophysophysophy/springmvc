package hello.servlet.web.frontcontroller.v1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV1 {

//    servlet 과 모양이 같은 method를 생성
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}

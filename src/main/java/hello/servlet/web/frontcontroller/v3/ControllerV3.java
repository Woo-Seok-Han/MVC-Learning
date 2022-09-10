package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

// v3 컨트롤러 특징
// 1. 컨트롤러에서 modelView 를 반환한다
// 2.
public interface ControllerV3 {
    public ModelView process(Map<String, String> paramMap);
}

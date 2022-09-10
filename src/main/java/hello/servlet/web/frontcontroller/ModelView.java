package hello.servlet.web.frontcontroller;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

// View Resolver 의 역할을 한다
// 논리적 입력값이 들어옴에 따라 완전한 물리경로를 생성한다
// 해당하는 view 의 정보를 만들어서 보내준다
@Getter
@Setter
public class ModelView {
    private String viewName;
    private Map<String, Object> model = new HashMap<>();

    public ModelView(String viewName) {
        this.viewName = viewName;
    }


}

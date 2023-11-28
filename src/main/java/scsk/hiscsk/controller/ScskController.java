package scsk.hiscsk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @RequestMapping 은 클래스 , 메소드 둘 다 사용할 수 있다.
 * @GetMapping 은 메소드 에서만 사용할 수 있다.
 * 공통으로 쓰이는 path 정보를 @RequestMapping 로 클래스에 지정하고
 * 메소드에 역할별로 @GetMapping, @PostMapping, @PutMapping, @DeleteMapping 를 사용하면
 * 코드를 더 간결하게 짤 수 있다.
 *
 *  ===== gradle 로 실행시켜 보기 =====
 *  프로젝트 경로까지 이동
 *  ./gradlew build
 *  빌드 성공 시 , 해당 프로젝트 내 build/lib 경로에 빌드된 jar 파일이 생성됨. (SNAPSHOT.jar)
 *  터미널에서 실행해보자.
 *  java -jar ~~.jar
 *  Started ~~Application 이 뜬다면 localhost:8080 에서 확인해보자.
 *
 *
 * */


@Controller
@RequestMapping("/")
public class ScskController {

    /***
     *
     * @RequestMapping("/") + @GetMapping("scsk") 로 정의된 경로를 통해 "scsk" url 에 매핑된다.
     * spring 은 model(data:halo!!) 를 만들어주고 "scsk" 를 리턴한다.
     * "scsk" 를 리턴한다는 것은 resources/template/scsk 를 찾아 model 에 addAttribute 한
     * model(data:halo!!) 를 화면에 넘겨 렌더링 하라는 의미이다.
     * controller 에서 string 으로 리턴하게 되면 viewResolver 가 리턴받은 문자로 화면을 찾아 처리한다.
     */
    @GetMapping("scsk")
    public String scsk(Model model) {
        model.addAttribute("data", "halo!!");
        return "scsk";
    }

}


@Controller
public class MapController {

    @GetMapping("/map")
    public String showMap(Model model) {
        // 필요한 데이터를 모델에 추가
        return "map";
    }
}

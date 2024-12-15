package etag.idempotent.contoroller;


import etag.idempotent.contoroller.request.CreateMenuRequest;
import etag.idempotent.domain.Menu;
import etag.idempotent.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/menu")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping
    public String menuList(Model model) {
        return "create-menu";
    }

    @GetMapping("/name")
    public String getMenu(@RequestParam(name = "menuId", defaultValue = "1") long menuId,  Model model) {
        Menu menu = menuService.getMenuNameById(menuId);
        model.addAttribute("menu", menu);
        return "create-menu";
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateMenu(@RequestBody CreateMenuRequest request, Model model) {
        return ResponseEntity.ok("ok");
    }
}

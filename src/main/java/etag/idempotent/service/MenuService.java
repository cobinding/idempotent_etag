package etag.idempotent.service;

import etag.idempotent.domain.Menu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final ListMenuService listMenuService;

    public Menu getMenuNameById(Long id) {
        return listMenuService.getMenuNameById(id);
    }

}

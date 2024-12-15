package etag.idempotent.service;

import etag.idempotent.contoroller.repository.MenuRepository;
import etag.idempotent.domain.Menu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ListMenuService {

    private final MenuRepository menuRepository;

    public Menu getMenuNameById(Long id) {
        Menu menu = menuRepository.findById(id).orElse(null);
        return menu != null ? menu : null;
    }
}

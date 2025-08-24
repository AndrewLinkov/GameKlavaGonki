package hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

public class DriverHooks {

    // Настройка таймаута для взаимодействия с элементами перед запуском тестов
    @Before
    public void openWebSite(String url) {
        Configuration.timeout = 60000;
    }
}

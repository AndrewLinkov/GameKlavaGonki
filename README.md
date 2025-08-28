## GameKlavaGonki

### Описание
Набор автотестов для сайта klavogonki.ru: сценарий запускает игру, имитирует набор подсвеченных слов и проверяет, что гонка завершена и достигнута целевая скорость.

### Стек
- Java 15, Maven
- Cucumber (Gherkin) + JUnit 4 runner
- Selenide

### Структура
- `src/test/resources/scenarios/klavogonki.feature` — сценарий на Gherkin
- `src/test/java/steps/` — step definitions
- `src/test/java/hooks/` — хуки (настройки/скриншоты)
- `src/test/java/tests/CucumberRunnerTest.java` — JUnit‑раннер Cucumber

### Запуск
- Консоль: `mvn test`
- Из IDE: правый клик по `klavogonki.feature` или классу `CucumberRunnerTest` → Run

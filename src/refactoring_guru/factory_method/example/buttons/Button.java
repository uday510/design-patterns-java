package refactoring_guru.factory_method.example.buttons;

/**
 * EN: Common interface for all buttons.
 * <p>
 * RU: Общий интерфейс для всех продуктов.
 */
public interface Button {
  void render();

  void onClick();
}

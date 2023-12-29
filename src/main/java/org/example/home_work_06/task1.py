"""Создайте программу на Python или Java, которая принимает два списка чисел и
выполняет следующие действия:
a. Рассчитывает среднее значение каждого списка.
b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- ""Первый список имеет большее среднее значение"", если среднее значение
первого списка больше.
- ""Второй список имеет большее среднее значение"", если среднее значение
второго списка больше.
- ""Средние значения равны"", если средние значения списков равны.

Важно:
Приложение должно быть написано в соответствии с принципами
объектно-ориентированного программирования.
Используйте Pytest (для Python) или JUnit (для Java) для написания тестов,
которые проверяют правильность работы программы. Тесты должны учитывать
различные сценарии использования вашего приложения.
Используйте pylint (для Python) или Checkstyle (для Java) для проверки
качества кода.
Сгенерируйте отчет о покрытии кода тестами. Ваша цель - достичь минимум 90%
покрытия.

*Формат и требования к сдаче: *
Отчет о выполнении этого задания должен включать в себя следующие элементы:
- Код программы
- Код тестов
- Отчет pylint/Checkstyle
- Отчет о покрытии тестами
- Объяснение того, какие сценарии покрыты тестами и почему вы выбрали именно
эти сценарии."""

from statistics import mean


class ListComparator:
    """Класс для сравнения списков чисел"""
    @classmethod
    def compare_average(cls, lst1, lst2):
        """Принимает на вход два списка и сравнивает их средние значения.
        Возвращает сообщение о результате сравнения"""
        mean_list1 = mean(lst1)
        mean_list2 = mean(lst2)

        if mean_list1 > mean_list2:
            return "Первый список имеет большее среднее значение"
        elif mean_list2 > mean_list1:
            return "Второй список имеет большее среднее значение"
        else:
            return "Средние значения равны"
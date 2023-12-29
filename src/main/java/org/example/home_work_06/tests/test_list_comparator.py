"""Тесты для класса ListComparator в task1.py"""

from statistics import StatisticsError
from pytest import raises
from task1 import ListComparator


def test_compare_average_greater_first():
    """Тест случая первый список имеет большее среднее значение"""
    assert ListComparator.compare_average(
        [1, 2, 3], [1, 2, 2]) == "Первый список имеет большее среднее значение"


def test_compare_average_greater_second():
    """Тест случая второй список имеет большее среднее значение"""
    assert ListComparator.compare_average(
        [1, 2, 2], [1, 2, 3]) == "Второй список имеет большее среднее значение"


def test_compare_average_equal():
    """Тест случая средние значения равны"""
    assert ListComparator.compare_average(
        [1, 2, 3], [3, 2, 1]) == "Средние значения равны"


def test_compare_average_invalid_input_second():
    """Тест случая с не корректными данными в списке"""
    with raises(TypeError):
        ListComparator.compare_average([1, 2, 'b'], [1, 2, 3])


def test_compare_average_empty_list():
    """Тест случая с пустым списком"""
    with raises(StatisticsError):
        ListComparator.compare_average([], [1, 2, 3])

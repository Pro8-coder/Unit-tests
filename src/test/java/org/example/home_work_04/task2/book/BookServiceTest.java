//У вас есть класс BookService, который использует интерфейс BookRepository для получения
// информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService,
// используя Mockito для создания мок-объекта BookRepository.

package org.example.home_work_04.task2.book;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;


public class BookServiceTest {
    private BookService bookService;
    private BookRepository bookRepository;

    @Before
    public void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {
        // Устанавливаем поведение мок-объекта для метода findById
        when(bookRepository.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));

        // Выполняем метод, который тестируем
        Book result = bookService.findBookById("1");

        // Проверяем, что метод BookService вызывал метод findById у мок-объекта BookRepository
        verify(bookRepository).findById("1");

        // Проверяем результат
        assertThat(result.getId()).isEqualTo("1");
        assertThat(result.getTitle()).isEqualTo("Book1");
        assertThat(result.getAuthor()).isEqualTo("Author1");
    }

    @Test
    public void testFindAllBooks() {
        // Устанавливаем поведение мок-объекта для метода findAll
        when(bookRepository.findAll()).thenReturn(Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        ));

        // Выполняем метод, который тестируем
        List<Book> result = bookService.findAllBooks();

        // Проверяем, что метод BookService вызывал метод findAll у мок-объекта BookRepository
        verify(bookRepository).findAll();

        // Проверяем результат
        assertThat(result).hasSize(2)
                .extracting(Book::getId, Book::getTitle, Book::getAuthor)
                .contains(tuple("1", "Book1", "Author1"), tuple("2", "Book2", "Author2"));
    }
}

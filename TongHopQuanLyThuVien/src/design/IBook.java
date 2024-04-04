package design;

import entity.Book;

public interface IBook extends IGeneric<Book> {
    void searchByCategoryName(String categoryName);
    void sortByPriceDescending();
}

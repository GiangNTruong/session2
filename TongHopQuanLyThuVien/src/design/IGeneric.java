package design;

public interface IGeneric<T> {
    void displayAll();
    void addNew();
    void update();
    void changeStatus(int itemId, boolean newStatus);
    int findIdIndex(int itemId); // Thêm chức năng tìm kiếm IdIndex
}

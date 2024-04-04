package designImpl;

import design.ICategory;
import entity.Category;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryImpl implements ICategory {
    private static Scanner scanner = new Scanner(System.in);
    private List<Category> categories = new ArrayList<>();

    @Override
    public void displayAll() {
        for (Category category : categories) {
            System.out.println(category);
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập số lượng danh mục bạn muốn thêm:");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            Category newCategory = new Category();
            newCategory.inputCategory();
            categories.add(newCategory);
        }
    }

    @Override
    public void update() {
        displayAll();
        System.out.println("Chọn vị trí danh mục bạn muốn sửa:");
        int index = scanner.nextInt();
        if (index >= 0 && index < categories.size()) {
            System.out.println("Nhập thông tin mới cho danh mục:");
            Category updatedCategory = new Category();
            updatedCategory.inputCategory();
            categories.set(index, updatedCategory);
        }
    }

    @Override
    public void changeStatus(int itemId, boolean newStatus) {
        displayAll();
        System.out.println("Chọn vị trí danh mục bạn muốn thay đổi trạng thái:");
        int index = scanner.nextInt();
        if (index >= 0 && index < categories.size()) {
            Category category = categories.get(index);
            category.setStatus(newStatus);
        }
    }
    @Override
    public int findIdIndex(int itemId) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getId() == itemId) {
                return i;
            }
        }
        return -1;
    }
}

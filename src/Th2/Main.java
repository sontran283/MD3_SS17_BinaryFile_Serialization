package Th2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();
    private static List<Product> products;
    private static File file;


    public static void main(String[] args) throws IOException, ClassCastException, ClassNotFoundException {
        file = new File("src/Th2/productFile.txt");
        file.createNewFile();

        while (true) {
            System.out.println("*** menu ***");
            System.out.println("1_ them san pham");
            System.out.println("2_ hien thi pham");
            System.out.println("3_ tim kiem theo ten");
            System.out.println("4_ thoat");
            System.out.println("-->> moi nhap lua chon cua ban <<--");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProduct();
                    break;
                case 3:
                    searchByName();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private static void addProduct() {
        System.out.println("nhap so luong san pham muon them: ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("them moi san pham thu: " + (i + 1) + ", ");
            Product product = new Product();

            System.out.println("nhap ten san pham");
            product.setProductName(scanner.nextLine());

            System.out.println("nhap ten nha san xuat");
            product.setManufacturer(scanner.nextLine());

            System.out.println("nhap gia san pham");
            product.setPrice(Double.parseDouble(scanner.nextLine()));

            System.out.println("nhap mo ta san pham");
            product.setDescription(scanner.nextLine());

            productList.add(product);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(productList);
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void showProduct() {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println("danh sach san pham: ");
            for (Product product : products) {
                System.out.println(product);
            }
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            System.out.println("loi");
        }
    }

    private static void searchByName() {
        System.out.println("nhap ten san pham muon tim kiem");
        String name = scanner.nextLine();
        if (products != null) {
            for (Product product : products) {
                if (product.getProductName().contains(name)) {
                    System.out.println(product);
                }
            }
            System.out.println("khong tim thay san pham co ten: " + name);
        } else {
            System.out.println("Danh sách sản phẩm rỗng.");
        }
    }
}

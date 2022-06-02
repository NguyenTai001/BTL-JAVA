/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carDetail;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class CarDetail implements Serializable {
    private String id;
    private int amount;
    private double price;
    private LocalDate ngayNhap,ngayXuat;

    public CarDetail() {
    }

    public CarDetail(String id, LocalDate ngayNhap, LocalDate ngayXuat,int amount, double price) {
        this.id = id;
        this.price = price;
        this.ngayNhap = ngayNhap;
        this.ngayXuat = ngayXuat;
        this.amount=amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public LocalDate getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(LocalDate ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    @Override
    public String toString() {
        return "CarDetail{" + "id=" + id + ", amount=" + amount + ", price=" + price + ", ngayNhap=" + ngayNhap + ", ngayXuat=" + ngayXuat + '}';
    }

}

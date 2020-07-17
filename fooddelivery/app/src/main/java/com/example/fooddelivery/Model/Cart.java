package com.example.fooddelivery.Model;

public class Cart {
    private String pid, pname, priceSmall, priceMedium, priceLarge, quantitySmall, quantityMedium, quantityLarge, discount;

    public Cart() {
    }

    public Cart(String pid, String pname, String priceSmall, String priceMedium, String priceLarge, String quantitySmall, String quantityMedium, String quantityLarge, String discount) {
        this.pid = pid;
        this.pname = pname;
        this.priceSmall = priceSmall;
        this.priceMedium = priceMedium;
        this.priceLarge = priceLarge;
        this.quantitySmall = quantitySmall;
        this.quantityMedium = quantityMedium;
        this.quantityLarge = quantityLarge;
        this.discount = discount;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPriceSmall() {
        return priceSmall;
    }

    public String getPriceMedium() {
        return priceMedium;
    }

    public String getPriceLarge() {
        return priceLarge;
    }

    public void setPriceSmall(String price) {
        this.priceSmall = price;
    }

    public void setPriceMedium(String price) {
        this.priceMedium = price;
    }

    public void setPriceLarge(String price) {
        this.priceLarge = price;
    }

    public String getQuantitySmall() {
        return quantitySmall;
    }

    public String getQuantityMedium() {
        return quantityMedium;
    }

    public String getQuantityLarge() {
        return quantityLarge;
    }

    public void setQuantitySmall(String quantity) {
        this.quantitySmall = quantity;
    }

    public void setQuantityMedium(String quantity) {
        this.quantityMedium = quantity;
    }

    public void setQuantityLarge(String quantity) {
        this.quantityLarge = quantity;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}

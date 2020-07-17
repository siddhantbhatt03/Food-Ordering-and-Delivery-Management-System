package com.example.fooddelivery.Model;

public class Products {
    private String pname, priceSmall, priceMedium, priceLarge, image, category, pid, date, time;

    public Products()
    {

    }

    public Products(String pname, String priceSmall, String priceMedium, String priceLarge, String image, String category, String pid, String date, String time) {
        this.pname = pname;
        this.priceSmall = priceSmall;
        this.priceMedium = priceMedium;
        this.priceLarge = priceLarge;
        this.image = image;
        this.category = category;
        this.pid = pid;
        this.date = date;
        this.time = time;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

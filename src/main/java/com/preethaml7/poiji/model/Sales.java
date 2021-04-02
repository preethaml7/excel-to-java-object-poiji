package com.preethaml7.poiji.model;

import com.poiji.annotation.ExcelCellName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Sales {

    @ExcelCellName("Order_ID")
    private String orderId;

    @ExcelCellName("Order_Date")
    private String orderDate;

    @ExcelCellName("Ship_Date")
    private String shipDate;

    @ExcelCellName("Ship_Mode")
    private String shipMode;

    @ExcelCellName("Customer_ID")
    private String customerId;

    @ExcelCellName("Customer_Name")
    private String customerName;

    @ExcelCellName("Segment")
    private String segment;

    @ExcelCellName("Country")
    private String country;

    @ExcelCellName("City")
    private String city;

    @ExcelCellName("State")
    private String state;

    @ExcelCellName("Postal_Code")
    private String postalCode;

    @ExcelCellName("Region")
    private String region;

    @ExcelCellName("Product_ID")
    private String productId;

    @ExcelCellName("Category")
    private String category;

    @ExcelCellName("Sub_Category")
    private String subCategory;

    @ExcelCellName("Product_Name")
    private String productName;

    @ExcelCellName("Sales")
    private String sales;

    @ExcelCellName("Quantity")
    private String quantity;

    @ExcelCellName("Discount")
    private String discount;

    @ExcelCellName("Profit")
    private String profit;

}

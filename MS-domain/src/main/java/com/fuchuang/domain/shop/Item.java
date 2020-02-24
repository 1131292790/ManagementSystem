package com.fuchuang.domain.shop;

import java.io.Serializable;

public class Item implements Serializable {

    private static final long serialVersionUID = -3697428699777976998L;

    private String itemId;
    private int itemPrice;
    private String itemType;
    private String itemDesc;
    private int inventory;
    private String itemName;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemType='" + itemType + '\'' +
                ", itemDesc='" + itemDesc + '\'' +
                ", inventory=" + inventory +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}

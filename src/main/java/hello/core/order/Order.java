package hello.core.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discouintPrice;

    public Order(Long memberId, String itemName, int itemPrice, int discouintPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discouintPrice = discouintPrice;
    }

    // 비즈니스 로직
    public int calculatePrice() {
            return itemPrice - discouintPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscouintPrice() {
        return discouintPrice;
    }

    public void setDiscouintPrice(int discouintPrice) {
        this.discouintPrice = discouintPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discouintPrice=" + discouintPrice +
                '}';
    }
}

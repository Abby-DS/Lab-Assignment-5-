
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GiftList list = new GiftList();
		System.out.println("\t----Adding gifts----");
		
		for(int i=0; i<3; i++) {
			GiftBasket basket = new GiftBasket(i+1, "Small", + 500.0f);
			list.addGiftBasketToEnd(basket);
		}
		list.showAllGiftBaskets();
	}
}

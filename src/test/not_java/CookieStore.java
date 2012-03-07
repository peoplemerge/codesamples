

import java.util.ArrayList;
import java.util.List;

public class CookieStore {

	private volatile int cash = 100;
	private int revenue = 0;
	private int expenses = 0;

	private boolean isOpen;

	private List<Item> cookies = new ArrayList<Item>();

	public void openForBusiness() {
		isOpen = true;
	}

	public Item completeSale(Customer c) {
		Item myFavorite = cookies.remove(0);
		try {
			c.purchaseGoods(myFavorite);
		} catch (ImBrokeException e) {
			cookies.add(myFavorite);
			return null;
		}
		int price = myFavorite.getPrice();
		cash += price;
		revenue += price;
		return myFavorite;
	}

	public void purchaseGoods(Item o) throws ImBrokeException {
		int cost = o.getCost();
		if (cost > cash) {
			throw new ImBrokeException();
		}
		cash -= cost;
		expenses += cost;
		cookies.add(o);
	}

	public void fileTaxes() {
	}

	public void closeForBusiness() {
		isOpen = false;
	}

}

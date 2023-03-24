
public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Arçelik kahve makinesi");
		product1.setGorselUrl("gorsel1.jpg");
		product1.setIndirimOranı(5);
		product1.setStok(6);

		Product product2 = new Product();
		product2.setName("Beko kahve makinesi");
		product2.setGorselUrl("gorsel2.jpg");
		product2.setIndirimOranı(7);
		product2.setStok(3);

		Product[] products = { product1, product2 };
		for (Product product : products) {
			System.out.println(product.getName());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Eslem");
		individualCustomer.setLastName("Yıldız");
		individualCustomer.setId(1654);
		individualCustomer.setPhone("0522222222");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("kodlama");
		corporateCustomer.setCustomerNumber("15896");
		corporateCustomer.setId(79564);
		corporateCustomer.setPhone("0524665565");
		corporateCustomer.setTaxNumber("55621656");

		Customer[] customer = { individualCustomer, corporateCustomer };
		for (Customer customers : customer) {
			System.out.println(customers.getCustomerNumber());
		}
	}

}

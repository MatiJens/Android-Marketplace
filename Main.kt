import Classes.Buyer
import Classes.Seller

fun main() {
    val buyer1 = Buyer(1, "buyer1", "123@123", "26.03")
    val seller1 = Seller(2, "seller1", "1234@1234", "26.03")
    val seller2 = Seller(3, "seller2", "123555@1234", "27.03")
    seller1.newOffer("marchew", 3.5, 3, "swieza i zdrowa")
    seller2.newOffer("jablko", 1.5, 10, "jonagold")
    buyer1.showOffers()
}
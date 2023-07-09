public class App {
    void printProductPrice(Order order) {
        /*
        Double totalPrice = order.getPrice() * order.getQuantity() - 
        order.getOffer() + order.getShipping() * 2;
        */

        // calcular precio total

        // 1. precio de los productos
        Double quantityPrice = order.getPrice() * order.getQuantity();
        
        // 2. descuento
        Double offerPrice = order.getPrice() * order.getOffer();
        
        // 3. calcular precio producto}; con eI descuento incluido
        Double finalPrice = quantityPrice - offerPrice;

        // 4. precio envio
        Double shippingCost = 0.0;
        if  (finalPrice < 50) {
            shippingCost = 2.99;
        }
        // precio definitivo
        System.out.println(finalPrice + shippingCost);

        
    }
}

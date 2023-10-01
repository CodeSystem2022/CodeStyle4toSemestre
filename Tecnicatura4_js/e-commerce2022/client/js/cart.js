/*mi tarea*/
<div class="total-price">Total: ${total}</div>;
<button class="btn-primary" id="checkout-btn"> go to checkout</button>;
<div id="button-checkout"></div>;
/*no tarea mia*/
modalConatiner.append(modalFooter);
/*no tarea mia*/

/*mi tarea*/
//mp;
const mercadopago = new MercadoPago("publi_key", {
locale: "es-AR", // The most common are: 'pt-BR', 'es-AR' and 'en-US'
});

const checkoutButton = modalFooter.querySelector("#checkout-btn");

/*Código de mercado pago: mi tarea*/
checkoutButton.addEventListener("clik", function (){
    checkoutButton.remove();

    const orderData = {
        quantity: 1,
        description: "compra de ecommerce",
        price: total,       
    };
    fetch("http://localhost:8080/create_preference",{
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(orderData),
    })
    .then(function(response)){
        return response.json();
    }/*minuto 2.55 del video 6*/
})
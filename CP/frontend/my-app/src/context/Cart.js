import { useState, createContext, useContext } from 'react';


const defaultCart = {
    items: []
}


export const CartContext = createContext();

export function useCartState() {
    const [cart, updateCart] = useState(defaultCart);


    function addToCart({name, gameImage, quantity, price})
    {

        let item = {}
        item.productName = name;
        item.gameImageUrl = gameImage;
        item.quantity = quantity;
        item.price = price;
        console.log(item)

        updateCart((prev) => {
            let cart = {...prev};
            cart.items.push(item)
            return cart;
        })

    }



    return {
        cart,
        addToCart
    }

}


export function useCart() {
    const cart = useContext(CartContext);
    return cart;
}

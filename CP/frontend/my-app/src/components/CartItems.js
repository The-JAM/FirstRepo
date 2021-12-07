import React from "react";
import {Card, Image} from "react-bootstrap";

function CartItems({items})
{
    return (
        <Card style={{flex: 1, width: '23rem', color: "#ea6716", backgroundColor: "#1b5633", margin: "25px" }}>
            <Image  style={{width: "100%",  height: "16vw", objectFit: "cover"}} src={items.gameImageUrl} />
            <Card.Body>
                <Card.Title>{items.productName}</Card.Title>
                <hr/>
                <Card.Text>Quantity {items.quantity}</Card.Text>
                <Card.Text>Price {items.price}</Card.Text>
            </Card.Body>
        </Card>
    );

}

export default CartItems;
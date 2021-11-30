import React from "react";
import {Image, Nav, Navbar} from "react-bootstrap";
import store_icon from "../assets/store_icon.png";
import cart_image from "../assets/cart_image.png"

class Header extends React.Component {
    render() {
        return (
            <Navbar className="justify-content-center">
                <Nav.Link  href="/register">Register</Nav.Link>
                <Nav.Link href="/">Store</Nav.Link>
                <Navbar.Brand  pullLeft href="/"><Image src={store_icon} alt="Logo"/></Navbar.Brand>
                <Nav.Link  href="/cart"><Image src={cart_image} alt="Cart"/></Nav.Link>
                <Nav.Link  href="/login"> Login</Nav.Link>
            </Navbar>
        )
    }
}

export default Header;


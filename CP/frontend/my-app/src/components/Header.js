import React from "react";
import {Container, Image, Nav, Navbar} from "react-bootstrap";
import store_icon from "../assets/store_icon.png";
import cart_image from "../assets/cart_image.png"

class Header extends React.Component {
    render() {
        return (
            <Navbar bg="dark" variant="dark">
                <Container>
                    <Navbar.Brand href="/"><Image src={store_icon} alt="Logo"/></Navbar.Brand>
                    <Nav className="me-auto">
                        <Nav.Link href="/">Home</Nav.Link>
                        <Nav.Link href="/cart"><Image src={cart_image} alt="Cart"/></Nav.Link>
                    </Nav>
                </Container>
            </Navbar>
        )
    }
};

export default Header;


import './App.css';
import {AuthProvider} from "./context/AuthContext";
import {Card, Container} from "react-bootstrap";
import {BrowserRouter, Route, Switch} from "react-router-dom";
import Login from "./pages/Login";
import Register from "./pages/Register";
import Home from "./pages/Home";
import {CartContext, useCartState} from "./context/Cart";
import Header from "./components/Header";
import React from "react";

function App() {
    const cart = useCartState();

    return (

        <CartContext.Provider value={cart}>
          <AuthProvider>
              <Header/>
              <Container>
              <BrowserRouter>
                <Switch>
                    <Route  exact path="/" component={Home}/>
                    <Route exact path="/login" component={Login}/>
                    <Route exact path="/register" component={Register} />
                </Switch>
              </BrowserRouter>
            </Container>
          </AuthProvider>
        </CartContext.Provider>
  );
}

export default App;

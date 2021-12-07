import './App.css';
import {AuthProvider} from "./context/AuthContext";
import { Container} from "react-bootstrap";
import {BrowserRouter, Route, Switch} from "react-router-dom";
import Login from "./pages/Login";
import Register from "./pages/Register";
import Home from "./pages/Home";
import Cart from "./context/Cart";
import Header from "./components/Header";
import React from "react";

function App() {
    return (

          <AuthProvider>
              <Header/>
              <Container>
              <BrowserRouter>
                <Switch>
                    <Route  exact path="/" component={Home}/>
                    <Route exact path="/login" component={Login}/>
                    <Route exact path="/register" component={Register} />
                    <Route exact path="/cart" component={Cart} />

                </Switch>
              </BrowserRouter>
            </Container>
          </AuthProvider>
  );
}

export default App;

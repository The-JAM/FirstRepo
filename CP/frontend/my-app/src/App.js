import './App.css';
import {AuthProvider} from "./context/AuthContext";
import {Container} from "react-bootstrap";
import {BrowserRouter, Route, Switch} from "react-router-dom";
import Login from "./pages/Login";
import PrivateRoute from "./components/PrivateRoute";
import Register from "./pages/Register";
import Home from "./pages/Home";

function App() {
  return (
      <AuthProvider>
        <Container>
          <BrowserRouter>
            <Switch>
                <Route  exact path="/" component={Home}>
                </Route>
                <Route exact path="/login" component={Login}>
                </Route>
                <Route exact path="/register" component={Register} >
                </Route>
            </Switch>
          </BrowserRouter>
        </Container>
      </AuthProvider>
  );
}

export default App;

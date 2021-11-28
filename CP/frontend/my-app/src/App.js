import logo from './logo.svg';
import './App.css';
import {AuthProvider} from "./context/AuthContext";
import {Container} from "react-bootstrap";
import {BrowserRouter, Switch} from "react-router-dom";
import PublicRoute from "./components/PublicRoute";
import Login from "./pages/Login";
import PrivateRoute from "./components/PrivateRoute";

function App() {
  return (
      <AuthProvider>
        <Container>
          <BrowserRouter>
            <Switch>
              <PublicRoute path="/login" component={Login}>
                <Login />
              </PublicRoute>
              <PublicRoute path="/"  >
              </PublicRoute>
            </Switch>
          </BrowserRouter>
        </Container>
      </AuthProvider>
  );
}

export default App;

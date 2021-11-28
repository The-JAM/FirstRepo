import {Route, Redirect } from 'react-router-dom';
import {useContext} from "react";
import {AuthContext} from "../context/AuthContext";

function PrivateRoute({ component: Component, ...rest }) {

    let { currentUser } = useContext(AuthContext);
    if(currentUser!= null && currentUser.length > 0)
    {
        localStorage.setItem("user", JSON.stringify(currentUser));

    }

    let localStorageItem = localStorage.getItem("user")

    return (

        <Route
            {...rest}
            render={ props => localStorageItem ? (<Component {...props} />)
                : (<Redirect to={{pathname: '/login'}}/>)
            }
        />
    );
}

export default PrivateRoute;
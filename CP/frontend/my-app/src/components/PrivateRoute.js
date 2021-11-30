import {useContext} from "react";
import {AuthContext} from "../context/AuthContext";
import React from 'react';
import { Route, Redirect } from 'react-router-dom';

const PrivateRoute = ({component: Component, ...rest}) => {

    const { currentUser } = useContext(AuthContext);
    if(currentUser!= null && currentUser.length > 0)
    {
        localStorage.setItem("user", JSON.stringify(currentUser));
    }

    let localStorageItem = localStorage.getItem("user");
    return (

        // Show the component only when the user is logged in
        // Otherwise, redirect the user to /signin page
        <Route {...rest} render={props => (
            localStorageItem ?
                <Redirect to="/" />
                : <Component {...props} />
        )} />
    );
};

export default PrivateRoute;
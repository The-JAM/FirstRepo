import {
    Route,
    Redirect
} from 'react-router-dom';
import {useContext} from "react";
import {AuthContext} from "../context/AuthContext";

function PublicRoute({ children, ...rest }) {

    const { currentUser } = useContext(AuthContext);
    if(currentUser!= null && currentUser.length > 0)
    {
        localStorage.setItem("user", JSON.stringify(currentUser));
    }

    let localStorageItem = localStorage.getItem("user")

    return (
        <Route
            {...rest}
            render={
                ({ location }) => (
                    !localStorageItem ?(
                        children
                    ) : (
                        <Redirect
                            to={{
                                pathname: '/',
                                state: { from: location }
                            }}
                        />
                    ))
            }
        />
    );
}

export default PublicRoute;
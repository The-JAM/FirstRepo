import React, { Component } from "react";
import {Button, Container, Form} from "react-bootstrap";
import {AuthContext} from "../context/AuthContext";
import {withRouter} from "react-router-dom";

class Login extends Component {

    static contextType = AuthContext;
    constructor(props) {
        super(props);
        this.usernameRef = React.createRef();
        this.passwordRef = React.createRef();
        this.handleSubmit = this.handleSubmit.bind(this);

    }

    // componentDidMount() {
    //     let user = JSON.parse(localStorage.getItem("user"));
    //     if(user)
    //         this.props.history.push("/home");
    // }


    async handleSubmit(evt){
        const context = this.context;
        evt.preventDefault();
        await context.signIn(this.usernameRef.current.value, this.passwordRef.current.value);
        this.props.history.push("/home");
    }
    render() {
        return (
            <Container style={{
                position: 'absolute', left: '50%', top: '50%',
                transform: 'translate(-50%, -50%)'
            }}>
            <Form >
                <h3 style={{
                    textAlign:"center"
                }} >Sign In</h3>

                <Form.Group id="username" className="mb-3">
                    <Form.Label>Username</Form.Label>
                    <Form.Control type="text" required ref={this.usernameRef} />
                </Form.Group>
                <Form.Group id="password" className="mb-3">
                    <Form.Label>Password</Form.Label>
                    <Form.Control type="password" required ref={this.passwordRef} />
                </Form.Group>

                <Form.Group className="form-group">
                    <div className="custom-control custom-checkbox">
                        <input type="checkbox" className="custom-control-input" id="customCheck1" />
                        <label className="custom-control-label" htmlFor="customCheck1">Remember me</label>
                    </div>
                </Form.Group>
               <div className="p-2">
                   <Form.Group>
                       <Button onClick={this.handleSubmit} type="submit" className="btn btn-primary btn-block w-100 ">Submit</Button>
                   </Form.Group>

                   <p className="forgot-password text-right">
                       Forgot <a href="https://www.google.com/">password?</a>
                   </p>
               </div>


            </Form>
            </Container>
        );
    }
}

export default  withRouter(Login);
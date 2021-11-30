import React from 'react';
import {Button, Card, Col, Container, ListGroup} from "react-bootstrap";
import { Row } from 'react-bootstrap';
import ReactStars from "./StarRating";

function Games({games, isSelected}) {
    let game_platforms = games.parent_platforms;
    const gameRating = ((games.rating * (1 / 10)) / 2) * 10; // converting game to an avg out of 5 stars

    const starSetting = {
        size: 30,
        count: gameRating,
        char: '👾' ,
        color1: '#ff9900',
    }

    let gamesId = games.id;
    let game_image = games.background_image;


    // if we havent selected a move render all games
    if (isSelected === false) {
        return (

            <Col  md={4} sm={6} className="d-flex align-items-stretch ">
                <Card className="m-2" style={{flex: 1, width: '18rem', color: "#ea6716", backgroundColor: "#1b5633" }}>
                    <Card.Img variant="top" style={{width: "100%",  height: "16vw", objectFit: "cover"}} src={game_image}
                              className="mx-auto" />
                    <Card.Body>
                        <Card.Title>{games.name}</Card.Title>
                        <hr/>
                        <div>
                            <ReactStars {...starSetting}/>
                        </div>
                        <Card.Subtitle>Platforms:</Card.Subtitle>
                        <br/>
                        <ListGroup variant="flush">
                            {
                                 game_platforms.slice(0,3).map((platform) => <ListGroup.Item style={{color: "#1b5633", backgroundColor: "#ea6716"}}>{platform.platform.name}</ListGroup.Item>)
                            }
                        </ListGroup>
                        <hr/>
                        <Card.Text>
                            <div>
                               <Button style={{color: "#1b5633", backgroundColor: "#ea6716", borderColor:"#ea6716"}}> Add to Cart</Button>
                            </div>
                        </Card.Text>
                    </Card.Body>
                </Card>
            </Col>
        );
    }
}

export default Games;

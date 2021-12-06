import {Component} from "react";
import axios from "axios";
import {Row} from "react-bootstrap";
import Games from "../components/Games";
import {withRouter} from "react-router-dom";

class Home extends  Component
{

    constructor(props) {
        super(props);
        this.isSelected = props.isSelected;
        this.state = {
            games: []
        }
    }


    componentDidMount() {

        const getGames = async () => {

            const GAME_LIBRARY_URL = `https://api.rawg.io/api/games?key=${process.env["REACT_APP_API_KEY"]}`
            await axios.get(GAME_LIBRARY_URL)
                .then(response => {
                    this.setState({games: response.data.results});

                }).catch((err) => {
                    console.log("Fetch Error: " + err)
                });

        }


        getGames()

    }

    onClick(evt)
    {
        console.log(evt.value)
        // let gamesId = games.id;
        // let game_image = games.background_image;
        // let game_price = createPrice();
        // let game_title = games.name;
        // let quantity = 1;
        // addToCart({game_title, game_image,quantity,game_price})
    }


    render() {
        return(
            <Row>
                {
                    this.state.games.map((game,i) => <Games games={game} onClick={this.onClick.bind(this,game)} isSelected={false} key={i}  /> )
                }
            </Row>

        );


    }

}

export default withRouter(Home);
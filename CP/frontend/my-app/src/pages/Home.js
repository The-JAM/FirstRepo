import {Component} from "react";
import axios from "axios";
import {Row} from "react-bootstrap";
import Games, {createPrice} from "../components/Games";
import {withRouter} from "react-router-dom";

class Home extends  Component
{

    constructor(props) {
        super(props);
        this.isSelected = props.isSelected;
        this.state = {
            games: [],
            cart : []
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

        function isItemFound(item, cart) {
            let value = false;
            let index  = -1;
            for (let i = 0; i < cart.length; i++) {
               if(cart[i].productName === item.productName)
               {
                   value = true;
                   index = i;
               }
            }

            return [value , index]
        }
        let gamesId = evt.id;
        let game_image = evt.background_image;
        let game_price = createPrice();
        let game_title = evt.name;
        let quantity = 1;
        let item = {}
        item.productName = game_title;
        item.gameImageUrl = game_image;
        item.quantity = quantity;
        item.price = game_price;

        if (sessionStorage.length !== 0)
        {
           this.state.cart =  JSON.parse(sessionStorage.getItem("items"))
        }

        let currentlyFound = isItemFound(item,this.state.cart)[0]


        if (currentlyFound)
        {
            let itemIndex  = isItemFound(item,this.state.cart)[1]
            this.state.cart[itemIndex].quantity += 1;
        }
        else
            this.state.cart.push(item)

        sessionStorage.setItem("items", JSON.stringify(this.state.cart));

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